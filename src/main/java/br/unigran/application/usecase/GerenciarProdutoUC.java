package br.unigran.application.usecase;

import br.unigran.domain.entity.Categoria;
import br.unigran.domain.entity.Produto;
import br.unigran.domain.repositories.CategoriaRepository;
import br.unigran.domain.repositories.ProdutoRepository;
import br.unigran.infra.repository.CategoriaRepositoryimpl;
import br.unigran.infra.repository.ProdutoRepositoryimpl;
import java.util.List;

public class GerenciarProdutoUC {

    private final ProdutoRepository repository;
    private final CategoriaRepository categoriaRepository;

    public GerenciarProdutoUC() {
        this.repository = new ProdutoRepositoryimpl();
        this.categoriaRepository = new CategoriaRepositoryimpl();
    }

    public void cadastrarProduto(Produto produto) throws Exception {
        List<Categoria> categorias = categoriaRepository.listarTodos();

        if (produto.getCategoria() == null) {
            throw new Exception("Categoria vazia");
        }

        if (!categorias.contains(produto.getCategoria())) {
            throw new Exception("Categoria não encontrada");
        }

        if (produto.getNome() == null || produto.getNome().isBlank()) {
            throw new Exception("Sem nome");
        }

        repository.salvar(produto);
    }

    public List<Produto> listarByCategoria(Categoria categoria) {
        return repository.findProdutosByCategoria(categoria);
    }
}