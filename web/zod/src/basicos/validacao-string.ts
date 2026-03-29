import z from "zod"

const stringSchema = z.object({
    nome: z.string().trim().min(3).max(10),
    cpf: z.string().length(11).regex(/\d{11}/),
    email: z.string().email().toLowerCase(),
    linkBlog: z.string().startsWith("https://").includes("blog.com").endsWith("/"),
    linkSite: z.string().url()
})

type StringSchema = z.infer<typeof stringSchema>

const dados: StringSchema = {
    nome: "Ana",
    cpf: "123.131.131-21",
    email: "a@mail.com",
    linkBlog: "https://blog.com/ana/",
    linkSite: "https://ana.com"
}

console.log(stringSchema.parse(dados))