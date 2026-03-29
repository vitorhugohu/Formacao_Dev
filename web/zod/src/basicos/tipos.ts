import z from "zod"

enum TIPO {
    ADMIN = "admin",
    PADRAO = "padrão"
}

const redesSociaisChema = z.object({
    facebook: z.string(),
    instragram: z.string()
})

const usuarioSchema = z.object({
    nome: z.string(),
    idade: z.number(),
    email: z.string(),
    ativo: z.boolean(),
    criadoEm: z.date(),
    deletadoEm: z.date().optional(),
    tipo: z.nativeEnum(TIPO),
    redesSociais: redesSociaisChema,
    planoPagamento: z.literal("mensal"),
    itens: z.array(z.string()),
    historico: z.any(),
    devendo: z.undefined(),
    enderecoId: z.null()
})

type Usuario = z.infer<typeof usuarioSchema>

const ze: Usuario = {
    nome: "Zé",
    idade: 30,
    email: "z@mail.com",
    ativo: true,
    criadoEm: new Date(),
    deletadoEm: new Date(),
    tipo: TIPO.ADMIN,
    redesSociais: {
        facebook: "facebook.com/ze",
        instragram: "instagram.com/ze"
    },
    planoPagamento: "mensal",
    itens: ["camiseta", "sapato", "jaqueta"],
    historico: {ultimaCompra: "10/2/2021"},
    devendo: undefined,
    enderecoId: null
}

console.log(usuarioSchema.parse(ze))