const primeiroElemento = arrayOuString => arrayOuString[0]

const promessa = new Promise(function (resolve) {
    resolve(['Ana', 'Vitor', 'Bia', 'João']) // Resolve -> É responsável por resolver a promessa
})
 
promessa
    .then(array => primeiroElemento(array)) // Then é executado quando a Promise é resolvida e recebe o valor do Resolve
    .then(elemento => primeiroElemento(elemento))
    .then(letra => letra.toLowerCase())
    .then(resultado => console.log(resultado))

console.log('Fim')