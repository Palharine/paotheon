package org.pantheon.paotheon.ingredientes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class IngredientesServiceImpl extends IngredientesService{
    
    @Autowired
    private IngredientesRepository ingredientesRepository;

    @Transactional(readOnly= true)
    public List<IngredientesDTO> findAll(){
    List<Ingredientes> result = ingredientesRepository.findAll();
    return result.stream().map(x -> new IngredientesDTO(x)).toList();
    }

    @Transactional(readOnly = true)
    public Optional<IngredientesDTO> getIngredienteByName(String nomeIngrediente){ 
        if(nomeIngrediente == null){
            new ResourceNotFoundException("Infelizmente esse ingrediente não existe no nosso caderno");
        }
         return ingredientesRepository.getIngredienteByName(nomeIngrediente);
        
    }
    @Transactional(readOnly = true)
    public IngredientesDTO findById(Long id){
        Ingredientes resultado = ingredientesRepository.findById(id).get();
        return new IngredientesDTO(resultado);
    }

    
}

