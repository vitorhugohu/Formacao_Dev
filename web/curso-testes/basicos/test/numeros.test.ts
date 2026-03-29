test("Deve verificar se um valor é maior que outro", () => {
    expect(10).toBeGreaterThan(5)
})

test("Deve verificar se um valor é maior ou igual a outro", () => {
    expect(10).toBeGreaterThanOrEqual(10)
    expect(10).toBeGreaterThanOrEqual(5)
})

test("Deve verificar se um vlaor é menor que outro", () => {
    expect(10).toBeLessThan(20)
})

test("Deve verificar se um valor é menor ou igual a outro", () => {
    expect(10).toBeLessThanOrEqual(20)
    expect(10).toBeLessThanOrEqual(10)
})

test("Deve verificar se um valor é próximo de outro", () => {
    expect(0.2222223).toBeCloseTo(0.22, 2)
})