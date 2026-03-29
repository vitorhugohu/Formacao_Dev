const texto = `Um dia nós percebemos que as mulheres têm instinto "caçador" e fazem qualquer homem sofrer...
Um dia descobrimos que se apaixonar é inevitável...
Um dia percebemos que as melhores provas de amor são as mais simples...
Um dia percebemos que o comum não nos atrai...
Um dia saberemos que ser classificado como "bonzinho" não é bom...
Um dia perceberemos que a pessoa que nunca te liga é a que mais pensa em você...
Um dia percebemos que somos muito importante para alguém, mas não damos valor a isso...
Um dia percebemos como aquele amigo faz falta, mas ai já é tarde demais...
Enfim...
Um dia descobrimos que apesar de viver quase um século esse tempo todo não é suficiente para realizarmos todos os nossos sonhos, para beijarmos todas as bocas que nos atraem, para dizer o que tem de ser dito...
O jeito é: ou nos conformamos com a falta de algumas coisas na nossa vida ou lutamos para realizar todas as nossas loucuras...`

let paragrafos = texto.split("\n")

let frases = []

for (paragrafo of paragrafos) {
    let frasesDoParagrafo = paragrafo.split(".")
    frases.push(...frasesDoParagrafo)
}

let palavras = []

for (frase of frases) {
    let fraseSemVirgula = frase.replace(",", "")
    let palavrasDaFrase = frase.split(" ")
    palavras.push(...palavrasDaFrase)
}

let palavrasContagem = {}

for (palavra of palavras) {
    if (palavrasContagem[palavra]) {
        palavrasContagem[palavra] += 1
    } else {
        palavrasContagem[palavra] = 1
    }
    palavrasContagem[palavras] = 1
}

let palavrasContagemArray = Object.entries(palavrasContagem)
let palavrasMais6Ocorrencias = []

for (parChaveValor of palavrasContagemArray) {
    if (parChaveValor[1] >= 6 && parChaveValor[0] != "") {
        palavrasMais6Ocorrencias(parChaveValor[0])
    }
}

function ordenacao(str1, str2) {
    if(str1 > str2) {
        return -1
    } else if (str2 > str1) {
        return 1
    } else {
        return 0
    }
}

console.log(palavrasMais6Ocorrencias.sort(ordenacao))