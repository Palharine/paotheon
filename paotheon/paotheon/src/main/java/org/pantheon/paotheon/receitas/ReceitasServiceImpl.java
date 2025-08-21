package org.pantheon.paotheon.receitas;

import org.springframework.stereotype.Service;
import org.pantheon.paotheon.receitas.ReceitasService;

import java.util.List;
import java.util.Optional;

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

    
    public List<Receita> findAllReceitas(){
        
        return receitaRepository.findAll();
    }
    
    
    public Optional<Receita> getReceitaByName(String nomeReceita){ 
        if(nomeReceita == null){
            new ResourceNotFoundException("Infelizmente essa receita não existe no nosso caderno");
        }
         return receitaRepository.getReceitaByName(nomeReceita);
        
    }
}
