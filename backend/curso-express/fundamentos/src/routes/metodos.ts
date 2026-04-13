import { Router } from "express";

const router = Router();

let pessoas : any = [
    {nome: "João", idade: 30},
    {nome: "Maria", idade: 25},
    {nome: "Pedro", idade: 35}
];

router.get("/", (req, res) => {
    res.status(200).send(pessoas);
});

router.post("/", (req, res) => {
    const novaPessoa = {
        nome: req.body.nome,
        idade: +req.body.idade
    };
    pessoas.push(novaPessoa);
    res.status(201).send(pessoas);
});

router.get("/:id", (req, res) => {
    let indice = +req.params.id;
    
    if(indice >= 0 && indice < pessoas.length) {
        res.status(200).send(pessoas[indice]);
    } else {
        res.status(204).send(pessoas);
    }
});

router.delete("/:id", (req, res) => {
    const indice = +req.params.id;
    const dadosAtualizados = pessoas.filter((pessoa, i) => i !== indice);
    if(dadosAtualizados.length === pessoas.length) {
        res.status(406).send(pessoas);
    } else {
        pessoas = [...dadosAtualizados];
        res.status(200).send(pessoas);
    }
});

router.put("/:id", (req, res) => {
    const indice = +req.params.id;
    const dadosAtualizados = req.body;
    if(indice >= 0 && indice < pessoas.length) {
        if(dadosAtualizados.nome) {
            pessoas[indice].nome = dadosAtualizados.nome;
        }

        if(dadosAtualizados.idade) {
            pessoas[indice].idade = +dadosAtualizados.idade;
        }

        res.status(200).send(pessoas);
    } else {
        res.status(406).send(pessoas);
    }
});

export default router;