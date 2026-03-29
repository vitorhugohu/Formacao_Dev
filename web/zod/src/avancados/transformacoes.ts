import z from "zod"

const pessoaSchema = z.object({
    nome: z.string(),
    sobrenome: z.string(),
    idade: z.string().transform((idade, ctx) => {
        try {
             const idadeConvertida = +idade
        if (Number.isNaN(idadeConvertida)) {
            throw new Error("Valor da idade precisa ser numérico")
        }
        } catch(e: any) {
            ctx.addIssue({
                code: "custom",
                message: e.message
            })
            return z.NEVER
        }
    }),
    criadoEm: z.date().transform((criadoEm) => {
        const isoString = criadoEm.toISOString()
        return isoString
    })
}).transform((dados) => {
    return {
        ...dados,
        nomeCompleto: `${dados.nome} ${dados.sobrenome}`
    }
})

type Pessoa = z.infer<typeof pessoaSchema>

const dados = {
    nome: "Zé",
    sobrenome: "Silva",
    idade: "58",
    criadoEm: new Date("2010-01-01")
}

console.log(pessoaSchema.parse(dados))