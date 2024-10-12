"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
const promptSync = require("prompt-sync");
//import PromptSync from "prompt-sync"; //Segunda forma
var prompt = promptSync();
const b = prompt("Insira o valor para B: ");
console.log(`Valor de B = ${b}`);
const c = "Segunda linha";
console.log(`Valor de C = ${c}`);
const d = "Terceira linha";
console.log(`Valor de D = ${d}`);
