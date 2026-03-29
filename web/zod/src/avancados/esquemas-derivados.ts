import z from "zod"

const produtoSchema = z.object({
    id: z.number().positive(),
    nome: z.string().min(3),
    preco: z.number().positive(),
    descricao: z.string().min(5),
    estoque: z.number().int().nonnegative()
})

type Produto = z.infer<typeof produtoSchema>

//const produtoAtualizadoSchema = produtoSchema.partial()
//const produtoAtualizadoSchema = produtoSchema.pick({id: true, nome: true, preco: true})
const produtoAtualizadoSchema = produtoSchema.omit({
    id: true, nome: true, preco: true
})

type produtoAtualizado = z.infer<typeof produtoAtualizadoSchema>

const dados = {
    id: 1,
    nome: "Lápis de Cor",
    preco: 1.99,
    descricao: "Um lápis colorido",
    estoque: 20
}

console.log(produtoSchema.parse(dados))
console.log(produtoAtualizadoSchema.parse(dados))