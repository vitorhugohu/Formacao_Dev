beforeAll(() => {
    console.log("Antes de tudo")
})

beforeEach(() => {
    console.log("Antes de cada")
})

test("Deve executar1", () => {
    console.log("1")
    expect(1).toBe(1)
})

test("Deve executar2", () => {
    console.log("2")
    expect(1).toBe(1)
})

afterEach(() => {
    console.log("Depois de cada")
})

afterAll(() => {
    console.log("Depois de tudo")
})