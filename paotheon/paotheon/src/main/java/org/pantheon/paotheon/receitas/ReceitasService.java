package org.pantheon.paotheon.receitas;

import org.pantheon.paotheon.receitas.ReceitasDTO;

public interface ReceitasService{
    ReceitasDTO createReceita (ReceitasDTO receitasDto);
    ReceitasDTO allReceitas ();
    ReceitasDTO getReceitaByName(Receita receita);    
}


