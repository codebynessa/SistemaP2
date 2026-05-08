package br.unigran.domain.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ItemEntrada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private int quantidade;
    private double custoUnitario;
    private double subtotal;
    @ManyToOne
    private EntradaProduto entradaProduto;
    @ManyToOne
    private MovimentacaoEstoque movEstq;
}
