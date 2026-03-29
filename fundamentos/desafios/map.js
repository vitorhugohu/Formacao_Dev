const alunos = [
    { nome: "Kenneth", n1: 4.5, n2: 6.3, n3: 7.6, n4: 5.1},
    { nome: "Atlante", n1: 2.5, n2: 5.1, n3: 10.0, n4: 8.9},
    { nome: "Rolland", n1: 6.0, n2: 7.7, n3: 5.5, n4: 1.2},
    { nome: "Konrad", n1: 3.3, n2: 4.1, n3: 5.8, n4: 9.8},
    { nome: "Hamel", n1: 8.8, n2: 8.6, n3: 0.0, n4: 6.7},
    { nome: "Belinda", n1: 3.8, n2: 1.0, n3: 8.2, n4: 6.4}
]

function calcularMedia(aluno) {
    return {
        nome: aluno.nome,
        media: (aluno.n1 + aluno.n2 + aluno.n3 + aluno.n4) / 4
    }
}

console.log(alunos.map(calcularMedia))

// { nome: vitor, media: 28.9}