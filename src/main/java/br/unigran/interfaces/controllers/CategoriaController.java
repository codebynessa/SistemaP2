/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.CategoriaDTO;
import br.unigran.application.usecase.GerenciarCategoriaUC;
import java.util.List;

/**
 *
 * @author vanes
 */
public class CategoriaController {
    

    static GerenciarCategoriaUC uc = new GerenciarCategoriaUC();

    public static void salvar(CategoriaDTO dto) throws Exception {

        uc.salvarCategoria(dto.build());
    }
        public static List listarTodos() throws Exception {
        return uc.listarTodos();
    }
}