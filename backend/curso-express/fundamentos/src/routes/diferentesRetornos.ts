import path from "path";
import { fileURLToPath } from "url";
import { Router } from "express";
const __filename = fileURLToPath(import.meta.url);
const __dirname = path.dirname(__filename);

const router = Router();

router.get("/variavel", (req, res) => {
    let v = "Adeus";
    res.send(v);
});

router.get("/variavelNumerica", (req, res) => {
    let v = 1758;
    res.json(v);
});

router.get("/objeto", (req, res) => {
    const obj = {
        nome: "Maria",
        idade: 54
    };
    res.send(obj); // obj será enviado como JSON
});

router.get("/arrayDeObjetos", (req, res) => {
    const objs = [
        {modelo: "Gol", ano: 1998},
        {modelo: "Uno", ano: 2005},
        {modelo: "Celta", ano: 2010}
    ];
    res.send(objs); // objs será enviado como JSON  
});

router.get("/html", (req, res) => {
    res.sendFile(path.join(__dirname, ".." , "assets", "pagina.html"));
});

router.get("/pdf", (req, res) => {
    res.sendFile(path.join(__dirname, "..","assets", "curriculo.pdf"));
});

export default router;