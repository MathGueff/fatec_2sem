"use strict";
var a = 5;
var b = 10;
var c = 10;
if (a == 5) {
    let a = 4; //Outro a, portanto não muda, cria um novo "a"
    var b = 1; //Sobrescreve b
    let c = 18; //Outro C
    console.log("Console dentro do IF: ");
    console.log(a); //4
    console.log(b); //1
    console.log(c); //18
}
console.log("Console fora do IF:");
console.log(a); //Valor não foi alterado (5)
console.log(b); //alterou o valor pois é var, logo global (1)
console.log(c);
