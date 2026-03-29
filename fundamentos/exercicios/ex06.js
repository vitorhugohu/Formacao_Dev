function transformaArray(objeto) {
    let resultado = Object.entries(objeto)
    return resultado
}

const pessoa = {
    nome: "Patrícia",
    idade: 22,
    id: 142
}

const arrayFinal = transformaArray(pessoa)

console.log(arrayFinal)