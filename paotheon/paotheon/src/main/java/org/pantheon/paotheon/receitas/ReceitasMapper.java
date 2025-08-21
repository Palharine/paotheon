package org.pantheon.paotheon.receitas;

import org.pantheon.paotheon.receitas.Receita;
import org.pantheon.paotheon.receitas.ReceitasDTO;

public class ReceitasMapper{
    
    public static ReceitasDTO mapToReceitasDTO(Receita receita){
        return new ReceitasDTO(
                receita.getId(),
                receita.getName()
                );
        
    }

    public static Receita mapToReceita(ReceitasDTO receitasDto){
        return new Receita(
                receitaDto.getId(),
                receitaDto.getName()
                );
        }
}
