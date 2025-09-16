const v = [1, 2, 3];

function soma(a, b) {
  return a + b;
}

const dobro = (a) => a * 2;

const v2 = v.map(a => a * 2); //pode omitir o parênteses de for apenas uma entrada

console.log(soma(3, 4));
console.log(dobro(3));


const [x,y,z] = v; //x = 1, y = 2, z = 3
const [a, ,b] = v; //a = 1, b = 3
const [h, ...t] = v; // h = 1, t = [2,3] 
const [d = 0] = []; // d = 0


function getA([ a ]) { 
  return a; 
}

console.log(getA(v)); //1

