import z from "zod"

const nomeSchema = z.object({nome: z.string()})

const idadeSchema = z.object({idade: z.number()})

const nomeEIdadeSchema = z.object({
    valor: z.intersection(nomeSchema, idadeSchema),
    valorAlternativo: nomeSchema.and(idadeSchema)
})

type NomeEIdade = z.infer<typeof nomeEIdadeSchema>

const dados: NomeEIdade = {
    valor: {
        nome: "Ana",
        idade: 10
    },
    valorAlternativo: {
        nome: "Ana",
        idade: 10
    }
}

console.log(nomeEIdadeSchema.parse(dados))