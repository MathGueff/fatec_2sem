//Chamando as funções
imprime()
soma(1,2)

const resultado = verificar(3>1, 4<2)
if(resultado){
    console.log("é true");
}
else{
    console.log("é false")
}
//função void

//função sem parâmetro e sem retorno

function imprime(){
    console.log("Sem parâmetro e sem retorno");
}

//função com parâmetro e void
function soma(num1:number, num2:number){
    console.log(`Soma ${num1 + num2}`)
}

//função com parâmetro e retorno
function verificar(propo1:boolean, propo2:boolean) : boolean{
    if(propo1 && propo2){
        return true
    }
    return false
}
