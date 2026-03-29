const promessa = new Promise(function (resolve) {
    resolve('Vamos jogar agora!')
})

promessa.then(valor => console.log(valor))
console.log('Fim')