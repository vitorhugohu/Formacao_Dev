interface Flexivel {
    nome: string
    [atrib: string]: number | string
}

const f1: Flexivel = {
    nome: 'ana',
    idade: 18,
    sexo: 'feminino',
    cidade: 'fortaleza'
}

console.log(f1.nome)

export {}