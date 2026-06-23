package br.unigran.interfaces.controllers;

import br.unigran.application.dto.FornecedorDTO;
import br.unigran.application.usecase.GerenciarFornecedorUC;
import br.unigran.domain.entity.Fornecedor;
import java.util.List;

public class FornecedorController {

    private static GerenciarFornecedorUC gerenciarFornecedor = new GerenciarFornecedorUC();

    public static void salvar(FornecedorDTO dto) throws Exception {
        gerenciarFornecedor.salvarFornecedor(dto.build());
    }

    public static void editar(FornecedorDTO dto) throws Exception {
        gerenciarFornecedor.atualizar(dto.build());
    }

    public static void excluir(Integer id) throws Exception {
        Fornecedor fornecedor = new Fornecedor();
        fornecedor.setId(id);

        gerenciarFornecedor.remover(fornecedor);
    }

    public static List<Fornecedor> listarTodos() {
        return gerenciarFornecedor.listarTodos();
    }
}