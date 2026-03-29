const primeiroElemento = arrayOuString => arrayOuString[0]
const letraMinuscula = letra => letra.toLowerCase()

const promessa = new Promise(function (resolve) {
    resolve(['Ana', 'Vitor', 'Bia', 'João']) // Resolve -> É responsável por resolver a promessa
})
 
promessa
    .then(primeiroElemento) // Then é executado quando a Promise é resolvida e recebe o valor do Resolve
    .then(primeiroElemento)
    .then(letraMinuscula)
    .then(console.log)

console.log('Fim')