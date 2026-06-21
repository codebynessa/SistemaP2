/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.interfaces.controllers;

import br.unigran.application.dto.LoginDTO;
import br.unigran.interfaces.controllers.Sessao;
import br.unigran.application.usecase.LoginUC;
import br.unigran.domain.entity.Usuario;

/**
 *
 * @author vanes
 */
public class LoginController {
    
    private static LoginUC uc = new LoginUC();

    public static Boolean login(LoginDTO dto) throws Exception {
        Usuario usuario = uc.validar(dto.toEntity());
        Sessao.getInstance().setUsuario(usuario);
        return true;
    }

    public static void sair() {
        Sessao.getInstance().sair();
    }
}