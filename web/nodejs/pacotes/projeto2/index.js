import pensador from "pensador-scrap";
import fs from "fs";

const autor = "descon!!nhecido";
const {error, success} = await pensador.search({
    query: autor,
    limit: 12
})

// console.log(error)
// console.log(success)
let pensamentoPraSalvar
try {
    const pensamentos = success.thought
    const indiceAleatorio = Math.floor(Math.random() * pensamentos.length)
    const pensamentoSelecionado = pensamentos[indiceAleatorio].content

    // console.log(pensamentoSelecionado)

    pensamentoPraSalvar = `Pensamento de ${autor} -> ${pensamentoSelecionado}\n`
    // console.log(pensamentoPraSalvar)
} catch(e) {
     pensamentoPraSalvar = `${autor} não tem pensamentos\n`
    console.log(pensamentoPraSalvar)
} finally {
    // fs.writeFileSync("frases.txt", pensamentoPraSalvar, "utf8")
    fs.appendFileSync("frases.txt", pensamentoPraSalvar, "utf8")

    const texto = fs.readFileSync("frases.txt", "utf8")
    console.log(texto)
}
