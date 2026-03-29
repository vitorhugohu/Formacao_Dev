import z from "zod"

const arraySchema = z.object({
    tags: z.array(z.string().min(3)).min(1).max(5),
    precos: z.array(z.number().positive()).length(3),
    notas: z.array(z.number().max(10).nonnegative().int()).nonempty()
})

type ArraySchema = z.infer<typeof arraySchema>

const dados: ArraySchema = {
    tags: ["javascript", "typescript", "react"],
    precos: [15.42, 99.21, 100],
    notas: [5, 9.4, 10]
}

console.log(arraySchema.parse(dados))