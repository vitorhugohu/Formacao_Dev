import express from "express";
import rotasBasico from "./routes/basico.ts";
import rotasDiferentesRetornos from "./routes/diferentesRetornos.ts";
import rotasRotasAninhadas from "./routes/rotasAninhadas.ts";
import rotasStatus from "./routes/status.ts";
import rotasParametrosDeRota from "./routes/parametrosDeRota.ts";
import rotasParametrosDeQuery from "./routes/parametrosDeQuery.ts";
import rotasMetodos from "./routes/metodos.ts";
const app = express();
const porta = 8080;

// middleware
// app.use((req, res, next) => {
//    console.log(`Data: ${Date.now()}`);
//    next();
//

//middlewares para leitura do body da requisição
app.use(express.urlencoded({extended:true}));

app.use(rotasBasico);
app.use(rotasDiferentesRetornos);
app.use("/produtos", rotasRotasAninhadas);
app.use("/status", rotasStatus);
app.use("/parametrosDeRota", rotasParametrosDeRota);
app.use("/parametrosDeQuery", rotasParametrosDeQuery);
app.use("/metodos", rotasMetodos);

app.listen(porta, () => {
    console.log("Servidor Rodando");
});