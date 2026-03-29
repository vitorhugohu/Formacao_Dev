function ordena(arr, propriedade) {

    const comparacao = (a, b) => {
        if (a[propriedade] > b[propriedade]) {
            return -1
        } else if (b[propriedade] > a[propriedade]) { 
            return 1
        } else {
            return 0 // 0
        }
    }

    return arr.sort(comparacao)
}

const pessoas = [
    { nome: "Vitor", idade: 30},
    { nome: "Ana", idade: 18},
    { nome: "Carlos", idade: 20},
    { nome: "Bia", idade: 50}
]

console.log(ordena(pessoas, "idade"))
console.log(ordena(pessoas, "nome"))