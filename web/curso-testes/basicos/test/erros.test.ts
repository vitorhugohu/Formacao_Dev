function erro(lancar: boolean = true) {
    if(lancar) {
        throw new Error("erro")
    }
}

function erroPromise() {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            reject(new Error("falha"))
        }, 1000)
    })
}

test("Deve verificar se um erro foi lançado", () => {
    expect(erro).toThrow("erro")
})

test("Deve verificar se um erro foi lançado na chamada com parâmetros", () => {
    expect(() => erro(true)).toThrow("erro")
})

test("Deve verificar se um erro foi lançando a  usando sintaxe de promise", () => {
    return erroPromise().then(resultado => {
            expect(resultado).toBe("dados")
        }).catch((e) => {
            expect(e).toEqual(new Error("falha"))
        })
})

test("Deve verificar se um erro foi lançado usando a sintaxe async/await", async () => {
    try {
        await erroPromise()
    } catch(e: any) {
        expect(e).toEqual(new Error("falha"))
    }
})

test("Deve verificar se um erro foi lançado usando rejects", async () => {
    await expect(erroPromise).rejects.toThrow("falha")
})