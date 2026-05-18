
package org.pantheon.paotheon.ingredientes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.pantheon.paotheon.ingredientes.IngredientesService;
@RestController
@RequestMapping(value ="/api/ingredientes")
public class IngredientesController {

@Autowired
private IngredientesService ingredientesService;

@PostMapping("/salvaringrediente")
    public ResponseEntity<IngredientesDTO> createIngrediente(IngredientesDTO ingredientesDTO){
    IngredientesDTO salvarIngrediente =  ingredientesService.createIngrediente(ingredientesDTO);
    return new ResponseEntity<>(salvarIngrediente, HttpStatus.CREATED);
}

@GetMapping("/{nome}")
    public ResponseEntity<IngredientesDTO> getIngredienteByName(@PathVariable("nome") IngredientesDTO ingredientesDto){
        IngredientesDTO getIngrediente  = ingredientesService.getIngredienteByName(ingredientesDto); 
        return new ResponseEntity<>(getIngrediente, HttpStatus.FOUND); 
    }
@GetMapping("/ingredientes")
public List<IngredientesDTO> findAll(){
    List<IngredientesDTO> result = ingredientesService.findAll();
    return result;
    }

@GetMapping("/{id}")
public IngredientesDTO findById(@PathVariable Long id){
    IngredientesDTO result = ingredientesService.findById(id);
    return result;
}
}
