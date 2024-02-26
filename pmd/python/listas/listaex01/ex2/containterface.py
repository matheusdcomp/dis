from conta import Conta

class ContaInterface:

    @staticmethod
    def executar(conta):
        while True:
            menu =  '\n\n0 - Sair\n1 - Fazer deposito' + \
                    '\n2 - Sacar valor\n3 - Conferir saldo' + \
                    '\nDigite sua opcao: '

            op = int(input(menu))

            #python não tem estrutura condicional de caminho múltiplo (como o switch do C)
            if op == 0:
                return
            
            elif op == 1:
                conta.depositar(float(input('Informe o valor: ')))
                print('\nDeposito efetuado.\nSaldo atual: ', conta.saldo()) 
                
            elif op == 2:
                if conta.sacar(float(input('Informe o valor: '))):
                    print('\nSaque efetuado.\nSaldo atual: ', conta.saldo())
                else:
                    print('\nSaque nao efetuado.\nSaldo insuficiente.') 
                
            elif op == 3:
                print('\nSaldo atual: ', conta.saldo())
            
            else:
                print('\nOpcao invalida.')
