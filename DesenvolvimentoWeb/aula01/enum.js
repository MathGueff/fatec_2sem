"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const PromptSync = require("prompt-sync");
const prompt = PromptSync();
var Estado;
(function (Estado) {
    Estado[Estado["Desligado"] = 0] = "Desligado";
    Estado[Estado["Ligado"] = 1] = "Ligado";
    Estado[Estado["MeioLigado"] = 2] = "MeioLigado";
    Estado[Estado["MeioDesligado"] = 3] = "MeioDesligado";
})(Estado || (Estado = {}));
var estadoAtual = Estado.Ligado;
var estadoAntigo = Estado.Desligado;
while (true) {
    var numero = Number(prompt("Digite um número entre 0 e 1: "));
    if (numero == 1) {
        estadoAtual = Estado.Ligado;
    }
    else {
        estadoAtual = Estado.Desligado;
    }
    if (estadoAtual = Estado.Ligado) {
        console.log("Estado ligado");
    }
    else {
        console.log("Estado desligado");
    }
    if (estadoAtual == estadoAntigo) {
        console.log("Parabéns");
        break;
    }
    estadoAntigo = estadoAtual;
}
console.log("Parece que você saiu do loop :0");
var teste;
(function (teste) {
    teste["Frase1"] = "eai";
    teste["Frase2"] = "eai2";
    teste["Frase3"] = "3eai";
    teste["Frase4"] = "isso ai memo";
})(teste || (teste = {}));
console.log(teste.Frase3);
