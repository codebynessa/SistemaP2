/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.Fornecedor;
import br.unigran.domain.repositories.FornecedorRepository;
import br.unigran.infra.repository.FornecedorRepositoryimpl;

/**
 *
 * @author vanes
 */
public class GerenciarFornecedorUC {

    FornecedorRepository repository = new FornecedorRepositoryimpl();

    public void salvarFornecedor(Fornecedor fornecedor) throws Exception {

        if (fornecedor.getNome() == null || fornecedor.getNome().isBlank()) {
            throw new Exception("Nome vazio");
        }

        if (fornecedor.getCnpj() == null || fornecedor.getCnpj().isBlank()) {
            throw new Exception("CNPJ vazio");
        }

        repository.salvar(fornecedor);
    }

    public void atualizar(Fornecedor fornecedor) throws Exception {

        if (fornecedor.getId() == null) {
            throw new Exception("Id vazio");
        }

        if (fornecedor.getNome() == null || fornecedor.getNome().isBlank()) {
            throw new Exception("Nome vazio");
        }

        repository.salvar(fornecedor);
    }

    public void remover(Fornecedor fornecedor) throws Exception {

        if (fornecedor.getId() == null) {
            throw new Exception("Id vazio");
        }

        repository.remover(fornecedor);
    }
}