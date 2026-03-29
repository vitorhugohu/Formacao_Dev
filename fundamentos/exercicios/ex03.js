function trocaChaveEValor(objeto) {
    let objetoRetorno = {}
    let conteudoObjeto = Object.entries(objeto)
    for (par of conteudoObjeto) {
        objetoRetorno[par[1]] = par[0]
    }
    return objetoRetorno
}

const objeto = { nome: "Maria", idade: 45, id: "8745"}

const objetoInvertido = trocaChaveEValor(objeto)

console.log(objeto)
console.log(objetoInvertido)