function promessaComPossivelErro(chanceErro) {
    return new Promise((resolve, reject) => {
        if(Math.random() < chanceErro) {
            reject('Ocorreu um erro!')
        } else {
            resolve('Tudo certo!')
        }
    })
}

promessaComPossivelErro(0.5)
    .then(v => console.log(v))
    .catch(erro => console.log(erro))