"use strict";
//sintaxe
//nomeDaVariável : tipo
//string, boolean, number
//string = caracteres alfanuméricos "", ''
const nome = "Matheus";
const sobrenome = "Gueff";
const nomeCompleto = nome + " " + sobrenome;
const nomeCompleto2 = `Nome: ${nome}, Sobrenome: ${sobrenome}`;
const numero1 = "10";
const numeros = 10; // int, float, double, hexadecimal, octal
const proposiçãoA = true;
const proposiçãoB = true;
const proposiçãoC = false;
if (proposiçãoA && proposiçãoC) {
    console.log(`A e C são verdadeiros`);
    console.log(`ProposiçãoA: ${proposiçãoA}`);
    console.log(`ProposiçãoC: ${proposiçãoC}`);
}
if (proposiçãoA || proposiçãoC) {
    console.log(`A ou C são verdadeiros`);
    console.log(`ProposiçãoA: ${proposiçãoA}`);
    console.log(`ProposiçãoC: ${proposiçãoC}`);
}
if (proposiçãoA && proposiçãoB) {
    console.log(`A e B são verdadeiros`);
    console.log(`ProposiçãoA: ${proposiçãoA}`);
    console.log(`ProposiçãoB: ${proposiçãoB}`);
}
if (proposiçãoA || proposiçãoB) {
    console.log(`A ou B são verdadeiros`);
    console.log(`ProposiçãoA: ${proposiçãoA}`);
    console.log(`ProposiçãoB: ${proposiçãoB}`);
}
if (proposiçãoB && proposiçãoC) {
    console.log(`B e C são verdadeiros`);
    console.log(`ProposiçãoB: ${proposiçãoB}`);
    console.log(`ProposiçãoC: ${proposiçãoC}`);
}
if (proposiçãoB || proposiçãoC) {
    console.log(`B ou C são verdadeiros`);
    console.log(`ProposiçãoB: ${proposiçãoB}`);
    console.log(`ProposiçãoC: ${proposiçãoC}`);
}
