from geometria import Circulo, Retangulo

figuras = []
menu = '\n\n0 Sair\n1 Criar circulo\n2 Criar retangulo\n3 Areas e comprimentos\nDigite sua opcao: '
while True:
    op = int(input(menu))

    if op == 0:
        break
            
    elif op == 1:
        r = float(input('Informe o raio do circulo: '))
        figuras.append( Circulo(r) )
    
    elif op == 2:
        b = float(input('Informe a base do retangulo: '))
        a = float(input('Informe a altura do retangulo: '))
        figuras.append( Retangulo(b,a) )
    
    elif op == 3:
        for f in figuras:
            if isinstance(f,Circulo):
                print('\n<CIRCULO>')
            else:
                print('\n<RETANGULO>')
            print('Area: %.2f\nComprimento: %.2f' % (f.area(), f.comprimento()))
    
    else:
        print('\nOpcao invalida.')
    