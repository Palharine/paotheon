import { Ingredientes } from "./ingredientes";

interface Receitas {
  idReceita: number;
  nomeReceita: string;
  tempoPreparo: number;
  descricao: string;
  infoAdicionais: string;
  utensilios: string;
  modoPreparo: string;
  ingredientes: Ingredientes

}

