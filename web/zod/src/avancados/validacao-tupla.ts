import z from "zod"

const tuplaSchema = z.object({
    coordenada: z.tuple([z.number().min(0).max(100), z.number().min(0).max(100)]),
    diferentesTipos: z.tuple([z.string(), z.boolean(), z.number()])
})

type Tupla = z.infer<typeof tuplaSchema>

const dados: Tupla = {
    coordenada: [100, 57],
    diferentesTipos: ["oi", false, 87]
}

console.log(tuplaSchema.parse(dados))