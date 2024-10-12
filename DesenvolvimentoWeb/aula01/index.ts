import promptSync = require('prompt-sync');
//import PromptSync from "prompt-sync"; //Segunda forma

var prompt = promptSync();

const b : string = prompt("Insira o valor para B: ");
console.log(`Valor de B = ${b}`);
const c : string = "Segunda linha";
console.log(`Valor de C = ${c}`);
const d : string = "Terceira linha"
console.log(`Valor de D = ${d}`);
