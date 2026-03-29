const carrinho = [
    {nome: 'Caneta', qtde: 10, preco: 7.99, fragil: false},
    {nome: 'Lápis', qtde: 1, preco: 2, fragil: false},
    {nome: 'Tesoura', qtde: 3, preco: 5, fragil: false},
    {nome: 'Caderno', qtde: 1, preco: 8, fragil: false}, 

    {nome: 'Impressora', qtde: 5, preco: 1000, fragil: true},   
    {nome: 'iPad', qtde: 2, preco: 7500, fragil: true},   
    {nome: 'Computador', qtde: 2, preco: 5000, fragil: true}   
]

const fragil = produto => produto.fragil === true;

const totalItem = produto => produto.qtde * produto.preco;

const totalizador = (total, valor) => total + valor;

const itensFrageis = carrinho.filter(fragil);
const total = itensFrageis.map(totalItem).reduce(totalizador);

const media = total / itensFrageis.length;

console.log(total, media);