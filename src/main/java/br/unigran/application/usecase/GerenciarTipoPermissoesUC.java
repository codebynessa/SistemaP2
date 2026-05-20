/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.TipoPermissoes;
import br.unigran.domain.repositories.TipoPermissoesRepository;
import br.unigran.infra.repository.TipoPermissoesRepositoryimpl;
import java.util.List;

/**
 *
 * @author vanes
 */
public class GerenciarTipoPermissoesUC {
    
  private Boolean atualizar = false;
    private final TipoPermissoesRepository repository = new TipoPermissoesRepositoryimpl();

    public String salvarTipoPermissao(TipoPermissoes tipoPermissao) throws Exception {
        atualizar = false;
        valida(tipoPermissao);
        repository.salvar(tipoPermissao);
        return "Tipo de permissão salvo com sucesso";
    }

    public String atualizar(TipoPermissoes tipoPermissao) throws Exception {
        atualizar = true;
        valida(tipoPermissao);
        repository.salvar(tipoPermissao);
        return "Tipo de permissão atualizado com sucesso";
    }

    public List listarTodos() {
        return repository.listar("From TipoPermissoes", null);
    }

    public void valida(TipoPermissoes tipoPermissao) throws Exception {
        if (tipoPermissao.getDescricao() == null || tipoPermissao.getDescricao().isBlank()) {
            throw new Exception("Descrição vazia");
        }

        if (atualizar && tipoPermissao.getId() == null) {
            throw new Exception("Id vazio");
        }
    }
}
