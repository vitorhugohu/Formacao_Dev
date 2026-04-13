import { Router } from "express";

const router = Router();

router.get("/", (req, res) => {
    res.send("Aqui existem produtos");
});

router.get("/cozinha", (req, res) => {
    const prods = ["Colher", "Garfo", "Faca"];
    res.send(prods);
});

router.get("/banheiro", (req, res) => {
    const prods = ["Shampoo", "Condicionador", "Sabonete"];
    res.send(prods);
});

export default router;