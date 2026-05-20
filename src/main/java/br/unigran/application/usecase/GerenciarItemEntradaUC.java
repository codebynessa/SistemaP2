/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unigran.application.usecase;

import br.unigran.domain.entity.ItemEntrada;
import br.unigran.domain.repositories.ItemEntradaRepository;
import br.unigran.infra.repository.ItemEntradaRepositoryimpl;
import java.util.List;

/**
 *
 * @author vanes
 */
public class GerenciarItemEntradaUC {
    
  private Boolean atualizar = false;
    private final ItemEntradaRepository repository = new ItemEntradaRepositoryimpl();

    public String salvarItemEntrada(ItemEntrada itemEntrada) throws Exception {

        atualizar = false;

        valida(itemEntrada);

        repository.salvar(itemEntrada);

        return "Item de entrada salvo com sucesso";
    }

    public String atualizar(ItemEntrada itemEntrada) throws Exception {

        atualizar = true;

        valida(itemEntrada);

        repository.salvar(itemEntrada);

        return "Item de entrada atualizado com sucesso";
    }

    public List listarTodos() {
        return repository.listar("From ItemEntrada", null);
    }

public void valida(ItemEntrada itemEntrada) throws Exception {

    if (itemEntrada.getQuantidade() <= 0) {
        throw new Exception("Quantidade inválida");
    }

    if (itemEntrada.getCustoUnitario() <= 0) {
        throw new Exception("Custo unitário inválido");
    }

    if (itemEntrada.getSubtotal() < 0) {
        throw new Exception("Subtotal inválido");
    }

    if (itemEntrada.getEntradaProduto() == null) {
        throw new Exception("Entrada de produto vazia");
    }

    if (itemEntrada.getMovEstq() == null) {
        throw new Exception("Movimentação de estoque vazia");
    }

    if (atualizar && itemEntrada.getId() == null) {
        throw new Exception("Id vazio");
    }
}
}