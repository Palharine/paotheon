package org.pantheon.paotheon.receitas;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita,Long>{
    
    Optional<Receita> getReceitaByName(String nomeReceita);
    void saveReceita(Receita receita);
    void deleteReceita(Receita receita);
    List<Receita> getAllReceita();

}
