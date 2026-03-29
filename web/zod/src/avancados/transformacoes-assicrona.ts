import z from "zod"

async function nomeUsuarioExiste(nomeUsuario: string) {
    await new Promise((resolve) => setTimeout(resolve, 2000))
    const nomes = ["ana", "admin", "usuario"]
    return nomes.includes(nomeUsuario)
}

const pessoaSchema = z.object({
    nome: z.string(),
    sobrenome: z.string(),
    idade: z.number(),
    criadoEm: z.date(),
    nomeUsuario: z.string().transform(async (nomeUsuario) => {
        const nomeExiste = await nomeUsuarioExiste(nomeUsuario)
        if (nomeExiste) {
            return `${nomeUsuario.toLocaleLowerCase()}_${Math.floor(Math.random() ** 1000)}`
        }
        return nomeUsuario.toLowerCase()
    })
})

type Pessoa = z.infer<typeof pessoaSchema>

const dados: Pessoa = {
    nome: "Zé",
    sobrenome: "Silva",
    idade: 52,
    criadoEm: new Date("2010-01-01"),
    nomeUsuario: "admin"
};

(async() => {
    const  resultado = await pessoaSchema.parseAsync(dados)
    console.log(resultado)
})()
