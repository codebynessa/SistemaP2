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
        validar(produto);
        repository.salvar(produto);
    }

    public void atualizar(Produto produto) throws Exception {
        if (produto.getId() == null) {
            throw new Exception("Id vazio");
        }

        validar(produto);
        repository.salvar(produto);
    }

    public void remover(Produto produto) throws Exception {
        if (produto.getId() == null) {
            throw new Exception("Id vazio");
        }

        repository.remover(produto);
    }

    public List<Produto> listarByCategoria(Categoria categoria) {
        return repository.findProdutosByCategoria(categoria);
    }

    public List<Produto> listarTodos() {
        return repository.listarTodos();
    }

    private void validar(Produto produto) throws Exception {
        List<Categoria> categorias = categoriaRepository.listarTodos();

        if (produto.getCategoria() == null || produto.getCategoria().getId() == null) {
            throw new Exception("Categoria vazia");
        }

        boolean categoriaExiste = false;

        for (Categoria c : categorias) {
            if (c.getId().equals(produto.getCategoria().getId())) {
                categoriaExiste = true;
                break;
            }
        }

        if (!categoriaExiste) {
            throw new Exception("Categoria não encontrada");
        }

        if (produto.getNome() == null || produto.getNome().isBlank()) {
            throw new Exception("Informe o nome do produto");
        }

        if (produto.getDescricao() == null || produto.getDescricao().isBlank()) {
            throw new Exception("Informe a descrição do produto");
        }

        if (produto.getPrecoVenda() <= 0) {
            throw new Exception("Informe um preço válido");
        }

        if (produto.getEstoqueAtual() < 0) {
            throw new Exception("Informe um estoque válido");
        }
    }
}
