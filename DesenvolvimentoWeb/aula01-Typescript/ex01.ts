//Exercicio
//Criar um programa que receba um número e mostre seus dois antecessores e sucessores

import promptSync = require('prompt-sync');

const prompt = promptSync();

var numero : number = Number(prompt("Diga um número: "));
var antecessor : number = numero-1
var sucessor : number = numero+1
var antecessor2 : number = numero-2
var sucessor2 : number = numero+2



console.log(`Número: ${numero}`)
console.log(`Antecessor: ${antecessor}, segundo antecessor ${antecessor2}`)
console.log(`Sucessor: ${sucessor}, segundo sucessor ${sucessor2}`)