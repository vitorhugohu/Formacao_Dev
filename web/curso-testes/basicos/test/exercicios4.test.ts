import { Utils } from "../src/Utils";

test("A função diferencaDeArrays deve lançar erro ao receber arrays com objetos", () => {
    const arr = [1, {a: 1}]
    const arr2 = [1, 2]
    expect(() => Utils.diferencaDeArrays(arr, arr2)).toThrow("Não pode ter objetos nos arrays")
    expect(() => Utils.diferencaDeArrays(arr2, arr)).toThrow("Não pode ter objetos nos arrays")
})

test("A função removerDuplicados deve lançar erro ao receber array com objetos", () => {
    const arr = [1, {a: 1}, {a: 1}]

    expect(() => Utils.removerDuplicados(arr)).toThrow("Não pode ter objetos no array")
})

describe("Testes da função calcularAreaCirculo", () => {
    test("Deve calcular a área de um círculo corretamente", () => {
        const area = Utils.calcularAreaCirculo(4)
        expect(area).toBeCloseTo(50.2655, 4)
    })

    test("Deve lançar erro para raios negativos", () => {
        expect(() => Utils.calcularAreaCirculo(-5)).toThrow("O raio não pode ser negativo")
    })

    test("Deve retornar área 0 para raio 0", () => {
        expect(Utils.calcularAreaCirculo(0)).toBe(0)
    })
})

describe("Testes da função buscarDadosComDelay", () => {
    jest.useFakeTimers()
    test("Deve resolver os dados após um delay", async () => {
        const promise = Utils.buscarDadosComDelay("dados", 1000)
        jest.advanceTimersByTime(1000)
        await expect(promise).resolves.toBe("dados")
    })
})

describe("Testes da função carregarRecursoComTimeout", () => {
    jest.useFakeTimers()
    test("Deve resolver o recurso antes do timeout", async () => {
        const buscarDado = () => Utils.buscarDadosComDelay("recurso", 500)
        const promise = Utils.carregarRecursoComTimeout(buscarDado, 1000)
        jest.advanceTimersByTime(500)
        await expect(promise).resolves.toBe("recurso")
    })

    test("Deve lançar erro se houver timeout", async () => {
        const buscarDado = () => Utils.buscarDadosComDelay("recurso", 1500)
        const promise = Utils.carregarRecursoComTimeout(buscarDado, 1000)
        jest.advanceTimersByTime(1000)
        await expect(promise).rejects.toThrow(new Error("Timeout ao carregar recurso"))
    })
})