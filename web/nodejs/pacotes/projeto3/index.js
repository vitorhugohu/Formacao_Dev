import { salvar, deletar, pegaDados, persistirValores } from "./Banco.js";
import { finaliza, menu, le, textoAzul, textoVerde, menuSelecaoUsuario } from "./interface.js";

const itensMenu = [" Adicionar ", " Editar ", " Deletar ", " Ver Todos ", " Persistir ", " Sair "];
let nome, id;

while (true) {
    const selecionado = await menu(itensMenu);

    switch (selecionado.trim().toLowerCase()) {
        case "adicionar":
            nome = await le("Digite o nome do usuário: ");
            salvar(nome);
            textoVerde("Feito!");
            break;

        case "editar":
            id = await menuSelecaoUsuario(pegaDados());
            nome = await le("Nome atualizado: ");
            salvar(nome, id);
            textoVerde("Feito!");
            break;

        case "deletar":
            id = await menuSelecaoUsuario(pegaDados());
            deletar(id); // ✅ agora funciona
            textoVerde("Usuário deletado!");
            break;

        case "ver todos":
            textoAzul(pegaDados());
            break;

        case "persistir":
            persistirValores();
            textoVerde("Feito!");
            break;

        case "sair":
            finaliza();
            textoVerde("Até mais!");
            process.exit(); // ou break;

        default:
            console.log(`${selecionado.trim()} não é válido`);
    }
}
