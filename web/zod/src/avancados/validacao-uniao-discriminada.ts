import z from "zod"

const cachorroSchema = z.object({
    tipo: z.literal("cachorro"),
    latido: z.string(),
    raca: z.string()
})

const gatoSchema = z.object({
    tipo: z.literal("gato"),
    miado: z.string(),
    qtdeVidas: z.number()
})

const peixeSchema = z.object({
    tipo: z.literal("peixe"),
    agua: z.enum(["salgada", "doce"])
})

const tipoAnimalSchema = z.discriminatedUnion("tipo", [cachorroSchema, gatoSchema, peixeSchema])

type TipoAnimal = z.infer<typeof tipoAnimalSchema>

const toto:TipoAnimal = {
    tipo: "cachorro",
    latido: "au au",
    raca: "pastor alemão"
}

const mimi: TipoAnimal = {
    tipo: "gato",
    miado: "miauuuu",
    qtdeVidas: 5

}

const nemo: TipoAnimal = {
    tipo: "peixe",
    agua: "doce"
}

console.log(tipoAnimalSchema.parse(toto))
console.log(tipoAnimalSchema.parse(mimi))
console.log(tipoAnimalSchema.parse(nemo))