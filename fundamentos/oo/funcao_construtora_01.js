// MOLDE!!! Função construtora!
function Data(dia, mes, ano) {
    // atributos públicos
    this.dia = dia
    this.mes = mes
    this.ano = ano
}

const d1 = new Data(1, 2, 2025) // obj ou instância #1
const d2 = new Data(24/12/2025) // obj ou instância #2

console.log(d1.mes)
console.log(d2)
console.log(typeof Data)