interface Usuario {
    id: number
    nome: string
    email: string
    senha?: string
}

interface CasoDeUso {
    executar(entrada: any): any
}

class RegistrarUsuario implements CasoDeUso {
    executar(usuario: Usuario) {
       console.log('Executando registrar usuario')
       console.log(usuario)
    }
    
}

const u1: Usuario = {
    id: 2,
    nome: 'Maria',
    email: 'maria@gmail.com',
    senha: '!@#$1234'
}
const cadoDeUso: CasoDeUso = new RegistrarUsuario()
cadoDeUso.executar(u1)

export {}