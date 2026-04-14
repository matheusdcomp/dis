const v = [1,2,3];
const x = [0,...v];


function filtra(fun, vetor) { 
  const v = [];
  for ( let e of vetor )
    if (fun(e))
      v.push(e);
  return v;  
}

function maior3 (x) { 
  return x > 3; 
}

const maior3 = function(x) {
  return x > 3; 
};

const pi = 3.14;

const f = maior3;
f(2)