import { Utils } from "../src/Utils"

describe("Testes da função max", () => {
    test("Deve retornar null se receber um array vazio", () => {
        expect(Utils.max([])).toBeNull()
    })
    test("Deve retornar o maior número do array", () => {
        expect(Utils.max([1, 2, 3, 4, 5])).toBe(5)
    })
})

describe("Testes da função min", () => {
    test("Deve retornar null se receber um array vazio", () => {
        expect(Utils.min([])).toBeNull()
    })
    test("Deve retornar o menor número do array", () => {
        expect(Utils.min([1, 2, 3, 4, 5])).toBe(1)
    })
})

describe("Testes da função somaArray", () => {
    test("Deve retornar 0 se o array for vazio", () => {
        expect(Utils.somaArray([])).toBe(0)
    })
    test("Deve somar números positivos, negativos e com ponto flutuante", () => {
        const arr = [1, 2, 3, 5.25, 1.30, -10, -5.55]
        expect(Utils.somaArray(arr)).toBeCloseTo(-3, 2)
    })
})

describe("Testes da função limitar número", () => {
    const min = 0
    const max = 10

    test("Deve retornar o número, se o número estiver dentro do intervalo", () => {
        const n = 5
        expect(Utils.limitarNumero(n, min, max)).toBe(5)
    })

    test("Deve retornar o valor mínimo se o número estiver abaixo dele", () => {
        const n = -10
        expect(Utils.limitarNumero(n, min, max)).toBe(min)
    })
    
    test("Deve retornar o valor máximo se o número for maior que ele", () => {
        const n = 900   
        expect(Utils.limitarNumero(n, min, max)).toBe(max)
    })

    test("Deve retornar o valor mínimo decimal se o número estiver abaixo dele", () => {
        const min = -9.5
        const n = -10
        expect(Utils.limitarNumero(n, min, max)).toBe(min)
    })
    
    test("Deve retornar o valor máximo decimal se o número for maior que ele", () => {
        const max = 10.999
        const n = 11
        expect(Utils.limitarNumero(n, min, max)).toBe(max)
    })

})