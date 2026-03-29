/*import cozinha from "./cozinha/principal.js"
import receita from "./receita.js"

//console.log(cozinha)
const r = receita(["arroz, feijão"], cozinha.assar, cozinha.cortar)
console.log(r) */

import refeicao from "./refeicao.js"
//console.log(refeicao)
const vouComerNoAlmoco = refeicao("Almoço")
const vouComerNoJantar = refeicao("Jantar")

vouComerNoAlmoco("arroz", "feijão", "batata")
vouComerNoJantar("macarrão", "carne", "tomate")