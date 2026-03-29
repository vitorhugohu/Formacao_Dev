import z from "zod/v4"

z.config(z.locales.pt()) // específica do zod v4

const errosPadraoSchema = z.object({
    nome: z.string().trim().max(50).min(5),
    cpf: z.string().trim().length(11),
    idade: z.number().positive()
})

type ErrosPadrao = z.infer<typeof errosPadraoSchema>

const errosPersonalizadosPadraoSchema = z.object({
    nome: z.string("O nome precisa ser um texto").trim().max(50, "O nome precisa ter no máximo 50 caracteres").min(5, "O nome é muito pequeno, aumente o nome!"),
    cpf: z.string().trim().length(1, "O CPF precisa ter exatamente 11 caracteres, não coloque . ou -"),
    idade: z.number("A idade tem que ser um número válido").positive({message: "A idade precisa ser positiva"})
})

const dados: ErrosPadrao = {
    nome: "Ana",
    cpf: "1234142414023",
    idade: -6
}

try {
    //console.log(errosPadraoSchema.parse(dados))
    console.log(errosPersonalizadosPadraoSchema.parse(dados))
} catch(e:any) {
    // console.log(e)
    // console.log(e.errors)
    // console.log(e.format()) // zod v3
    // console.log(z.formatError(e))
    // console.log(z.treeifyError(e)) // zod v4
    // console.log(z.flattenError(e))
    console.log(z.prettifyError(e)) // zod v4
}