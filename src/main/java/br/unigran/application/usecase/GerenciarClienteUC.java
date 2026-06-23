/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.Cliente;
import br.unigran.domain.repositories.ClienteRepository;
import br.unigran.infra.repository.ClienteRepositoryimpl;
import java.util.List;

/**
 *
 * @author vanes
 */
public class GerenciarClienteUC {
    
      private Boolean atualizar = false;
    private final ClienteRepository repository;

    public GerenciarClienteUC() {
        this.repository = new ClienteRepositoryimpl();
    }

    public String salvarCliente(Cliente cliente) throws Exception {
        atualizar = false;
        valida(cliente);
        repository.salvar(cliente);
        return "Cliente cadastrado com sucesso";
    }

    public String atualizar(Cliente cliente) throws Exception {
        atualizar = true;
        valida(cliente);
        repository.salvar(cliente);
        return "Cliente atualizado com sucesso";
    }

    public List<Cliente> listarTodos() {
        return repository.listarTodos();
    }
        public void remover(Cliente cliente) throws Exception {

    if (cliente.getId() == null) {
        throw new Exception("Id vazio");
    }

    repository.remover(cliente);
}


public void valida(Cliente cliente) throws Exception {
    if (cliente.getNome() == null || cliente.getNome().isBlank()) {
        throw new Exception("Nome vazio");
    }

    if (cliente.getCpf() == null || cliente.getCpf().isBlank()) {
        throw new Exception("CPF vazio");
    }

    String cpf = cliente.getCpf().replace(".", "").replace("-", "").trim();

    if (cpf.length() != 11) {
        throw new Exception("CPF inválido");
    }

    if (!cpf.matches("[0-9]+")) {
        throw new Exception("CPF deve conter apenas números");
    }

    if (cliente.getTelefone() == null || cliente.getTelefone().isBlank()) {
        throw new Exception("Telefone vazio");
    }

    String telefone = cliente.getTelefone()
            .replace("(", "")
            .replace(")", "")
            .replace("-", "")
            .replace(" ", "")
            .trim();

    if (telefone.length() < 10 || telefone.length() > 11) {
        throw new Exception("Telefone inválido");
    }

    if (!telefone.matches("[0-9]+")) {
        throw new Exception("Telefone deve conter apenas números");
    }

    if (atualizar && cliente.getId() == null) {
        throw new Exception("Id vazio");
    }
}
}