const notas = [10, 6.5, 8, 7.5];

let somaNotas = 0;

notas.forEach((nota, indice) => {
    somaNotas += nota
    console.log(indice);
})

let media = somaNotas / notas.length

console.log(`A média das notas é ${media}`);