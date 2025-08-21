package org.pantheon.paotheon.receitas;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.pantheon.paotheon.receitas.ReceitasService;
@RestController
public class ReceitasController {

private ReceitasService receitasService;

@PostMapping("/api/salvarreceita")
public ResponseEntity<ReceitasDTO> createReceita(ReceitasDTO receitaDto){
   ReceitasDTO salvarReceita =  receitasService.createReceita(receitaDto);
       return new ResponseEntity<>(salvarReceita, HttpStatus.CREATED);
}

@GetMapping("/api/receita")
    public ResponseEntity<Receita> getReceitaByName(@PathVariable("nome") ReceitasDTO receitaDto){
        ReceitasDTO receitaDto = receitasService.getReceitaByName(receitaDto); 
    }
@GetMapping("/api/receitas")
public ResponseEntity<List<Receita>> getAllReceitas(){
    return new ResponseEntity<List<Receita>>(receitasService.allReceitas(), HttpStatus.OK);
    }
}
