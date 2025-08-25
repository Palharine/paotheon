package org.pantheon.paotheon.receitas;

import org.pantheon.paotheon.receitas.Receita;
import org.springframework.beans.BeanUtils;

import java.util.List;

import org.pantheon.paotheon.ingredientes.Ingredientes;
public class ReceitasDTO{

    protected Long idReceita;
    
    protected String nomeReceita;
    
    protected double tempoPreparo;
    
    protected String descricao;
    
    protected List<Ingredientes> ingredientes;
    
    protected List<String> utensilios;

    protected List<String> modoPreparo;
   
    public ReceitasDTO(){}

    public ReceitasDTO(Receita entity){
        BeanUtils.copyProperties(entity,this);
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

   public void setId(Long idReceita){
       this.idReceita = idReceita;
   }
   public void setName(String nomeReceita){
        this.nomeReceita = nomeReceita;
   }
   public void setTempo(double tempoPreparo){
        this.tempoPreparo = tempoPreparo;
   }
   public void setDescricao(String descricao){
        this.descricao = descricao;
   }
   public List<Ingredientes> getIngredientes(){
        return ingredientes;
   }
   public void setIngredientes(List<Ingredientes> ingredientes){
        this.ingredientes = ingredientes;
   }    

   public List<String> getUtensilios(){
       return utensilios;
   }

   public void setUtensilios(List<String> utensilios){
        this.utensilios = utensilios;
   }

   public List<String> getModoPreparo(){
        return modoPreparo;
   }
   public void setModoPreparo(List<String> modoPreparo){
        this.modoPreparo = modoPreparo;
   }

}
