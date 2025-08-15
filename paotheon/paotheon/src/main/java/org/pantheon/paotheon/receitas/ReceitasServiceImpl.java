package org.pantheon.paotheon.receitas;

import org.springframework.stereotype.Service;
import org.pantheon.paotheon.receitas.ReceitasService;
import org.pantheon.paotheon.receitas.ReceitasDTO;
@Service
public class ReceitasServiceImpl implements ReceitasService{
   
    private ReceitaRepository receitaRepository;
    
    @Override
    public ReceitasDTO createReceita(ReceitasDTO receitaDto){
        Receita receita = ReceitasMapper.mapToReceita(receitaDto);
        Receita saveReceita = receitaRepository.save(receita);
        
        return ReceitasMapper.mapToReceitasDTO(saveReceita);   
    }
}
