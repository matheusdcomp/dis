#Do módulo (arquivo) ncomplexo importar a classe NumeroComplexo
from ncomplexo import NumeroComplexo

#A função input só lê uma entrada por vez.
#Para o primeiro número complexo, pedi que o usuário digitasse cada parte por vez
a = input('Digite a primeira parte (float) de um numero complexo: ')
b = input('Digite a segunda parte (float) do mesmo numero complexo: ')
nc1 = NumeroComplexo(float(a), float(b))

#Para o segundo número complexo, usei uma lista e um laço para o usuário digitar as duas partes
#Uma parte ENTER outra parte ENTER
nc2 = []
print('Digite a duas partes de outro numero complexo:')
for n in [1,2]:
    nc2.append( float( input() ) )
nc2 = NumeroComplexo(nc2[0], nc2[1]) #as referências em python não tem tipo fixo.
#nc2 antes apontava para um objeto do tipo lista e agora aponta para um objeto do tipo NumeroComplexo

nc3 = nc1.soma(nc2);
nc4 = nc1.produto(nc2);
nc5 = nc1.conjugado();

print('(%s) + (%s) = %s' % (nc1, nc2, nc3))
print('(%s) * (%s) = %s' % (nc1, nc2, nc4))
print('Conjugado de (%s) = %s' % (nc1, nc5))
