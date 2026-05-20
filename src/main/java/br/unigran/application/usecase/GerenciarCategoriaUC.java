package br.unigran.application.usecase;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.repositories.CategoriaRepository;
import br.unigran.infra.repository.CategoriaRepositoryimpl;
import java.util.List;

public class GerenciarCategoriaUC {

    private Boolean atualizar = false;
    private final CategoriaRepository repository = new CategoriaRepositoryimpl();

    public String salvarCategoria(Categoria categoria) throws Exception {
        atualizar = false;
        valida(categoria);
        repository.salvar(categoria);
        return "Salvo com sucesso";
    }

    public String atualizar(Categoria categoria) throws Exception {
        atualizar = true;
        valida(categoria);
        repository.salvar(categoria);
        return "Atualizado com sucesso";
    }

    public List<Categoria> listarTodos() throws Exception {
        return repository.listarTodos();
    }

    public void valida(Categoria categoria) throws Exception {
        if (categoria.getNome() == null || categoria.getNome().isBlank()) {
            throw new Exception("Nome vazio");
        }

        if (atualizar && categoria.getId() == null) {
            throw new Exception("Id vazio");
        }
    }
}