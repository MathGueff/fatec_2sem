//Gerar 10 números em um array e pedir um número acima de 10 para inserir no array

import PromptSync = require('prompt-sync');

const prompt = PromptSync();

let numeros : Array<number> = [1,2,3,4,5,6,7,8,9,10]

var numero : number = 0;

do{
    numero = Number(prompt("Diga um número: "));
}
while(numero < 10)
    
numeros.push(numero)

console.log(numeros)
