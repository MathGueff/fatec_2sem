//EX03 - Calculadora

import PromptSync = require('prompt-sync');

const prompt = PromptSync();

var numero1 : number = Number(prompt("Digite o primeiro número: "))
var numero2 : number = Number(prompt("Digite o segundo número: "))
var resultado : number = 0;
var operacao : string = prompt("Digite a operação: ")

switch(operacao){
    case "+":
        resultado = numero1 + numero2
        break
    case "-":
        resultado = numero1 - numero2
        break
    case "/":
        resultado = numero1 / numero2
        break
    case "*":
        resultado = numero1 * numero2
        break
}

console.log(`O resultado de ${numero1} ${operacao} ${numero2} = ${resultado}`)