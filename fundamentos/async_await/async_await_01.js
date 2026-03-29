function esperarPor(tempo = 2000) {
    return new Promise(function(resolve) {
        setTimeout(function () {
            resolve()
        }, tempo)
    })
}

function executarPromise() {
    esperarPor()
        .then(() =>  console.log('[Promise] Depois de 2s...'))
        .then(() => esperarPor(3000))
        .then(() => console.log('[Promise] Depois de 3s...'))
}

async function executarAsync() {
    await esperarPor()
    console.log('[Async/Await] Depois de 2s...')

    await esperarPor(3000)
    console.log('[Async/Await] Depois de 3s...')

}

executarPromise()
executarAsync()