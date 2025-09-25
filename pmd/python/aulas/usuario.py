class Usuario:

  def __init__(self, nome, login, senha):
    self.nome = nome
    self.login = login
    self.senha = senha

  def __str__(self):
    return f"{self.nome}"


class UsuarioAdmin(Usuario):

  def __init__(self, nome, login, senha, setor):
    super().__init__(nome, login, senha)
    self.setor = setor

  def __str__(self):
    return f"{super().__str__()} - {self.setor}"


usuarios = [
  Usuario("JOAO", "joao@gmail.com", "123"),
  UsuarioAdmin("MARIA", "maria@gmail.com", "123", "DCOMP"),
]

for u in usuarios:
  print(u)