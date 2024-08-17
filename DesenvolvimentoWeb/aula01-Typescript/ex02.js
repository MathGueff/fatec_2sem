"use strict";
//Gerar 10 números em um array e pedir um número acima de 10 para inserir no array
Object.defineProperty(exports, "__esModule", { value: true });
const PromptSync = require("prompt-sync");
const prompt = PromptSync();
let numeros = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
var numero = 0;
do {
    numero = Number(prompt("Diga um número: "));
} while (numero < 10);
numeros.push(numero);
console.log(numeros);
