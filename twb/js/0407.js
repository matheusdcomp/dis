let i = 1;
let s = "abc";
s = "sdfsdaf";

const d = Date();
const v = [1,2,3];
const o = {nome:"JOAO",idade:0};
console.log(o["nome"]);

function Pessoa(nome, idade) {
  this.nome = nome;
  this.idade = idade;
  this.toString = function () {
    return "nome:" + this.nome + 
      ", idade:" + this.idade;
  };
}

class Person {
  constructor(nome, idade) {
    this.nome = nome;
    this.idade = idade;
  }
  toString() {
    return "nome:" + this.nome + 
      ", idade:" + this.idade;
  }
}


const p = new Pessoa("LUCAS",10);

function gera1() {
  return 1;
}

async function carregar() {
  const p = new Promise(function (resolve, reject) {
    let i = Math.floor(Math.random() * 10); // Returns 0–9 
    if (i >= 5) resolve(i);
    else reject(0);
  });
  return p;
}
carregar().then(
  function(value) {console.log(value)},
  function(error) {console.log("Não deu certo!")},
);


async function myFunction() {
  const promise = new Promise(function(resolve) {
    let nome = "Matheus";
    resolve(nome);
  });
  console.log( await promise );
}

myFunction();