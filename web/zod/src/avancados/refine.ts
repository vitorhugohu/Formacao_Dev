import z from "zod"

const registroSchema = z.object({
    nome: z.string().min(3).refine((valor) => {
        const temExclamacao = valor.includes("!")
        return temExclamacao
    }, {message: "O nome precisa incluir !"}),
    email: z.string().email(),
    senha: z.string().min(6),
    confirmacaoSenha: z.string().min(6)
}).refine((dados) => {
    return dados.senha === dados.confirmacaoSenha
}, {message: "As senhas não coincidem"})

type Registro = z.infer<typeof registroSchema>

const dados: Registro = {
    nome: "Vitor",
    email: "vitor@gmail.com",
    senha: "123131",
    confirmacaoSenha: "123131"
}

console.log(registroSchema.parse(dados))