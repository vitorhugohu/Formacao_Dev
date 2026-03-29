type Usuario = { nome: string, email: string }

const usuarios: Usuario[] = [
    {nome: 'João', email: 'joao@zgmail.com'},
    {nome: 'Vitor', email: 'vitor@zgmail.com'},
    {nome: 'Ana', email: 'ana@zgmail.com'},
    {nome: 'Amanda', email: 'amanda@zgmail.com'},
    {nome: 'Carlos', email: 'carlos@zgmail.com'},
    {nome: 'Rafael', email: 'rafael@zgmail.com'}
]

function buscarPorEmail(email: string): Usuario | null {
    return usuarios.find(u => u.email === email) ?? null
}

console.log(buscarPorEmail('ana@zgmail.com'))
console.log(buscarPorEmail('ruan@zgmail.com'))