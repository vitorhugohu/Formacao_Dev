function removeAtributo(objeto, atributo) {
    if(objeto[atributo]) {
        let objetoCopia = {...objeto}
        delete objetoCopia[atributo]
        return objetoCopia
    } else {
        return objeto
    }
}

const pessoa = {
    nome: "Ana",
    idade: 20
}

const pessoaAtualizada = removeAtributo(pessoa, "idade")
console.log(pessoa)
console.log(pessoaAtualizada)