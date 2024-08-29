"use strict";
//Exercicio
//Criar um programa que receba um número e mostre seus dois antecessores e sucessores
Object.defineProperty(exports, "__esModule", { value: true });
var promptSync = require("prompt-sync");
var prompt = promptSync();
var numero = Number(prompt("Diga um número: "));
var antecessor = numero - 1;
var sucessor = numero + 1;
var antecessor2 = numero - 2;
var sucessor2 = numero + 2;
console.log("N\u00FAmero: ".concat(numero));
console.log("Antecessor: ".concat(antecessor, ", segundo antecessor ").concat(antecessor2));
console.log("Sucessor: ".concat(sucessor, ", segundo sucessor ").concat(sucessor2));
