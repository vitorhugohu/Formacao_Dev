import chalk from "chalk";
import server from "server";
import { DateTime } from "luxon";

const {get} = server.router

function imprimeHora(cidade, hora) {
    console.log(chalk.bgBlue(`Em ${cidade} são ${hora}`))
}
server({port: 8080}, [
    get("/", (ctx) => "Olá mundo!"),
    get("/roma", () => {
        const h = DateTime.local({zone: "Europe/Rome"}).toFormat("HH:mm:ss")
        imprimeHora("Roma", h)
        return h
    }),
    get("/luanda", () => {
        const h = DateTime.local({zone: "Africa/Luanda"}).toFormat("HH:mm:ss")
        imprimeHora("Luanda", h)
        return h
    }),
    get("/seoul", () => {
        const h = DateTime.local({zone: "Asia/Seoul"}).toFormat("HH:mm:ss")
        imprimeHora("Seoul", h)
        return h
    }),
    get("/cuiaba", () => {
        const h = DateTime.local({zone: "America/Cuiaba"}).toFormat("HH:mm:ss")
        imprimeHora("Cuiaba", h)
        return h
    })
])

/*const azul = (texto) => console.log(chalk.blue(texto));
const aviso = (texto) => console.log(chalk.bgYellow.bold(texto));
const erro = (texto) => console.log(chalk.bgRed.bold.italic(texto));

azul("Sou um texto")
aviso("Cuidado!")
erro("Deu ruim!")*/