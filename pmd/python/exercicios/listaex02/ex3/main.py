import sys
sys.path.insert(1, '../ex2')
from contabancaria import ContaPoupanca, ContaEspecial


class Contas:

    @staticmethod
    def main():
        contas = []
        menu = "\n\n0 Sair\n1 Cadastrar conta" + \
			"\n2 Sacar\n3 Depositar\n4 Ver saldo\n5 Ver dados" + \
			"\nDigite sua opção: "
        
        while True:

            op = int(input(menu))
            
            if op == 0:
                return
            
            elif op == 1:
                cnt = int(input("Conta (1)poupança ou (2)especial? "))
                cli = input("Informe o nome do cliente: ")
                num = int(input("Informe o numero da conta: "))
                sal = float(input("Informe o saldo da conta: "))
                if cnt == 1:
                    ren = float(input("Informe a taxa de rendimento: "))
                    contas.append(ContaPoupanca(num, cli, sal, ren))
                else:
                    lim = float(input("Informe o limite da conta: "))
                    contas.append(ContaEspecial(num, cli, sal, lim))
                print("\nConta cadastrada com sucesso.")
            
            elif op == 2:
                num = int(input("Informe o numero da conta: "))
                for conta in contas:
                    if conta.numConta == num:
                        if conta.sacar(float(input("Informe o valor do saque: "))):
                            print("\nSaque efetuado com sucesso.")
                        else:
                            print("\nSaque nao efetuado por insuficiencia de saldo.")
            
            elif op == 3:
                num = int(input("Informe o numero da conta: "))
                for conta in contas:
                    if conta.numConta == num:
                        conta.depositar(float(input("Informe valor do deposito: ")))
                        print("\nDeposito efetuado com sucesso.")
            
            elif op == 4:
                num = int(input("Informe o numero da conta: "))
                for conta in contas:
                    if conta.numConta == num:
                        print( "\nSaldo: %.2f" % conta.saldo )
            
            elif op == 5:
                num = int(input("Informe o numero da conta: "))
                for conta in contas:
                    if conta.numConta == num:
                        print( conta )
            
            else:
                print("\nOpção invalida!\n")


Contas.main()
