"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var promptSync = require("prompt-sync");
var nomeVar = "";
var prompt = promptSync();
nomeVar = prompt("Digite seu nome: ");
if (nomeVar == "Matheus") {
    var nomeVar = "Juliano";
}
console.log("A partir de hoje, seu nome \u00E9 ".concat(nomeVar));
