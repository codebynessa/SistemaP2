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
public class Venda implements Serializable {

    @OneToMany(mappedBy = "venda")
    private List<Pagamento> pagamentos;

    @OneToMany(mappedBy = "venda")
    private List<ItemVenda> itemVendas;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Date dataVenda;
    private double valorTotal;
    @ManyToOne
    private Usuario usuario;
    @ManyToOne
    private Cliente cliente;
    
}
