package br.unigran.domain.repositories;

import br.unigran.domain.entity.Categoria;
import java.util.List;

public interface CategoriaRepository extends AbstractRepository{
    public List<Categoria> listarTodos();
}
