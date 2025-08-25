package org.pantheon.paotheon.ingredientes;

import java.util.Objects;

import org.pantheon.paotheon.receitas.Receita;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "posicao")
public class Posicao{

    @EmbeddedId
    private PosicaoPK id = new PosicaoPK();

    private Integer posicao;

    public Posicao(){}

    public Posicao(Receita receita, Ingredientes ingredientes, Integer posicao){
        id.setReceita(receita);
        id.setIngredientes(ingredientes);
        this.posicao = posicao;
    }

    public PosicaoPK getId(){
        return id;
    }

    public void setId(PosicaoPK id){
        this.id = id;
    }

    public Integer getPosicao(){
        return posicao;
    }

    public void setPosicao(Integer posicao){
        this.posicao = posicao;
    }

    @Override
    public int hashCode(){
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj){
        if (this ==obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        Posicao other = (Posicao) obj;
        return Objects.equals(id, other.id);
    }
}
