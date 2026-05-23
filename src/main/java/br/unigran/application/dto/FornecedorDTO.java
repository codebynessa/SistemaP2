/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.dto;

import br.unigran.domain.entity.Fornecedor;

/**
 *
 * @author vanes
 */
public class FornecedorDTO {
    
    public String nomeFornecedor;
    public String cnpjFornecedor;
    public String telefoneFornecedor;

    public FornecedorDTO(String nomeFornecedor, String cnpjFornecedor, String telefoneFornecedor) {

        this.nomeFornecedor = nomeFornecedor;
        this.cnpjFornecedor = cnpjFornecedor;
        this.telefoneFornecedor = telefoneFornecedor;
    }

    public Fornecedor build() {

        Fornecedor fornecedor = new Fornecedor();

        fornecedor.setNome(nomeFornecedor);
        fornecedor.setCnpj(cnpjFornecedor);
        fornecedor.setTelefone(telefoneFornecedor);

        return fornecedor;
    }
}