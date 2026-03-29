const carrinho = [
    {nome: 'Caneta', qtde: 10, preco: 7.99},
    {nome: 'Impressora', qtde: 0, preco: 200.78},
    {nome: 'Lápis', qtde: 1, preco: 2},
    {nome: 'Tesoura', qtde: 0, preco: 5},
    {nome: 'Caderno', qtde: 1, preco: 8}   
]

const qtdeMaiorQueZero = produto => produto.qtde > 0
const apenasNome = produto => produto.nome

const produtosFinais = carrinho.filter(qtdeMaiorQueZero).map(apenasNome)

console.log(produtosFinais)