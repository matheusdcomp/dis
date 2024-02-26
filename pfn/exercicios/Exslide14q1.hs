-- questão 1 do slide 14.
-- o módulo deveria se chamar Calculadora,
-- mas para vincular este arquivo à questão,
-- eu defini outro nome.

--1
module Exslide14q1 (soma, subt, mult, divi) where

soma :: Num a => a -> a -> a
soma x y = x + y

subt :: Num a => a -> a -> a
subt x y = x - y

mult :: Num a => a -> a -> a
mult x y = x * y

divi :: Fractional a => a -> a -> a
divi x y = x / y
