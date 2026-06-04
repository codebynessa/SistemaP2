/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.CategoriaDTO;
import br.unigran.application.usecase.GerenciarCategoriaUC;

/**
 *
 * @author vanes
 */
public class CategoriaController {
    

    static GerenciarCategoriaUC uc = new GerenciarCategoriaUC();

    public static void salvar(CategoriaDTO dto) throws Exception {

        uc.salvarCategoria(dto.build());

    }
}