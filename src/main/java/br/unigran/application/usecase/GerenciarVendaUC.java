/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.Venda;
import br.unigran.domain.repositories.VendaRepository;
import br.unigran.infra.repository.VendaRepositoryimpl;
import java.util.List;

/**
 *
 * @author vanes
 */
public class GerenciarVendaUC {

    private final VendaRepository repository;

    public GerenciarVendaUC() {
        this.repository = new VendaRepositoryimpl();
    }

    public String salvarVenda(Venda venda) throws Exception {

        if (venda.getDataVenda() == null) {
            throw new Exception("Data da venda vazia");
        }

        if (venda.getValorTotal() < 0) {
            throw new Exception("Valor total inválido");
        }

        if (venda.getUsuario() == null || venda.getUsuario().getId() == null) {
            throw new Exception("Usuário vazio");
        }

        if (venda.getCliente() == null || venda.getCliente().getId() == null) {
            throw new Exception("Cliente vazio");
        }

        repository.salvar(venda);

        return "Venda salva com sucesso";
    }

    public List<Venda> listarTodos() {
        return repository.listarTodos();
    }
}
