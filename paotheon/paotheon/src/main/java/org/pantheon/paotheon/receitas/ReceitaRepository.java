package org.pantheon.paotheon.receitas;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReceitaRepository extends JpaRepository<Receita,Long>{
    
    Optional<Receita> findReceitaByName(String name);
    void saveReceita(Receita receita);
    void deleteReceita(Receita receita);


}
