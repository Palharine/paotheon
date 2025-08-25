package org.pantheon.paotheon.ingredientes;

import java.lang.Override;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ingredientes")
public class Ingredientes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String  nomeIngrediente;
    private Long proteina;
    private Long carbohidrato;
    private Long lipidio;
    
    public Ingredientes(){}
    
    public Ingredientes(Long id,String nomeIngrediente, Long proteina, Long carbohidrato, Long lipidio){
    this.id = id;
    this.nomeIngrediente = nomeIngrediente;
    this.proteina = proteina;
    this.carbohidrato = carbohidrato;
    this.lipidio = lipidio;
    }

    public Long getId(){
        return id;
    }
    
    public void setId(Long id){
        this.id = id;
    }
    public String getName(){
        return nomeIngrediente;
    }
    public void setName(String nomeIngrediente){
        this.nomeIngrediente = nomeIngrediente;
    }

    public Long getProtein(){
        return proteina;
    }

    public void setProtein(Long proteina){
        this.proteina = proteina;
    }

    public Long getCarbs(){
        return carbohidrato;
    }

    public void setCarbs(Long carbohidrato){
        this.carbohidrato = carbohidrato;
    }

    public Long getFat(){
        return lipidio;
    }

    public void setFat(Long lipidio){
        this.lipidio = lipidio;
    }
    
    //Fazer o hashcode certo
    //@Override
    //public String hashCode(){
       // return toString(Objects.hash(nomeIngrediente));
    //}
    
    @Override
    public boolean equals(Object obj){
        if (this ==obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if(getClass() != obj.getClass()){
            return false;
        }
        Ingredientes other = (Ingredientes) obj;
        return Objects.equals(nomeIngrediente, other.nomeIngrediente);
    }
}

