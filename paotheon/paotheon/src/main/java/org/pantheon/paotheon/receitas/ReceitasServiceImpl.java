package org.pantheon.paotheon.receitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.pantheon.paotheon.receitas.ReceitasService;

import java.util.List;
import java.util.Optional;

import org.pantheon.paotheon.receitas.ReceitasDTO;
@Service
public class ReceitasServiceImpl implements ReceitasService{
    @Autowired
    private ReceitaRepository receitaRepository;
    
    @Override
    public ReceitasDTO createReceita(ReceitasDTO receitaDto){
        Receita receita = ReceitasMapper.mapToReceita(receitaDto);
        Receita saveReceita = receitaRepository.save(receita);
        
        return ReceitasMapper.mapToReceitasDTO(saveReceita);   
    }

    
    @Transactional(readOnly = true)
    public List<ReceitaMinDTO> findAll(){
        List<Receita> resultado = receitaRepository.findAll();
        List<ReceitaMinDTO> dto = resultado.stream().map(x -> new ReceitaMinDTO(x)).toList();
        return dto;
   }
    
    
    @Transactional(readOnly = true)
    public Optional<ReceitaMinDTO> getReceitaByName(String nomeReceita){ 
        if(nomeReceita == null){
            new ResourceNotFoundException("Infelizmente essa receita não existe no nosso caderno");
        }
         return receitaRepository.getReceitaByName(nomeReceita);
        
    }
    @Transactional(readOnly = true)
    public ReceitasDTO findById(Long id){
        Receita resultado = receitaRepository.findById(id).get();
        return new ReceitasDTO(resultado);
    }
}
