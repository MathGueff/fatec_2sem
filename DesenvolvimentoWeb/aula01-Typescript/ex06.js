"use strict";
//EX03 - Calculadora
Object.defineProperty(exports, "__esModule", { value: true });
const PromptSync = require("prompt-sync");
const prompt = PromptSync();
var numero1 = Number(prompt("Digite o primeiro número: "));
var numero2 = Number(prompt("Digite o segundo número: "));
var resultado = 0;
var operacao = prompt("Digite a operação: ");
switch (operacao) {
    case "+":
        resultado = numero1 + numero2;
        break;
    case "-":
        resultado = numero1 - numero2;
        break;
    case "/":
        resultado = numero1 / numero2;
        break;
    case "*":
        resultado = numero1 * numero2;
        break;
}
console.log(`O resultado de ${numero1} ${operacao} ${numero2} = ${resultado}`);
