"use strict";
//Exercicio
//Criar um programa que receba um número e mostre seus dois antecessores e sucessores
Object.defineProperty(exports, "__esModule", { value: true });
const promptSync = require("prompt-sync");
const prompt = promptSync();
var numero = Number(prompt("Diga um número: "));
var antecessor = numero - 1;
var sucessor = numero + 1;
var antecessor2 = numero - 2;
var sucessor2 = numero + 2;
console.log(`Número: ${numero}`);
console.log(`Antecessor: ${antecessor}, segundo antecessor ${antecessor2}`);
console.log(`Sucessor: ${sucessor}, segundo sucessor ${sucessor2}`);
