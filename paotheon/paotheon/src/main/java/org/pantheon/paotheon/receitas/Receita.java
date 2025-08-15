package org.pantheon.paotheon.receitas;

import org.springframework.data.annotation.Id;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;

import java.sql.*;
import java.util.List;

import lombok.Data;

@Entity
@Component
@Data
@Table(name = "receitas")
 public class Receita {
    @Id
    @Column (name = "id", nullable = false)
    @GeneratedValue
    protected Long idReceita;
    
    @Column(name = "name")
    protected String nomeReceita;
    
    @Column(name = "tempo_preparo")
    protected double tempoPreparo;
    
    @Column(name  = "descricao")
    protected String descricao;
    
    @Column(name = "info_adicionais")
    protected String infoAdicionais;
    
    @Column(name = "ingredientes")
    protected List<Ingredientes> ingredientes;
    
    @Column(name = "utensilios")
    protected List<String> utensilios;

    @Column(name = "modo_preparo")
    protected List<String> modoPreparo;
    
    public Receita(){}

    //Colocar as listas dentro do controller
    public Receita(Long id, String nomeReceita, double tempoPreparo, String descricao, String infoAdicionais){
    this.idReceita = id;
    this.nomeReceita = nomeReceita;
    this.tempoPreparo = tempoPreparo;
    this.descricao = descricao;
    this.infoAdicionais = infoAdicionais;
    }
    
    

}
