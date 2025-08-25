package org.pantheon.paotheon.receitas;

import org.pantheon.paotheon.ingredientes.Ingredientes;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import java.sql.*;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@Table(name = "receitas")
 public class Receita {
    @Id
    @Column (name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long idReceita;

    
    @Column(name = "name")
    protected String nomeReceita;
    
    @Column(name = "tempo_preparo")
    protected double tempoPreparo;
    
    @Column(columnDefinition = "TEXT")
    protected String descricao;
    
    @Column(name = "info_adicionais")
    protected String infoAdicionais;
    
    @Column(name = "ingredientes")
    protected List<Ingredientes> ingredientes;
    
    protected List<String> utensilios;

    @Column(name = "modo_preparo")
    protected List<String> modoPreparo;
   
    public Receita(){}    

    public Receita(Long idReceita,String nomeReceita, double tempoPreparo, String descricao, String infoAdicionais){
        this.idReceita = idReceita;
        this.nomeReceita = nomeReceita;
        this.tempoPreparo = tempoPreparo;
        this.descricao = descricao;
        this.infoAdicionais = infoAdicionais;
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
    public String getInfoAdicional(){
        return infoAdicionais;
    }

    public void setId(Long idReceita){
        this.idReceita = idReceita;
    }

    public void setName(String nomeReceita){
        this.nomeReceita=nomeReceita;
    }
    public void setTempo(double tempoPreparo){
        this.tempoPreparo=tempoPreparo;
    }
    public void setDescricao(String descricao){
        this.descricao=descricao;
    }
    public void setInfoAdicionais(String infoAdicionais){
        this.infoAdicionais=infoAdicionais;
    }

}
