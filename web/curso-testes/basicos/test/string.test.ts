test("Deve verificar se uma string é 'abc'", () => {
    expect("abc").toBe("abc")
    expect("abc").toMatch("abc")
})

test("Deve verificar se a string não é 'abc'", () => {
    expect("asc").not.toBe("abc")
    expect("abfc").not.toMatch("abc")
})

test("Deve verificar se a string começa com 'abc'", () => {
    expect("abc123abc").toMatch(/^abc/)
})

test("Deve verificar se a string não começa com 'abc'", () => {
    expect("ac123abc").not.toMatch(/^abc/)
})

test("Deve verificar se uma string contém uma substring", () => {
    expect("abc123").toContain("c12")
})

test("Deve verificar se uma string não contém uma substring", () => {
    expect("abc23").not.toContain("c12")
})