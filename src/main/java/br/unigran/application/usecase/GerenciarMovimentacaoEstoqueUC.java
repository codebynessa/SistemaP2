/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.MovimentacaoEstoque;
import br.unigran.domain.repositories.MovimentacaoEstoqueRepository;
import br.unigran.infra.repository.MovimentacaoEstoqueRepositoryimpl;

/**
 *
 * @author vanes
 */
public class GerenciarMovimentacaoEstoqueUC {

    MovimentacaoEstoqueRepository repository = new MovimentacaoEstoqueRepositoryimpl();

    public void salvarMovimentacao(MovimentacaoEstoque movimentacao) throws Exception {

        if (movimentacao.getDataMovimentacao() == null) {
            throw new Exception("Data da movimentação vazia");
        }

        if (movimentacao.getTipo() == null || movimentacao.getTipo().isBlank()) {
            throw new Exception("Tipo vazio");
        }

        if (movimentacao.getQuantidade() <= 0) {
            throw new Exception("Quantidade inválida");
        }

        if (movimentacao.getProduto() == null || movimentacao.getProduto().getId() == null) {
            throw new Exception("Produto vazio");
        }

        repository.salvar(movimentacao);
    }

    public void atualizar(MovimentacaoEstoque movimentacao) throws Exception {

        if (movimentacao.getId() == null) {
            throw new Exception("Id vazio");
        }

        repository.salvar(movimentacao);
    }

    public void remover(MovimentacaoEstoque movimentacao) throws Exception {

        if (movimentacao.getId() == null) {
            throw new Exception("Id vazio");
        }

        repository.remover(movimentacao);
    }
}
