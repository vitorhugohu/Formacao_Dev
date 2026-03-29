interface Entidade {
    id: string
}

interface EntidadeComDatas extends Entidade {
    criadoEm: Date
    atualizadoEm: Date
    excluidoEm?: Date
}

interface Usuario extends EntidadeComDatas {
    nome: string
    email: string
    senha?: string
}

// Exemplo de usuario
const u1: Usuario = {
    id: '2',
    nome: 'Vitor',
    email: 'vitor@gmail.com',
    criadoEm: new Date(),
    atualizadoEm: new Date()
}



// Exemplo de produto

interface Vendavel {
    preco: number
    desconto: number
}

interface Produto extends EntidadeComDatas, Vendavel {
    
}

const p1: Produto = {
    id: '2131',
    preco: 1000,
    desconto: 0.4,
    criadoEm: new Date(),
    atualizadoEm: new Date()
}

console.log(u1)

console.log(p1)

export {}