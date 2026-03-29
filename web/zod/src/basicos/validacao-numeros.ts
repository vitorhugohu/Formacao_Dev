import z from "zod"

const numerosSchema = z.object({
    valor: z.number().nonpositive(),
    preco: z.number().nonnegative(),//.positive()
    nota: z.number().min(0).max(10),
    quantidade: z.number().gte(0).lte(1000).int(),
    desconto: z.number().gt(0).lt(100)
})

type NumerosSchema = z.infer<typeof numerosSchema>

const dados: NumerosSchema = {
    valor: -6,
    preco: 99.99,
    nota: 8.5,
    quantidade: 5,
    desconto: 80
}

console.log(numerosSchema.parse(dados))