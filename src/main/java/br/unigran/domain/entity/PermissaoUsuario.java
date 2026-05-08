package br.unigran.domain.entity;

import java.io.Serializable;
import java.util.Date;
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
public class PermissaoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    private Date dataCadastro;
    private Usuario usuarioCadastrado;
    @ManyToOne
    private Usuario usuarioCadastro;
    @ManyToOne
    private TipoPermissoes tipoPermissoes;
    
}
