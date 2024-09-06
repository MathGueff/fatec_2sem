"use strict";
//EX04 Dois valores, verificar se um próximo está entre o intervalo
Object.defineProperty(exports, "__esModule", { value: true });
const PromptSync = require("prompt-sync");
const prompt = PromptSync();
var intervalo1 = Number(prompt("Digite o mínimo: "));
var intervalo2 = Number(prompt("Digite o máximo: "));
var numero = Number(prompt("Digite o número no intervalo: "));
if (numero >= intervalo1 && numero <= intervalo2) {
    console.log(`O valor inserido ${numero} pertence ao intervalo [${intervalo1}, ${intervalo2}]`);
}
