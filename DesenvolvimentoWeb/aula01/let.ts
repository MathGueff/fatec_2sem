import promptSync = require('prompt-sync');
let nomeLet : string = '';

const prompt = promptSync();

nomeLet = prompt("Digite seu nome: ")

if(nomeLet == "Matheus"){
    let nomeLet = "Juliano"
    console.log(`Seu nome a partir de hoje é ${nomeLet}`);
}

console.log(`Seu nome a partir de hoje é ${nomeLet}`);
