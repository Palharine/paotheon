package org.pantheon.paotheon.receitas;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.pantheon.paotheon.receitas.ReceitasService;
@RestController
public class ReceitasController {


@RequestMapping("/api/salvarreceita")
public ResponseEntity<ReceitasDTO> createReceita(ReceitasDTO receitaDto){
   ReceitasDTO salvarreceita =  ReceitasService.createReceita(receitaDto);
       return new ResponseEntity<>(salvarreceita, HttpStatus.CREATED);
}


    
@GetMapping("/receitas")
public ResponseEntity<List<Receita>> getallReceitas(){
    return new ResponseEntity<List<Receita>>(ReceitaService.allReceitas(), HttpStatus.OK);
    }
}
