function resolvida() {
    return new Promise ((resolve) => {
        setTimeout(() => {
            resolve("dados")
        }, 1000)
    })
}

function rejeitada() {
    return new Promise ((resolve, reject) => {
        setTimeout(() => {
            reject("falha")
        }, 1000)
    })
}

describe("Deve verificar o resultado de uma promise resolvida", () => {

    test("Usando sintaxe de promise", () => {
    return resolvida().then(resultado => {
        expect(resultado).toBe("dados")
    })
})

    test("Usando sintaxe async/await", async () => {
    const resultado = await resolvida()
    expect(resultado).toBe("dados")
})

    test("Usando resolves", async () => {
    await expect(resolvida()).resolves.toBe("dados")
})
})

describe("Deve verificar o resultado de uma promise rejeitada", () => {

    test("Usando sintaxe de promise", () => {
    return rejeitada().then(resultado => {
        expect(resultado).toBe("dados")
        }).catch((e) => {
            expect(e).toBe("falha")
        })
    })

    test("Usando sintaxe async/await", async () => {
        try {
            await rejeitada()
        } catch(e: any) {
            expect(e).toBe("falha")
        }
    })

    test("Usando rejects", async () => {
        await expect(rejeitada()).rejects.toBe("falha")
    })
})

test("Deve testar usando fake timers", async () => {
    jest.useFakeTimers()
    const f = resolvida()
    jest.advanceTimersByTime(1000)
    await expect(f).resolves.toBe("dados")
})