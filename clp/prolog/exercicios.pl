% Resposta da lista de exercicios (versao Prolog)

% 1. Implemente uma funcao/regra que verifica
%    se um elemento pertence a uma lista.
pertence(X,[X|_]) :- !.
pertence(X,[_|Y]) :- pertence(X,Y).


% 2. Implemente uma funcao/regra que inverte
%    os elementos de uma lista.

inverte(L,Li) :- inverte(L,[],Li).
inverte([],L,L).
inverte([X|Y],Li,L) :- inverte(Y,[X|Li],L).

% Outra maneira de fazer usando a regra append
% append (fornecida pelo Prolog) concatena duas listas

inverte2([],[]).
inverte2([X|Y],Z) :- inverte2(Y,Yi), append(Yi,[X],Z).


% 3. Implemente uma funcao/regra que informe
%    o n-esimo membro de uma lista.

n_esimo(0,[X|_],X).
n_esimo(I,[_|Y],Z) :- N is I-1, n_esimo(N,Y,Z).


% 4. Implemente uma funcao/regra que remova
%    todas as ocorrencias de um elemento em uma lista.

removeTodos(_,[],[]).
removeTodos(X,[X|Y],Z) :- removeTodos(X,Y,Z).
removeTodos(X,[N|Y],[N|Z]) :- removeTodos(X,Y,Z).


% 5. Implemente uma funcao/regra que recebe 
%    uma lista e a divide em duas pela metade.

divide(L,E,D) :- length(L,T), M is T div 2, divide(L,M,E,D), !.
divide(L,0,[],L) :- !.
divide([X|Y],P,[X|E],D) :- Z is P-1, divide(Y,Z,E,D).
 

% 6. Implemente uma funcao/regra que verifica se uma String
%    eh ou nao um palindromo. Um palindromo eh uma String que
%    se invertida se mantem exatamente igual a original.
%    string_chars converte a string para lista de chars.

palindromo(X) :- string_chars(X,L), inverte(L,Y), L=Y. 


% 7. Implemente uma funcao/regra primo(N) que dado um numero
%    inteiro N, determine se ele eh ou nao um numero primo.
%    round arredonda um float e sqrt retonra a raiz de um numero.
%  OBSERVACOES IMPORTANTES: 
%  A maioria dos autores falam que 1 nao eh primo.
%  Nao eh possivel usar o resultado de uma operacao ou regra 
%  como entrada de uma regra. Por exemplo, nao eh permitido escrever 
%  fatorial (X-1). Mas algumas regras fornecidas pelo Prolog
%  atuam como funcoes que tem retorno quando usadas junto com 
%  o operador is. Por exemplo, sqrt(X,Y) eh uma regra em que Y 
%  eh a raiz quadrada de X e round(X,Y) eh uma regra em que Y eh
%  o X arredondado. Usar R is round(sqrt(X)) eh o mesmo que 
%  sqrt(X,Z),round(Z,R). Regras que criamos nao podem fazer isso.   


primo(X) :- X >= 2, R is round(sqrt(X)), primo(X,R).
primo(X,1) :- !.
primo(X,D) :- R is X mod D, R \= 0, Y is D-1, primo(X,Y).


% 8. Implemente uma funcao/regra lista_primos(N, Lista) que
%    aceite um numero inteiro e que determine a lista de todos
%    os numeros primos iguais ou inferiores a esse numero.

lista_primos(0,[]) :- !.
lista_primos(1,[]) :- !. 
lista_primos(2,[2]) :- !.
lista_primos(N,Lista) :- primo(N),
   Z is N-1, lista_primos(Z,Y), append(Y,[N], Lista), !.
lista_primos(N,Lista) :- Z is N-1, lista_primos(Z,Lista).


% 9. Escreva uma funcao/regra chamada conceito que receba
%    uma nota como argumento e retorne o conceito
%    correspondente, conforme as regras:  nota >= 9.0,
%    conceito A; nota >= 7.5 e < 9.0, conceito B; nota >= 6.0
%    e < 7.5, conceito C; nota >= 4.0 e < 6.0, conceito D;
%    nota < 4.0, conceito E.

conceito(Nota,'A') :- Nota >= 9.0.
conceito(Nota,'B') :- Nota >= 7.5, Nota < 9.0.
conceito(Nota,'C') :- Nota >= 6.0, Nota < 7.5.
conceito(Nota,'D') :- Nota >= 4.0, Nota < 6.0.
conceito(Nota,'E') :- Nota < 4.0.

% 10. Implemente o algoritmo de ordenacao mergesort.

mergesort([],[]) :- !.
mergesort([X],[X]) :- !.
mergesort(L,Lo) :- divide(L,E,D), 
  mergesort(E,Eo), mergesort(D,Do), conquista(Eo,Do,Lo).

conquista([],L,L) :- !. 
conquista(L,[],L) :- !. 
conquista([X1|R1],[X2|R2],[X1|L]) :- X1 < X2, conquista(R1,[X2|R2],L), !. 
conquista([X1|R1],[X2|R2],[X2|L]) :- X1 >= X2, conquista([X1|R1],R2,L), !. 
