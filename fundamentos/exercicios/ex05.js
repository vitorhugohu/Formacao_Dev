function multiplicacaoDistributiva(array1, array2) {
    for (let i = 0; i < array1.length; i++) {
        for (let j = 0; j < array2.length; j++) {
            console.log(`${array1[i]} * ${array2[j]} = ${array1[i] * array2[j]}`)
        }
    }
}

const array1 = [1, 2, 5, 6, 7, 5]
const array2 = [10, 100]

multiplicacaoDistributiva(array1, array2)