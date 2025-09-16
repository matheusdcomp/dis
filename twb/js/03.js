const max = 3;

const promessa = new Promise(function(resolve, reject) {
  let x =  Math.floor(Math.random() * (max + 1));
  if (x > 0) resolve(x);
  else reject("Deu zero");  
});

promessa.then(
  function(value) {console.log(value);},
  function(error) {console.log(error);}
);


new Promise(
  function(resolve) {
    setTimeout(function() { resolve("Fechou!!!"); }, 2000);
  }
).then( value => console.log(value) );


async function hello() { return "Hello!"; }

hello().then(
  value => console.log(value),
  error => console.log(error)
);


async function imprime() {
  const promessa = new Promise( 
    resolve => setTimeout(() => resolve("Promessa cumprida!"), 2500)
  ); 
  console.log( await promessa );
}

imprime();