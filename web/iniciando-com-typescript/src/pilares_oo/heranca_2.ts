interface Entidade {
    id: number
}

interface Vendavel {
    nome: string
    preco: number
    desconto: number
}

class Produto implements Entidade, Vendavel {
    
    constructor(
        readonly id: number,
        readonly nome: string,
        readonly preco: number,
        readonly desconto: number
    ) {}

    get precoFinal() {
        return this.preco * (1 - this.desconto)
    }
}

class Servico implements Entidade, Vendavel {
     constructor(
        readonly id: number,
        readonly nome: string,
        readonly preco: number,
        readonly desconto: number
    ) {}
}

const p1 = new Produto(123, 'caneta', 9.80, 0.5)
console.log(p1)
console.log(p1.precoFinal)

let v1: Vendavel = new Produto(1, 'caneta', 10, 0)
console.log(v1)

v1 = new Servico(2, 'montar carroça', 20, 0)
console.log(v1)

export {}