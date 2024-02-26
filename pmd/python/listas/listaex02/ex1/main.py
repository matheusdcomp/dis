import funcionario as fnc
import assistente as ast

print()
fnc.Funcionario('MARIA','maria@gmail.com').exibeDados()
print()
ast.Assistente('JOAO','joao@gmail.com',123).exibeDados()
print()
ast.AssistenteTecnico('ANDREA','andrea@gmail.com',434,30.0).exibeDados()
print()
ast.AssistenteAdministrativo('LUCAS','lucas@gmail.com',890,'noite').exibeDados()
