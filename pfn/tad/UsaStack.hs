module UsaStack where 
import Stack

listaParaPilha :: [t] -> Stack t
listaParaPilha [ ] = newStack
listaParaPilha (x : xs) = push x (listaParaPilha xs)

pilhaParaLista :: Stack t -> [t]
pilhaParaLista s
  |stackEmpty s = [ ]
  |otherwise = (top s) : (pilhaParaLista (pop s))
