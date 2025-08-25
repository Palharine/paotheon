package org.pantheon.paotheon.receitas;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita,Long>{
    
    Optional<ReceitaMinDTO> getReceitaByName(String nomeReceita);
    void saveReceita(ReceitasDTO receitaDto);
    void deleteReceita(ReceitasDTO receitaDto);
    List<ReceitaMinDTO> getAllReceita();

}
