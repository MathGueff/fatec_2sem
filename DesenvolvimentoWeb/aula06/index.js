//let a; //Varia dentro do escopo (escopo)
// const b = 1;//Não varia
// var c;//Varia no geral (global)

// function nome_da_funcao(parametro1, parametro2){
// }

// nome_da_funcao(1,2);

// const nome_da_funcao = (parametro1, parametro2) => {

// } 

const departamento = {
    id:1,
    nome: "Vendas"
}

const pessoa_a = {
    id:1, //number
    nome:'Matheus', //string
    idade:18,
    salario: 2000,
    departamento: departamento
    //Date
}

const pessoa_b = {
    id:2, //number
    nome:'Pedro', //string
    idade:19,
    salario: 4500,
    departamento: departamento
}

const pessoa_c = {
    id:3, //number
    nome:'Davy', //string
    idade:20,
    salario: 10000,
    departamento: departamento
}

//console.log("A pessoa " + pessoa_a.nome + " tem " + pessoa_a.idade + " anos")
//console.log(pessoa_a)
//console.log(pessoa_b)

const pessoas = [pessoa_a, pessoa_b, pessoa_c];


const printPessoa = ({nome, idade, salario, departamento}) => { //Desestruturação do objeto
    //const {nome, idade, departamento} = pPessoa;
    console.log(`Nome: ${nome}, Idade: ${idade}, Salario: ${salario}, Departamento: ${departamento.nome}`);
}

function call(p){ //Função chamada no foreach para escrever o p passado
    printPessoa(p);
}

const printPessoas = (pPessoas = []) => {
    //FOREACH COM ARROW FUNCTION
    pPessoas.forEach(p => {
        printPessoa(p)
    });

    //FOREACH COM FUNCTION 
    //pPessoas.forEach(call)

    //FOR
    // for (let i = 0; i < pPessoas.length; i++) {
    //     printPessoa(pPessoas[i])
    // }

    //IN
    // for (i in pPessoas) {
    //     printPessoa(pPessoas[i])
    // }
}

//printPessoas(pessoas);

const encontrarMaisVelhosQueIdade = (pPessoa = [], idade = 0) =>
    pPessoa.filter((p) => p.idade > idade);

const encontrarPeloId = (pPessoa = [], id = 0) => 
    pPessoa.find((p) => p.id === id)

//printPessoas(pessoas)

const resultadovelhos = encontrarMaisVelhosQueIdade(pessoas, 18)
//console.log(resultadovelhos)
//printPessoas(resultadovelhos)

const resultadoid = encontrarPeloId(pessoas, 1)

// if(resultadoid == undefined){
//     console.log("Não foi encontrado uma pessoa com esse ID")
// }
// else
//     printPessoas(resultadoid)

const getSalario = (pPessoas = []) => pPessoas.map((p) => p.salario)

const reajusteSalario = (pPessoas = [], factor = 1) => {
    return pPessoas.map(({id, nome, idade, salario, departamento}) => {
        return {
            id, //id : id
            nome,
            idade,
            salario: salario * factor,
            departamento,
        }
    });
};

//console.log(getSalario(pessoas))
console.log(reajusteSalario(pessoas, -1))