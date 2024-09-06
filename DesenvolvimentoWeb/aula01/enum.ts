import PromptSync = require("prompt-sync");

const prompt = PromptSync();

enum Estado{
    Desligado,
    Ligado,
    MeioLigado,
    MeioDesligado
}

var estadoAtual : Estado = Estado.Ligado
var estadoAntigo : Estado = Estado.Desligado

while (true){
    var numero : number = Number(prompt("Digite um número entre 0 e 1: "))
    if(numero == 1){
        estadoAtual = Estado.Ligado;
    }
    else{
        estadoAtual = Estado.Desligado;
    }
    if(estadoAtual = Estado.Ligado){
        console.log("Estado ligado")
    }
    else{
        console.log("Estado desligado")
    }
    if(estadoAtual == estadoAntigo){
        console.log("Parabéns")
        break
    }
    estadoAntigo = estadoAtual
}

console.log("Parece que você saiu do loop :0")

enum teste{
    Frase1 = "eai",
    Frase2 = "eai2",
    Frase3 = "3eai",
    Frase4 = "isso ai memo"
}

console.log(teste.Frase3)
