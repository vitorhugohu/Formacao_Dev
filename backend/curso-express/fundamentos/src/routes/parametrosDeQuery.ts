import { Router } from "express";

const router = Router();

// /cores/:id -> paràmetro de rota. O que eu quero acessar.

// /cores?ordenaPor=nome&case=upper -> parâmetro de query. Como eu quero acessar.

router.get("/cores", (req, res) => {
    let cores = ["vermelho", "verde", "azul"];
    //console.log(req.query);

    if (req.query.case === "upper") {
        cores = cores.map(cor => cor.toUpperCase());
    } else if (req.query.case === "lower") {
        cores = cores.map(cor => cor.toLowerCase());
    }

    if(req.query.punct) {
        cores = cores.map(cor=>`${cor}${req.query.punct}`);
    }

    if(req.query.filtro) {
        cores = cores.filter(cor => cor.toLowerCase().includes(`${req.query.filtro}`));
    }
 
    res.status(200).send(cores);
});

export default router;