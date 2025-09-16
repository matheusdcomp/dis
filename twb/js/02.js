const joao = {nome:"JOAO", idade:20};

function Pessoa(nome, idade) { //função constructora
  this.nome = nome;
  this.idade = idade;
  this.show = function() {
    return `Nome: ${this.nome}  Idade: ${this.idade}`;
  };
}

Pessoa.prototype.toString = function() {
    return `Nome: ${this.nome}  Idade: ${this.idade}`;
};

class Pessoa2 { // a classe é apenas um açucar sintático para a função construtora
  constructor(nome, idade) {
    this.nome = nome;
    this.idade = idade;    
  }

  toString() {
    return `Nome: ${this.nome}  Idade: ${this.idade}`;
  };
}

const maria = new Pessoa("Maria", 30);

const { nome, idade } = maria; 
const { nome: n1, idade: i1 } = maria; 
const { nome:n2, ...resto } = maria; 

function getNome({ nome }) { 
  return nome; 
}

console.log(String(maria)); 
console.log("Nome: " + nome, " Idade: " + idade); 
console.log("Nome: " + n1, " Idade: " + i1); 
console.log("Nome: " + n2, " Idade: " + resto.idade); 
console.log(getNome(maria)); 
