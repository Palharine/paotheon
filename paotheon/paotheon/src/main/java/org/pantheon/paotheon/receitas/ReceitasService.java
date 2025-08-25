package org.pantheon.paotheon.receitas;

import org.pantheon.paotheon.receitas.ReceitasDTO;

import java.util.List;

import org.pantheon.paotheon.receitas.Receita;
public interface ReceitasService{
    public ReceitasDTO createReceita (ReceitasDTO receitasDto);
    public List<ReceitaMinDTO> findAll();
    public ReceitaMinDTO getReceitaByName(ReceitaMinDTO receita);    
    
}
 
