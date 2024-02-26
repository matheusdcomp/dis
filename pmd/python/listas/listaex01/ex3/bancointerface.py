import sys
sys.path.insert( 1, '../ex2' )
#Os comandos abaixo significam: do arquivo x importar a classe y
from conta import Conta
from containterface import ContaInterface
from banco import Banco


class BancoInterface:

    def __init__(self, banco):
        self.banco = banco
        
    def executar(self):
        while True:
            menu =  '\n\n0 - Sair\n1 - Criar conta' + \
                    '\n2 - Selecionar conta\nDigite sua opcao: '

            op = int(input(menu))

            if op == 0:
                return
            
            elif op == 1:
                n = int( input('Informe o numero da nova conta: ') )
                s = float( input('Informe o saldo inicial da nova conta: ') )
                self.banco.addConta( Conta(n,s)  )
                print('\nConta criada com sucesso.') 
                
            elif op == 2:
                n = int( input('Informe o numero da conta: ') )
                conta = self.banco.buscarConta(n)
                if conta is None:
                    print('\nConta nao encontrada.')
                else:
                    ContaInterface.executar( conta )
                
            else:
                print('\nOpcao invalida.')
