package br.unigran.domain.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class MovimentacaoEstoque implements Serializable {

    @OneToMany(mappedBy = "movEstq")
    private List<ItemVenda> itemVendas;

    @OneToMany(mappedBy = "movEstq")
    private List<ItemEntrada> itemEntradas;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Date dataMovimentacao;
    private String tipo; //ENTRADA e SAIDA
    private int quantidade;
    @ManyToOne
    private Produto produto;
    
}
