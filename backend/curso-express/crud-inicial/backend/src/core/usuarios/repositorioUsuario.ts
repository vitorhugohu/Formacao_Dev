import Senha from "../shared/Senha";
import Usuario from "./Usuario";

export default class RepositorioUsuario {
    usuarios: Usuario[] = [ new Usuario("maria@mmail.com", "12345"),
        new Usuario("vitor@mmail.com", "crvh123"),
        new Usuario("ana@mmail.com", "abcd")
    ];

    encontrarIndice(email:string) {
        const i = this.usuarios.findIndex((usr) => usr.email === email);
        return i;
    }

    usuarioExiste(email:string) {
        return this.encontrarIndice(email) >= 0;
    }

    loginCorreto(email:string, senha:string) {
        const i = this.encontrarIndice(email);
        const senhaEstaCorreta = Senha.comparar(senha, this.usuarios[i]?.senha);
        return senhaEstaCorreta;
    }
}