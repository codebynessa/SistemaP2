package br.unigran.infra.repository;

import br.unigran.domain.entity.Categoria;
import br.unigran.infra.persistence.JPAUtil;
import java.util.List;

public class CategoriaRepositoryimpl implements br.unigran.domain.repositories.CategoriaRepository{
    JPAUtil dao=JPAUtil.getInstace();
    @Override
    public void salvar(Object categoria) {
        dao.salvar(categoria);
    }

    @Override
    public List<Categoria> listarTodos() {
       return dao.listar("From Categoria", null);
    }

    @Override
    public void remover(Object o) {
        dao.remover(o);
    }

    @Override
    public List listar(String quere, String[] parametros) {
       return dao.listar(quere, parametros);
               }

    @Override
    public Object findByID(Integer id) {
       return dao.findById(id, Categoria.class);
    }
    
}
