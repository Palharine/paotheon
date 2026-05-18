package org.pantheon.paotheon.ingredientes;

public class IngredientesDTO{

    private Long id;
    private String  nomeIngrediente;
    private Long proteina;
    private Long carbohidrato;
    private Long lipidio;
    
    public IngredientesDTO(){}

    public IngredientesDTO(Ingredientes entity){
        id = entity.getId();
        nomeIngrediente = entity.getName();
        proteina = entity.getProtein();
        carbohidrato = entity.getCarbs();
        lipidio = entity.getFat();
    }

    public Long getId(){
        return id;
    }
    public String getName(){
        return nomeIngrediente;
    }
    public Long getProtein(){
        return proteina;
    }
    public Long getCarbs(){
        return carbohidrato;
    }
    public Long getFat(){
        return lipidio;
    }

}
