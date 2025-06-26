from tkinter import *

class Janela:

  def __init__(self):
    self.janela = Tk()
    self.janela.title("Painéis")
    self.janela.geometry("800x600+0+0")
    self.painelAtual = None
    self.carregarPainel1();
    self.janela.mainloop()

  
  def carregarPainel1(self):
    if self.painelAtual != None:
      self.painelAtual.pack_forget()
    self.painelAtual = Painel1(self.janela, self.carregarPainel2)
    self.painelAtual.pack(fill="both", expand=True)

  def carregarPainel2(self):
    if self.painelAtual != None:
      self.painelAtual.pack_forget()
    self.painelAtual = Painel2(self.janela, self.carregarPainel1)
    self.painelAtual.pack(fill="both", expand=True)


class Painel1(Frame):
  def __init__(self, janela, comando):
    super().__init__(janela)
    rotulo = Button(self, text='Mudar para Painel 2', font=("Arial", 30), command=comando)
    rotulo.pack(fill="both", expand=True)


class Painel2(Frame):
  def __init__(self, janela, comando):
    super().__init__(janela)
    rotulo = Button(self, text='Mudar para Painel 1', font=("Arial", 30), command=comando)
    rotulo.pack(fill="both", expand=True)



Janela()
