import z, { email } from "zod"

async function verificaEmailExistente(email: string) {
    await new Promise((resolve) => setTimeout(resolve, 2000))
    const emails = ["usuario@teste.com", "admin@teste.com"]
    return emails.includes(email)
}

const registroSchema = z.object({
    nome: z.string().min(3).refine((valor) => {
        const temExclamacao = valor.includes("!")
        return temExclamacao
    }, {message: "O nome precisa incluir !"}),
    email: z.string().email().refine(async (email) => {
        const jaExiste = await verificaEmailExistente(email)
        return !jaExiste
    }, {message: "E-mail já existe na aplicação"}),
    senha: z.string().min(6),
    confirmacaoSenha: z.string().min(6)
}).refine((dados) => {
    return dados.senha === dados.confirmacaoSenha
}, {message: "As senhas não coincidem"})

type Registro = z.infer<typeof registroSchema>

const dados: Registro = {
    nome: "Vitor!",
    email: "admin@teste.com",
    senha: "123131",
    confirmacaoSenha: "123131"
};

(async () => {
    //const resultado = await registroSchema.parseAsync(dados)
    const resultado = await registroSchema.safeParseAsync(dados)
console.log(resultado)
})()