import z from "zod"

const usuarioSchema = z.object({
    nome: z.string(),
    idade: z.number(),
    email: z.string()
})

type Usuario = z.infer<typeof usuarioSchema>

const ze: Usuario = {
    nome: "Zé",
    idade: 30,
    email: "z@mail.com"
}

// const resultado = usuarioSchema.parse(ze)
const resultado = usuarioSchema.safeParse(ze)
console.log(resultado)