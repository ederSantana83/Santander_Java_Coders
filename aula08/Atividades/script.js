/*
function dizerTchau(nome){
    console.log("Bye Bye " + nome);
}
dizerTchau("Eder");


function par_impar(vetor){
    for(var i = 0; i < vetor.length; i++){
        if(vetor[i] % 2 === 0){
           console.log(vetor[i] + " é par");
        }
        else{
            console.log(vetor[i] + " é ímpar");
        }
    }   
}
var array = [10,11,12,13,14,15];
par_impar(array); 


function parOuImpar(num){
    if(num % 2 ==0){
        console.log(num + " é par")
    }else{
        console.log(num + " é impar")
    }
}
parOuImpar(14);

//Função Anônima
var dizerOla = function (nome){
    return "Olá " + nome
    //console.log("Oi, " + nome);
}
console.log(dizerOla("Eder"))

//Função com construtor, pouco utilizada e insegura 

var dizerTchau = new Function("nome", "console.log('Tchau ' + nome);");
dizerTchau("Eder");

//Função chamando outra função
function circunferencia(raio){
    function diametro(){
        return 2 * raio;
    }
    return Math.PI * diametro();
}
console.log(circunferencia(2))
console.log(Math.round(circunferencia(2)))*/

// CALLBACK
/*
function a(callback){
    setTimeout(function(){
        callback();
    }, 3000);  
    console.log( "a vem primeiro");
}

function b(){
    console.log( "b vem depois");
}

a(b);


//setTimeout(taskOne, 5000);
//taskTwo()
/*
function contagem(callback){
    setTimeout(function(){
        callback();
    }, 3000);  
    for(var i = 20; i >= 1; i--){
        console.log("Número: " + i);
    }
}

function feliz(){
    console.log( "Feliz ano novo");
}

contagem(feliz);

function foo(array, callback){
    var sum = 0;
    
    for(var i = 0; i < array.length; i++){
        callback(array[i]);
        sum += array[i];
    }
    return console.log(sum);
}

var array = [1,3,7,9,12];
foo(array, function (x){ //function x é a função chamada no callback
    console.log(x)
});*/


/*
//Promisses JS

const myPromise = new Promise((resolve, reject) =>{
    let connection = false;

    if(connection){
        resolve('Connection established');
    }else{
        reject('Connection refused');
    }
});

myPromise.then((message) => {
    console.log(message);
}).catch((message) => {
    console.log(message);
});
let p = new Promise((resolve, reject) =>{
    let a = 1 + 3;
    if(a == 2){
        resolve('success');
    }else{
        reject('failed');
    }
})

p.then((message) => {
    console.log("This is in the then " + message)
}).catch((message) => {
    console.log("This is a catch " + message)
})

//Exemplo de callback//
const betterDeveloper = "Eder";
function whoIsBetterCallback(callback, erroCallback){

return new Promise((resolve, reject) => {

    if(betterDeveloper != "Eder"){
        reject({
            name: "This is wordg",
            message: betterDeveloper + "? Really"
        })
    }else{
        resolve({
            name: betterDeveloper,
            message: "JS is the best language"
        })
    }
})
}

//Exemplo de callback//
whoIsBetterCallback()
    .then((result) => {
    console.log(result.name + " ? Yeah " + result.message)
}).catch((error) => {
    console.log(error.name + " " + error.message)
})

function dizerOi(nome){
    console.log("Oi " + nome);
    console.log(this)
}

//Formas de chamar uma função
//dizerOi("Eder")
//dizerOi.call({}, "Eder");
//dizerOi.apply({}, ["Rosana"]);


//Async Await

//Procurar exemplos de Async Await!


//Função auto invocada

(function(){
    console.log("Função autoinvocada")
})()


//declarando objetos

var obj = {
    nome: "Eder",
    sobrenome: "Sant'ana",
    idade: 37,
    apresentar: apresentacao
};

function apresentacao(){
    console.log("Olá eu sou " + obj.nome + " " + this.sobrenome + " tenho " + this.idade + " anos");
}


obj.apresentar();


//Prototype

String.prototype.apagar = function(){
    return "";
}

console.log("oi".apagar());
*/


//FILTRO DE ELEMENTOS

let array = [13, 18, 20]

let a = array.filter(function(numero){
        return (numero >= 18);
});

console.log(a);

/*
//REDUCE RETORNAR UM ÚNICO VALOR
let array = [1, 5, 7]

let a = array.reduce(function(total, numero){
        return total + numero;
});

console.log(a);


function foo(array, callback){
    var sum = 0;
    
       for(var i = 0; i < array.length; i++){
           callback(array[i]);
           sum += array[i];
       }
       return console.log(sum);
   }    
       
   var array = [1,2,3,4,5];
   
   foo(array, console.log);

   */