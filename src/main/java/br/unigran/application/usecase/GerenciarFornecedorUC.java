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

       private final FornecedorRepository repository;

    public GerenciarFornecedorUC() {
        this.repository = new FornecedorRepositoryimpl();
    }

    public void salvarFornecedor(Fornecedor fornecedor) throws Exception {
        validar(fornecedor);
        repository.salvar(fornecedor);
    }

    public void atualizar(Fornecedor fornecedor) throws Exception {
        if (fornecedor.getId() == null) {
            throw new Exception("Id vazio");
        }

        validar(fornecedor);
        repository.salvar(fornecedor);
    }

    public void remover(Fornecedor fornecedor) throws Exception {
        if (fornecedor.getId() == null) {
            throw new Exception("Id vazio");
        }

        repository.remover(fornecedor);
    }

    public java.util.List<Fornecedor> listarTodos() {
        return repository.listarTodos();
    }

    private void validar(Fornecedor fornecedor) throws Exception {
        if (fornecedor.getNome() == null || fornecedor.getNome().isBlank()) {
            throw new Exception("Nome vazio");
        }

        if (fornecedor.getCnpj() == null || fornecedor.getCnpj().isBlank()) {
            throw new Exception("CNPJ vazio");
        }

        if (!validarCNPJ(fornecedor.getCnpj())) {
            throw new Exception("CNPJ inválido");
        }

        if (fornecedor.getTelefone() == null || fornecedor.getTelefone().isBlank()) {
            throw new Exception("Telefone vazio");
        }

        if (!validarTelefone(fornecedor.getTelefone())) {
            throw new Exception("Telefone inválido");
        }
    }

    private boolean validarTelefone(String telefone) {
        String numero = telefone
                .replace("(", "")
                .replace(")", "")
                .replace("-", "")
                .replace(" ", "")
                .trim();

        return numero.matches("[0-9]+") && (numero.length() == 10 || numero.length() == 11);
    }

    private boolean validarCNPJ(String cnpj) {
        cnpj = cnpj
                .replace(".", "")
                .replace("/", "")
                .replace("-", "")
                .trim();

        if (!cnpj.matches("[0-9]+")) {
            return false;
        }

        if (cnpj.length() != 14) {
            return false;
        }

        if (cnpj.matches("(\\d)\\1{13}")) {
            return false;
        }

        int[] peso1 = {5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};
        int[] peso2 = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

        int soma = 0;

        for (int i = 0; i < 12; i++) {
            soma += Character.getNumericValue(cnpj.charAt(i)) * peso1[i];
        }

        int resto = soma % 11;
        int digito1 = resto < 2 ? 0 : 11 - resto;

        if (digito1 != Character.getNumericValue(cnpj.charAt(12))) {
            return false;
        }

        soma = 0;

        for (int i = 0; i < 13; i++) {
            soma += Character.getNumericValue(cnpj.charAt(i)) * peso2[i];
        }

        resto = soma % 11;
        int digito2 = resto < 2 ? 0 : 11 - resto;

        return digito2 == Character.getNumericValue(cnpj.charAt(13));
    }
}