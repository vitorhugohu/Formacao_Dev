interface Usuario {
    id: number
    nome: string
    email: string
    senha?: string
}

const usuarioLogado: Usuario = {
    id: 123,
    nome: 'Vitor',
    email: 'vitorhuabmo@gmail.com'
}

console.log(usuarioLogado.id)
console.log(usuarioLogado.nome)
console.log(usuarioLogado.email)

const usuarioOpcional: Partial<Usuario> = {
    id: 2,
    senha: '219312'
}

console.log(usuarioOpcional.id)
console.log(usuarioOpcional.nome)
console.log(usuarioOpcional.email)
console.log(usuarioOpcional.senha)

const usuarioCompleto: Required<Usuario> = {
     id: 13,
    nome: 'vitor',
    email: 'vitor@gmail.com',
    senha: 'fafaf2'
}

console.log(usuarioCompleto.id)
console.log(usuarioCompleto.nome)
console.log(usuarioCompleto.email)
console.log(usuarioCompleto.senha)

export {}