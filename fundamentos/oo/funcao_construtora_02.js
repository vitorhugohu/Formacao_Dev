function Data(dia, mes, ano) {
    this.dia = dia
    this.mes = mes
    this.ano = ano

    // Método de instância público (Comportamento)
    this.exibir = function () {
        return `${this.dia}/${this.mes}/${this.ano}`
    }
}

const d1 = new Data(1, 2, 2025)
const d2 = new Data(24, 12, 2025)

console.log(d1.exibir())
console.log(d2.exibir())
console.log(typeof Data)