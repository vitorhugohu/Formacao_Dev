class Data {
    constructor(dia, mes, ano) {
        this.dia = dia
        this.mes = mes
        this.ano = ano
    }

    exibir() {
        return `${this.dia}/${this.mes}/${this.ano}`
    }
}

const d1 = new Data(8, 10, 2024)
const d2 = new Data(9, 11, 1958)

console.log(d1, typeof d1)
console.log(d2.exibir())