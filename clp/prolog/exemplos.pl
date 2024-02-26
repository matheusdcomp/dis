filiacao(joao,tiago).
filiacao(maria,tiago).
filiacao(joao,paula).
filiacao(maria,paula).
filiacao(tiago,ana).
filiacao(paula,andre).

homem(joao).
homem(tiago).
homem(andre).

mulher(maria).
mulher(paula).
mulher(ana).

pai(X,Y) :- homem(X), filiacao(X,Y).
mae(X,Y) :- mulher(X), filiacao(X,Y).

irmaoa(X,Y) :- filiacao(Z,X), filiacao(Z,Y), X \= Y.

tioa(X,Y) :- irmaoa(X,Z), filiacao(Z,Y).


soma(X,Y,Z) :- Z is X + Y.


tamanho([],0) :- !.
tamanho([_],1) :- !.
tamanho([_|T],X) :- tamanho(T,Z), X is Z+1.


selectionsort([],[]).
selectionsort(L1,[M|L2]) :- menor(L1,M), remove(M,L1,L3), selectionsort(L3,L2).

remove(_,[],[]) :- !.
remove(X,[H|T],[H|L]) :- X \= H, remove(X,T,L), !.
remove(X,[_|T],L) :- remove(X,T,L).

menor([X],X):- !.
menor([X|R],X) :- menor(R,M), M >= X, !.
menor([X|R],M) :- menor(R,M), M < X.


qsort([],[]) :- !.
qsort([H|T], L) :- parte(T,H,Me,Ma), qsort(Me,E), 
  qsort(Ma,D), append(E,[H|D],L).

parte([],_,[],[]) :- !.
parte([H|T],X,[H|E],D) :- H < X, parte(T,X,E,D), !.
parte([H|T],X,E,[H|D]) :- parte(T,X,E,D).


