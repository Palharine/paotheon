package org.pantheon.paotheon.ingredientes;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;

public interface IngredientesService{ 
    public IngredientesDTO findById(Long id);   
    public IngredientesDTO createIngrediente(IngredientesDTO ingredientesDTO);
    public List<IngredientesDTO> findAll();
    public IngredientesDTO getIngredienteByName(IngredientesDTO ingredientesDTO);
}
