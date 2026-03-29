// Promise.all

function gerarNumeroEntre(min, max, tempo) {
    return new Promise(resolve => {
        setTimeout(() => {
        const fator = max - min + 1
        const aleatorio = parseInt(Math.random() * fator) + min
        resolve(aleatorio)
    }, tempo)
    })
}

console.time('sequencial')
gerarNumeroEntre(1, 60, 4000)
    .then(console.log)
    .then(() => gerarNumeroEntre(1, 60, 1000))
    .then(console.log)
    .then(() => gerarNumeroEntre(1, 60, 500))
    .then(console.log)
    .then(() => gerarNumeroEntre(1, 60, 2000))
    .then(console.log)
    .then(() => gerarNumeroEntre(1, 60, 1500))
    .then(console.log)
    .then(() => gerarNumeroEntre(1, 60, 3000))
    .then(console.log)
    .then(() => console.timeEnd('sequencial'))