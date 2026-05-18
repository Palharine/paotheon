package org.pantheon.paotheon.ingredientes;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IngredientesRepository extends JpaRepository<Ingredientes, Long>{

    public Optional<IngredientesDTO> getIngredienteByName(String nomeIngrediente);


    @Query(nativeQuery = true, value = "
        SELECT receitas.id, receitas.ingredientes
        FROM receitas
        INNER JOIN ingredientes
        WHERE 
        ORDER BY posicao 
        ")
        List<ReceitaMinProjection> findByProtein(Long ingredientesId)
}

