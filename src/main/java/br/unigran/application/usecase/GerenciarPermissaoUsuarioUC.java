/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.PermissaoUsuario;
import br.unigran.domain.repositories.PermissaoUsuarioRepository;
import br.unigran.infra.repository.PermissaoUsuarioRepositoryimpl;
import java.util.List;

/**
 *
 * @author vanes
 */
public class GerenciarPermissaoUsuarioUC {
    private Boolean atualizar = false;
    private final PermissaoUsuarioRepository repository = new PermissaoUsuarioRepositoryimpl();

    public String salvarPermissao(PermissaoUsuario permissao) throws Exception {

        atualizar = false;

        valida(permissao);

        repository.salvar(permissao);

        return "Permissão salva com sucesso";
    }

    public String atualizar(PermissaoUsuario permissao) throws Exception {

        atualizar = true;

        valida(permissao);

        repository.salvar(permissao);

        return "Permissão atualizada com sucesso";
    }

    public List listarTodos() {
        return repository.listar("From PermissaoUsuario", null);
    }

public void valida(PermissaoUsuario permissao) throws Exception {

    if (permissao.getUsuarioCadastrado() == null) {
        throw new Exception("Usuário cadastrado vazio");
    }

    if (permissao.getUsuarioCadastro() == null) {
        throw new Exception("Usuário de cadastro vazio");
    }

    if (permissao.getTipoPermissoes() == null) {
        throw new Exception("Tipo de permissão vazio");
    }

    if (atualizar && permissao.getId() == null) {
        throw new Exception("Id vazio");
    }
}
}
