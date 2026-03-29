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

console.log(d1.exibir())