function entrePraDiretoria(aluno) {
    let objRetorno = {
        nome: aluno.nome,
        materias: []
    }

    for (let materia of aluno.materias) {
        let acc = 0

        for (let nota of materia.notas) {
            acc += nota
        }

        objRetorno.materias.push({
            nome: materia.nome,
            media: acc / materia.notas.length
        })
    }

    return objRetorno
}

function entregaProAluno(aluno) {
    let alunoComMedia = entrePraDiretoria(aluno)

    let objRetorno = {
        nome: alunoComMedia.nome,
        materias: []
    }

    for (let materia of alunoComMedia.materias) {
        let conceito

        if (materia.media >= 7) {
            conceito = "APROVADO"
        } else if (materia.media >= 5) {
            conceito = "RECUPERAÇÃO"
        } else {
            conceito = "REPROVADO"
        }

        objRetorno.materias.push({
            nome: materia.nome,
            conceito
        })
    }

    return objRetorno
}

function entregaProsPais(aluno) {
    let alunoComConceito = entregaProAluno(aluno)
    let conceitos = []

    for (let materia of alunoComConceito.materias) {
        conceitos.push(materia.conceito)
    }

    if (conceitos.includes("REPROVADO")) {
        return "REPROVADO"
    }

    if (!conceitos.includes("RECUPERAÇÃO")) {
        return "APROVADO"
    }

    return "RECUPERAÇÃO"
}

const joaozinho = { 
    nome: "Joaozinho",
    materias: [
         { 
            nome: "Português",
            notas: [7.4, 5.6, 10, 0] },
            { 
                nome: "Matemática",
                notas: [4.4, 5.0, 8.2, 7.0] },
                { 
                  nome: "Ciências",
                  notas: [8.2, 7.6, 8.0, 6.3] },
                   { 
                    nome: "Estudos Sociais",
                    notas: [9.2, 7.6, 8.5, 7.0] }
                 ] 
}

console.log(entrePraDiretoria(joaozinho))
console.log(entregaProAluno(joaozinho))
console.log(entregaProsPais(joaozinho))