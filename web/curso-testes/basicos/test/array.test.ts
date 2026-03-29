test("Deve verificar se dois arrays são iguais", () => {
    const arr1 = [1, 2, 3]
    const arr2 = [1, 2, 3]
    expect(arr1).toEqual(arr2)
})

test("Deve verificar se dois arrays são iguais de forma estrita", () => {
    const arr1 = [1, 2, 3]
    const arr2 = [1, 2, 3]
    expect(arr1).toStrictEqual(arr2)
})

test("Deve verificar se dois arrays não são iguais", () => {
    const arr1 = [1, 2]
    const arr2 = [1, 2, 3]
    expect(arr1).not.toEqual(arr2)
})

test("Deve verificar se dois arrays não são iguais de forma estrita", () => {
    const arr1 = [1, 2]
    const arr2 = [1, 2, 3]
    expect(arr1).not.toStrictEqual(arr2)
})

test("Deve verificar se um array contém um elemento específico", () => {
    const arr = ["maçã", "banana", "laranja"]
    expect(arr).toContain("banana")
})

test("Deve verificar se um array não contém um elemento específico", () => {
    const arr = ["maçã", "banana", "laranja"]
    expect(arr).not.toContain("limão")
})

test("Deve verificar o tamanho do array", () => {
    const arr = [1, 2, 3, 4, 5]
    expect(arr.length).toBe(5)
    expect(arr).toHaveLength(5)
})

test("Deve verificar o tamanho do array", () => {
    const arr = [1, 2, 3, 4]
    expect(arr.length).not.toBe(5)
    expect(arr).not.toHaveLength(5)
})

test("Deve verificar se um objeto está presente em um array", () => {
    const obj = {nome: "Vitor", idade: 18}
    const arr = [obj]
    expect(arr).toContainEqual(obj)
})