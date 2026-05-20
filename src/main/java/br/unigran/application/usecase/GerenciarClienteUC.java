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
    private final ClienteRepository repository = new ClienteRepositoryimpl();

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

    public void valida(Cliente cliente) throws Exception {
        if (cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new Exception("Nome vazio");
        }

        if (atualizar && cliente.getId() == null) {
            throw new Exception("Id vazio");
        }
    }
}