function promessaComPossivelErro(chanceErro) {
    return new Promise((resolve, reject) => {
        try {
            if(Math.random() < chanceErro) {
            reject('Ocorreu um erro!')
        } else {
            resolve('Tudo certo!')
        }
        } catch (e) {
            reject(e)
        }
    })
}

promessaComPossivelErro(0.5)
    .then(
        v => v + '!!!', // resolve
        erro => console.log(`#1: ${erro}`) // reject
    )
    .then(
        v => console.log(v),    // resolve
        erro => console.log(`#2: ${erro}`) // reject
    )
    