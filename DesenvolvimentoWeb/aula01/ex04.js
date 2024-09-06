"use strict";
//EX05 Ler número do usuário e informar se é par ou ímpar
Object.defineProperty(exports, "__esModule", { value: true });
const PromptSync = require("prompt-sync");
const prompt = PromptSync();
var numero = Number(prompt("Digite um número: "));
var parImpar = numero % 2;
switch (parImpar) {
    case 0:
        console.log("O número é par");
        break;
    case 1:
        console.log("O número é ímpar");
        break;
}
