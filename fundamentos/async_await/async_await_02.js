// Uma função async sempre vai retornar uma PORIMISE!!!!
async function obterVersiculo(livro, cap, versiculo) {
    const url = `https://bible-api.com/${livro} ${cap}:${versiculo}`
    const resposta = await fetch(url)
    const dados = await resposta.json()
    return dados.verses[0].text
}

async function executar() {
    const texto = await obterVersiculo('luke', 1, 1)
    console.log(texto)
}

executar()