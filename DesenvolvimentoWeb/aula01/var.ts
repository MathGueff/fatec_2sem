import promptSync = require('prompt-sync');
var nomeVar : string = "";

const prompt = promptSync();

nomeVar = prompt("Digite seu nome: ");

if(nomeVar == "Matheus"){
    var nomeVar = "Juliano";
}

console.log(`A partir de hoje, seu nome é ${nomeVar}`)