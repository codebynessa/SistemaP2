package br.unigran.domain.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Usuario implements Serializable {

    @OneToMany(mappedBy = "usuario")
    private List<EntradaProduto> entradaProdutos;

    @OneToMany(mappedBy = "usuario")
    private List<Venda> vendas;
    @OneToMany(mappedBy = "usuarioCadastro",  fetch = FetchType.LAZY)
    private List<PermissaoUsuario> permissaoUsuarios;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private String nome;
    private String login;
    private String senha;
    
}
