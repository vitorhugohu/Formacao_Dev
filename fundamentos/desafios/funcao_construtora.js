function Produto(nome, preco, desconto = 0) {
    this.nome = nome
    this.preco = preco
    this.desconto = desconto

    this.precoFinal = function() {
        return (this.desconto * this.preco) - this.preco
    }
}

const p1 = new Produto('caneta', 2.4, 0.8)
const p2 = new Produto('lápis', 1.2, 0.1)

console.log(p1.precoFinal(), p2.precoFinal())