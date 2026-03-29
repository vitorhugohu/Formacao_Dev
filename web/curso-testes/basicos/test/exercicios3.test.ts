import { Utils } from "../src/Utils"
describe("testes da função encontrarPorId", ()=>{
    const arr = [{id:1, a:1}, {id:2, b:2}, {id:3, c:3}]
    test("Deve retornar o objeto com id correspondente", ()=>{
        expect(Utils.encontrarPorId(arr,1)).toEqual({id:1, a:1})
        expect(Utils.encontrarPorId(arr,2)).toEqual({id:2, b:2})
        expect(Utils.encontrarPorId(arr,3)).toEqual({id:3, c:3})
    })

    test("Deve retornar undefined se o id não existir no array", ()=>{
        expect(Utils.encontrarPorId(arr,100)).toBeUndefined()
    })

})

describe("testes da função inverterObjeto", ()=>{
    test("Deve retornar um objeto vazio se o objeto passado for vazio", ()=>{
        expect(Utils.inverterObjeto({})).toEqual({})
    })
    test("Deve interverter propriedades com valores primitivos", ()=>{
        const obj = {nome:"Ana", idade: 54, salario:5009.65, admin:true }
        expect(Utils.inverterObjeto(obj)).toEqual({
            Ana:"nome",
            "54":"idade",
            "5009.65":"salario",
            "true":"admin"
        })
    })

    test("Deve interver propriedades com arrays e objetos",()=>{
        const obj = {array:[1,2,"a","b"], obj:{a:1}}
        expect(Utils.inverterObjeto(obj)).toEqual({
            '[1,2,"a","b"]': "array",
            '{"a":1}':"obj"
        })
    })
})

describe("testes da função deletarPropriedade", ()=>{
    test("Deve deletar a propriedade de um objeto", ()=>{
        const obj = {nome:"Alice", admin:true}
        expect(Utils.deletarPropriedade(obj, "admin")).toEqual({nome:"Alice"})
    })

    test("Deve deletar a propriedade array de um objeto", ()=>{
        const obj = {nome:"Alice", array: [1,2,3]}
        expect(Utils.deletarPropriedade(obj, "array")).toEqual({nome:"Alice"})
    })

    test("Deve deletar a propriedade objeto de um objeto", ()=>{
        const obj = {nome:"Alice", admin:{pagina:"pagina.com", status:"ativo"}}
        expect(Utils.deletarPropriedade(obj, "admin")).toEqual({nome:"Alice"})
    })

    test("Deve retornar um objeto vazio se o objeto passado for vazio", ()=>{
        expect(Utils.inverterObjeto({})).toEqual({})
    })

    test("Deve retornar o objeto original se a propriedade não existir", ()=>{
        const obj = {nome:"Alice", idade:35}
        expect(Utils.deletarPropriedade(obj, "endereco")).toEqual(obj)
    })
})