
//Exercício 1:
/*
function par_impar(numero){
    if(numero % 2 == 0){
        console.log(numero + " é par");
    }else{
        console.log(numero + " é ímpar");
    }
}

par_impar(126);
*/
//Exercício 2:

//Arrow Function
/*
let teste =(number)=> {

    let primo = "O número " + number + " é primo";
    let noPrimo = "O número " + number + " não é primo";
    let result = noPrimo;
    
    for (i = 2; i < number; i++) {
        result = primo
    	if (number % i === 0) {
    		result = noPrimo;
    		break;		
    	}
    }
    if (number === 2) {
    	result = primo;
    }
    return console.log(result);  
};
teste(3);
*/

//var d = new Date();
//console.log(d);


//3.Crie uma função que imprime de 10 até 1 e depois imprime na tela “feliz ano novo” através de uma callback */
/*
function contagem(callback){
    for(var i = 10; i >= 1; i--){
        console.log("Número: " + i);
    }
    setTimeout(callback, 10000);
}

function feliz(){
    console.log( "Feliz ano novo");
}

contagem(feliz);


//4. Faça o mesmo utilizando Promise com concatenação de then
let contagem = new Promise((resolve, reject) => {
    for(var i = 10; i > 0; i--){
        console.log("Número " + i);
    }
})

let feliz = new Promise((resolve, reject) => {
    setTimeout(function(){
        console.log("Feliz ano novo!");
    }, 10000);    
})

contagem.then(feliz);

//5. 

function contagem(callback){
    for(var i = 10; i >= 1; i--){
        console.log("Número: " + i);
    }
    setTimeout(callback, 10000);
}
function feliz(){
    console.log( "Feliz ano novo");
}

let asyncFunction = async () => {
    try{
        var contar = await contagem(feliz);

    }catch(err){
        console.log(err);
    }
}
asyncFunction();

//6. Construa uma função para imprimir apenas as notas acima de 7, usar filter

var notas = [5.3, 4.7, 8.5, 7.1, 6.4, 9.2, 9.8, 5.5, 7.4, 7.0];

var aprovacoes = notas.filter(function(aprovados){
    return aprovados > 7; })

console.log(aprovacoes)

//7. Array de objetos

var sup = [{nome: "tomate", preco: 1.50},{nome: "alface", preco: 0.90},{nome: "melão", preco: 2.00}];

function soma(sup){
    var total = 0;
    for(var i = 0; i < sup.length; i++){
        total += sup[i].preco;
    }
    console.log("O valor total das compras é: " + total.toFixed(2));
}

soma(sup);
*/
//8.

var alunos = [
    {
        nome: "Eder",
        serie: 8,
        materia: ""
    },
    {
        nome: "Joao",
        serie: 9,
        materia: ""
    },
    {
        nome: "Maria",
        serie: 8,
        materia: ""
    },
    {
        nome: "Rosana",
        serie: 9,
        materia: ""
    },
    {
        nome: "Jose",
        serie: 9,
        materia: ""
    }
];

function disciplina(alunos){
    for(var i = 0; i < alunos.length; i++){
        if(alunos[i].serie == 8){
            alunos[i].materia = "história";
            console.log(alunos[i].nome + " " + alunos[i].materia);
        }else{
            alunos[i].materia = "física";
            console.log(alunos[i].nome + " " + alunos[i].materia);
        }
   }
} 
disciplina(alunos)

