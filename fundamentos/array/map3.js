const carrinho = [
    {nome: 'Caneta', qtde: 10, preco: 7.99},
    {nome: 'Impressora', qtde: 4, preco: 2},
    {nome: 'Lápis', qtde: 1, preco: 2},
    {nome: 'Tesoura', qtde: 3, preco: 5},
    {nome: 'Caderno', qtde: 1, preco: 8}   
]

const apenasNome = produto => produto.nome
const calcularTotal = produto => produto.qtd * produto.preco

console.log(carrinho.map(apenasNome))