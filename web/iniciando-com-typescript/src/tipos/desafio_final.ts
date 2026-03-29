// type ContaCorrente (numero, saldo, movimentar)
type ContaCorrente = {
    numero: number,
    saldo: number,
    movimentar: (valor: number) => void
}

// type Cliente (nome, email, contas[]: ContaCorrente)

type Cliente = {
    nome: string,
    email: string,
    contas: ContaCorrente[]
}

function movimentar(this: ContaCorrente, valor: number) {
        this.saldo +=  valor
    }

const clientes: Cliente[] = [
    { nome: 'Ana', email: 'ana@zgmail.com', contas: [{numero: 1234, saldo: 0, movimentar }, 
    {numero: 6444, saldo: 350.33, movimentar}]},
    { nome: 'João', email: 'joao@zgmail.com', contas: [{numero: 6634, saldo: 730, movimentar }, 
    {numero: 3454, saldo: 1250.33, movimentar}]}
]

function movimentarConta(numConta: number, valor: number) {
    const conta = clientes.map(cli => { 
        return cli.contas.find(cc => cc.numero === numConta)
    }).filter(c => c)[0]
    conta?.movimentar(valor)
}

function consultarSaldo(numConta: number): number | null {
    const conta = clientes.map(cli => { 
        return cli.contas.find(cc => cc.numero === numConta)
    }).filter(c => c)[0]
    return conta?.saldo ?? null
}

movimentarConta(3454, 6444)

console.log(consultarSaldo(3454))