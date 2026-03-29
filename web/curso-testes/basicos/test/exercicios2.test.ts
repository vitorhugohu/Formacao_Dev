import { Utils } from "../src/Utils";

/*describe("Testes da função diferençaDeArrays", () => {
    test("Deve verificar a diferença entre arrays numéricos", () => {
        const arr1 = [1, 2, 3, 4]
        const arr2 = [4, 3, 67, 1]
        expect(Utils.diferencaDeArrays(arr1, arr2)).toEqual([2])
    })

    test("Deve verificar a diferença entre arrays de string", () => {
        const arr1 = ["a", "b", "c", "d"]
        const arr2 = ["a", "b", "f"]
        expect(Utils.diferencaDeArrays(arr1, arr2)).toStrictEqual(["c", "d"])
    })

    test("Deve  retornar um array vazio se o primeiro for um array vazio", () => {
        expect(Utils.diferencaDeArrays([], [1, 2])).toEqual([])
    })

    test("Deve retornar o primeiro array se o segundo for vazio", () => {
        const arr = [1, 2]
        expect(Utils.diferencaDeArrays(arr, [])).toEqual(arr)
    })

    test("Deve retornar um array vazio se os arrays forem iguais", () => {
        const arr = [1, 2, 3]
        expect(Utils.diferencaDeArrays(arr, arr)).toEqual([])
    })

    test("Deve funcionar corretamente com um array de objetos", () => {
        const arr1 = [{a:1}, {b:2}]
        const arr2 = [{a:1}]
        expect(Utils.diferencaDeArrays(arr1, arr2)).toEqual([{b:2}])
    })
})*/

describe("Testes da função removerDuplicados", () => {
    test("Deve remover duplicados de um array numérico", () => {
        const arr = [0, 1, 6.99, -965, 0, 1, 15, 6.99, -965, -80]
        expect(Utils.removerDuplicados(arr)).toEqual([0, 1, 6.99, -965, 15, -80])
    })

    test("Deve remover duplicados de um array de string", () => {
        const arr = ["a", "b", "a", "c", "a"]
        expect(Utils.removerDuplicados(arr)).toEqual(["a", "b", "c"])
    })

    test("Deve remover duplicados de um array de booleanos", () => {
        const arr = [true, false, true, false, true, true]
        expect(Utils.removerDuplicados(arr)).toEqual([true, false])
    })

    test("Deve retornar um array vazio se receber um array vazio", () => {
        expect(Utils.removerDuplicados([])).toEqual([])
    })
})

describe("Testes da função capitalizarString", () => {
    test("Deve capitalizar uma string em lower case", () => {
        const s = "bom dia"
        expect(Utils.capitalizarString(s)).toBe("Bom Dia")
    })

    test("Deve capitalizar uma string em upper case", () => {
        const s = "BOM DIA"
        expect(Utils.capitalizarString(s)).toBe("Bom Dia")
    })

    test("Deve capitalizar uma string com case mista", () => {
        const s = "BoM dIA"
        expect(Utils.capitalizarString(s)).toBe("Bom Dia")
    })

    test("Deve capitalizar uma string que contenha números", () => {
        const s = "b1o2m 3dia"
        expect(Utils.capitalizarString(s)).toBe("B1o2m 3dia")
    })

    test("Deve retornar uma string vazia se a string for vazia", () => {
        expect(Utils.capitalizarString("")).toBe("")
    })

    test("Não deve alterar numa string numérica", () => {
        const s = '123 456 789'
        expect(Utils.capitalizarString(s)).toBe(s)
    })

    test("Não deve alterar numa string de caracteres especiais", () => {
        const s = '?!? !?!'
        expect(Utils.capitalizarString(s)).toBe(s)
    })
})