
package org.pantheon.paotheon.receitas;

import org.pantheon.paotheon.receitas.Receita;

public class ReceitaMinDTO{
    
    protected Long idReceita;
    
    protected String nomeReceita;
    
    protected double tempoPreparo;
    
    protected String descricao;
    
   public ReceitaMinDTO(){}

   public ReceitaMinDTO(Receita entity){
    idReceita = entity.getId();
    nomeReceita = entity.getName();
    tempoPreparo = entity.getTempo();
    descricao = entity.getDescricao();
   }

   public Long getId(){
       return idReceita;
   }
   public String getName(){
        return nomeReceita;
   }
   public double getTempo(){
        return tempoPreparo;
   }
   public String getDescricao(){
        return descricao;
   }
} 
