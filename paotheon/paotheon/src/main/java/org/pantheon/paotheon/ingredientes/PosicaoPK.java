package org.pantheon.paotheon.ingredientes;

import java.util.Objects;

import org.pantheon.paotheon.receitas.Receita;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

//Explica para o Spring que estamos encapsulando dois campos do banco de dados relacional em uma classe só
@Embeddable
public class PosicaoPK{
    
    @ManyToOne
    @JoinColumn(name = "receita_id")
    private Receita receita;
    
    @ManyToOne
    @JoinColumn(name = "ingredientes_id")
    private Ingredientes ingredientes;

    public PosicaoPK(){}

    public PosicaoPK(Receita receita,Ingredientes ingredientes){
        this.receita = receita;    
        this.ingredientes = ingredientes;
    }

    public Receita getReceita(){
        return receita;
    }

    public void setReceita(Receita receita){
        this.receita = receita;
    }

    public Ingredientes getIngredientes(){
        return ingredientes;
    }

    public void setIngredientes(Ingredientes ingredientes){
        this.ingredientes = ingredientes;
    }
    
    @Override
    public int hashCode(){
        return Objects.hash(receita, ingredientes);
    }

    @Override
    public boolean equals (Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() !=obj.getClass()){
            return false;
        }
        PosicaoPK other = (PosicaoPK) obj;
        return Objects.equals(receita, other.receita) && Objects.equals(ingredientes, other.ingredientes);
    }

}
