let multi = (a, b) => a * b;
let soma = (a, b) => a + b;
let sub = (a, b) => a - b;

let calcular = (a, b, fn) => fn(a, b);

console.log(multi(4, 5))
console.log(soma(4, 5))
console.log(sub(2, 1))
console.log(calcular(2, 5, soma))