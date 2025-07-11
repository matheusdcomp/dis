module Stack (Stack(..), push, pop, top, isEmpty, newStack) where

push :: t -> Stack t -> Stack t --coloca um item no topo da pilha
pop :: Stack t -> Stack t --retira o item do topo da pilha
top :: Stack t -> t --obtém o item do topo da pilha
isEmpty :: Stack t -> Bool --verifica se a pilha está vazia
newStack :: Stack t --cria uma pilha vazia

data Stack t = EmptyStk | Stk t (Stack t)

instance (Show t) => Show (Stack t) where
  show (EmptyStk) = "#"
  show (Stk x EmptyStk) = show x
  show (Stk x s) = show x ++ " | " ++ show s


instance (Eq t) => Show (Stack t) where
  EmptyStk == EmptyStk = True
  EmptyStk == _ = False
  _ == EmptyStk = False
  (Stk a s1) == (Stk b s2) = a == b && s1 == s2
  s1 /= s2 = not (s1 == s2)


push x s = Stk x s

pop EmptyStk = error "retirada em uma pilha vazia"
pop (Stk _ s) = s

top EmptyStk = error "topo de uma pilha vazia"
top (Stk x _) = x

isEmpty EmptyStk = True
isEmpty _ = False

