"use strict";
//EX07 - Data de nascimento e linha do tempo
Object.defineProperty(exports, "__esModule", { value: true });
const PromptSync = require("prompt-sync");
const prompt = PromptSync();
var ano = Number(prompt("Digite seu ano de nascimento: "));
var anoAtual = Number(prompt("Digite o ano atual: "));
console.log("---");
var idade = 0;
for (ano; ano <= anoAtual; ano++) {
    if (idade == 0) {
        console.log(`${ano} -- Nascimento`);
    }
    else if (idade == 1) {
        console.log(`${ano} -- ${idade} ano`);
    }
    else {
        console.log(`${ano} -- ${idade} anos`);
    }
    idade++;
    console.log("-----");
}
