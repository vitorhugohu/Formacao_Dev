test("Deve verificar se dois objetos são iguais", () => {
    expect({a:1, b:2}).toEqual({a:1, b:2})
})

test("Deve verificar se dois objetos são iguais, mesmo com propriedades indefinidas", () => {
    expect({a:1, b: undefined}).toEqual({a:1})
})

test("Deve verificar se dois objetos são iguais de forma estrita", () => {
    expect({a:1, b: undefined}).not.toStrictEqual({a:1})
    expect({a:1, b: undefined}).toStrictEqual({a:1, b: undefined})
})

test("Deve verificar se um objetio possui uma propriedade", () => {
    const obj = { nome: "Alice", idade: 35 }
    expect(obj).toHaveProperty("nome")
    expect(obj).toHaveProperty("idade")
})

test("Deve verificar se um objetio não possui uma propriedade", () => {
    const obj = { nome: "Alice", idade: 35 }
    expect(obj).not.toHaveProperty("nome")
    expect(obj).not.toHaveProperty("idade")
})

test("Deve verificar se um objeto possui um subset de campos", () => {
    const obj = {nome: "Alice", idade:35, email: "alice@gmail.com"}
    expect(obj).toMatchObject({nome: "Alice", idade: 35})
})

test("Deve verificar se um objeto não possui um subset de campos", () => {
    const obj = {nome: "Alice", idade:35, email: "alice@gmail.com"}
    expect(obj).not.toMatchObject({nome: "Alice", endereco: "Rua 123"})
})

test("Deve verificar se um objeto é uma instância de uma classe", () => {
    class Pessoa {
        constructor(public nome: string, public idade: number) {}
    }
    const p = new Pessoa("Alice", 35)
    expect(p).toBeInstanceOf(Pessoa)
})