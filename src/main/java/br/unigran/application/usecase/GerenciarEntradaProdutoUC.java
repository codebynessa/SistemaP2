/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.EntradaProduto;
import br.unigran.domain.repositories.EntradaProdutoRepository;
import br.unigran.infra.repository.EntradaProdutoRepositoryimpl;

/**
 *
 * @author vanes
 */
public class GerenciarEntradaProdutoUC {

    EntradaProdutoRepository repository = new EntradaProdutoRepositoryimpl();

    public void salvarEntradaProduto(EntradaProduto entradaProduto) throws Exception {

        if (entradaProduto.getDataEntrada() == null) {
            throw new Exception("Data de entrada vazia");
        }

        if (entradaProduto.getFornecedor() == null || entradaProduto.getFornecedor().getId() == null) {
            throw new Exception("Fornecedor vazio");
        }

        if (entradaProduto.getUsuario() == null || entradaProduto.getUsuario().getId() == null) {
            throw new Exception("Usuário vazio");
        }

        if (entradaProduto.getValorTotal() < 0) {
            throw new Exception("Valor total inválido");
        }

        repository.salvar(entradaProduto);
    }

    public void atualizar(EntradaProduto entradaProduto) throws Exception {

        if (entradaProduto.getId() == null) {
            throw new Exception("Id vazio");
        }

        repository.salvar(entradaProduto);
    }

    public void remover(EntradaProduto entradaProduto) throws Exception {

        if (entradaProduto.getId() == null) {
            throw new Exception("Id vazio");
        }

        repository.remover(entradaProduto);
    }
}