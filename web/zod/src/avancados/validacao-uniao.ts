import z from "zod"

const stringOuNumeroSchema = z.object({
    valor: z.union([
        z.string().min(3),
        z.number().max(10)
    ]),
    valorAlternativo: z.string().min(3).or(z.number().min(10))
})

type StringOuNumero = z.infer<typeof stringOuNumeroSchema>

const dados:StringOuNumero = {
    valor: 20,
    valorAlternativo: "311"
}

console.log(stringOuNumeroSchema.parse(dados))