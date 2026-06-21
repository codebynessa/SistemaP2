package br.unigran.application.dto;

import br.unigran.domain.entity.PermissaoUsuario;
import br.unigran.domain.entity.TipoPermissoes;
import br.unigran.domain.entity.Usuario;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vanes
 */
public class PermissaoUsuarioDTO {
   public String idUsuarioCadastrado;
    public String idUsuarioCadastro;
    public String idTipoPermissao;

    public PermissaoUsuarioDTO(String idUsuarioCadastrado, String idUsuarioCadastro, String idTipoPermissao) {
        this.idUsuarioCadastrado = idUsuarioCadastrado;
        this.idUsuarioCadastro = idUsuarioCadastro;
        this.idTipoPermissao = idTipoPermissao;
    }

    public PermissaoUsuario build() {
        PermissaoUsuario permissao = new PermissaoUsuario();

        permissao.setDataCadastro(new Date());

        Usuario usuarioCadastrado = new Usuario();
        usuarioCadastrado.setId(Integer.valueOf(idUsuarioCadastrado));
        permissao.setUsuarioCadastrado(usuarioCadastrado);

        Usuario usuarioCadastro = new Usuario();
        usuarioCadastro.setId(Integer.valueOf(idUsuarioCadastro));
        permissao.setUsuarioCadastro(usuarioCadastro);

        TipoPermissoes tipo = new TipoPermissoes();
        tipo.setId(Integer.valueOf(idTipoPermissao));
        permissao.setTipoPermissoes(tipo);

        return permissao;
    }
}
