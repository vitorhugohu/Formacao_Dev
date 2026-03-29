import z from "zod"

class Pessoa {
    constructor(public nome: string) {

    }
}

const pessoaSchema = z.instanceof(Pessoa)

const joao = new Pessoa("João")

console.log(pessoaSchema.parse(joao))