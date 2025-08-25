package org.pantheon.paotheon.receitas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.pantheon.paotheon.receitas.ReceitasService;
@RestController
@RequestMapping(value ="/api")
public class ReceitasController {

@Autowired
private ReceitasService receitasService;

@PostMapping("/salvarreceita")
public ResponseEntity<ReceitasDTO> createReceita(ReceitasDTO receitaDto){
    ReceitasDTO salvarReceita =  receitasService.createReceita(receitaDto);
    return new ResponseEntity<>(salvarReceita, HttpStatus.CREATED);
}

@GetMapping("/{nome}")
    public ResponseEntity<ReceitaMinDTO> getReceitaByName(@PathVariable("nome") ReceitaMinDTO receitaMinDto){
        ReceitaMinDTO getReceita  = receitasService.getReceitaByName(receitaMinDto); 
        return new ResponseEntity<>(getReceita, HttpStatus.FOUND); 
    }
@GetMapping("/receitas")
public List<ReceitaMinDTO> findAll(){
    List<ReceitaMinDTO> result = receitasService.findAll();
    return result;
    }
}
