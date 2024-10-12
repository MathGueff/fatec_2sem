"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var promptSync = require("prompt-sync");
var nomeLet = '';
var prompt = promptSync();
nomeLet = prompt("Digite seu nome: ");
if (nomeLet == "Matheus") {
    var nomeLet_1 = "Juliano";
    console.log("Seu nome a partir de hoje \u00E9 ".concat(nomeLet_1));
}
console.log("Seu nome a partir de hoje \u00E9 ".concat(nomeLet));
