import z from "zod"

const dataSchema = z.object({
    dataNascimento: z.date().min(new Date("2000-01-01")),
    dataCadastro: z.date().max(new Date())
})

type DataSchema = z.infer<typeof dataSchema>

const dados: DataSchema = {
    dataNascimento: new Date("2005-01-01"),
    dataCadastro: new Date("2026-01-01")
}

console.log(dataSchema.parse(dados))