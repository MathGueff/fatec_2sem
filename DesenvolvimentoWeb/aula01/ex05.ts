//EX07 - Data de nascimento e linha do tempo

import PromptSync = require('prompt-sync');

const prompt = PromptSync();

var ano : number = Number(prompt("Digite seu ano de nascimento: "))
var anoAtual : number = Number(prompt("Digite o ano atual: "))
console.log("---")
var idade : number = 0;

for(ano;ano <= anoAtual; ano++){
    if(idade == 0){
        console.log(`${ano} -- Nascimento`);
    }
    else if(idade == 1){
        console.log(`${ano} -- ${idade} ano`);
    }
    else{
        console.log(`${ano} -- ${idade} anos`);
    }
    idade++
    console.log("-----")
}