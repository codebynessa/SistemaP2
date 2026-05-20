/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.Pagamento;
import br.unigran.domain.repositories.PagamentoRepository;
import br.unigran.infra.repository.PagamentoRepositoryimpl;
import java.util.List;

/**
 *
 * @author vanes
 */
public class GerenciarPagamentoUC {

    private Boolean atualizar = false;
    private final PagamentoRepository repository = new PagamentoRepositoryimpl();

    public String salvarPagamento(Pagamento pagamento) throws Exception {
        atualizar = false;
        valida(pagamento);
        repository.salvar(pagamento);
        return "Pagamento registrado com sucesso";
    }

    public String atualizar(Pagamento pagamento) throws Exception {
        atualizar = true;
        valida(pagamento);
        repository.salvar(pagamento);
        return "Pagamento atualizado com sucesso";
    }

    public List listarTodos() {
        return repository.listar("From Pagamento", null);
    }

    public void valida(Pagamento pagamento) throws Exception {
  

        if (pagamento.getValor() <= 0) {
            throw new Exception("Valor inválido");
        }

        if (atualizar && pagamento.getId() == null) {
            throw new Exception("Id vazio");
        }
    }
}