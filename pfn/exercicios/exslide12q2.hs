--module Exslide15q2 (Stack, push, pop, top, isEmpty) where

push :: t -> Stack t -> Stack t --coloca um item no topo da pilha
pop :: Stack t -> Stack t --retira o item do topo da pilha
top :: Stack t -> t --obtém o item do topo da pilha
isEmpty :: Stack t -> Bool --verifica se a pilha está vazia
newStack :: Stack t --cria uma pilha vazia

data Stack t = Stk [t]

instance (Show t) => Show (Stack t) where
  show (Stk []) = "#"
  show (Stk [x]) = show x
  show (Stk (x:s)) = show x ++ " | " ++ show (Stk s)

push x (Stk ls) = Stk (x:ls)

pop (Stk []) = error "retirada em uma pilha vazia"
pop (Stk (_:s)) = Stk s

top (Stk []) = error "topo de uma pilha vazia"
top (Stk (x:_)) = x

isEmpty (Stk []) = True
isEmpty _ = False
