package br.unigran.application.usecase;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.repositories.CategoriaRepository;

public class GerenciarCategoriaUC {

    private Boolean atualizar = false;
    private CategoriaRepository repository;

    public String salvarCategoria(Categoria categoria) throws Exception {
        repository.salvar(categoria);
        return "Salvo com sucesso";
    }

    public void atualizar(Categoria categoria) throws Exception {
        atualizar=true;
        repository.salvar(categoria);

    }
    public void listarTodos() throws Exception {
       repository.listarTodos();
        
    }

    public void valida(Categoria categoria) throws Exception {
        if (categoria.getNome().isBlank()) {
            throw new Exception("Nome vazio");
        }
        if (atualizar && categoria.getId() == null) {
            throw new Exception("Id vazio");
        }

    }

}
