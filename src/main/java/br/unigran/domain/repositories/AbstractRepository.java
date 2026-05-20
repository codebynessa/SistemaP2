package br.unigran.domain.repositories;

import java.util.List;

public interface AbstractRepository {
    public  void salvar(Object o);
    public  void remover(Object o);
    public  List listar(String quere, String[] parametros);
    public  Object findByID(Integer id);
}
 