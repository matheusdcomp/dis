from tkinter import *

class Janela:

  def __init__(self, width, height):
    self.janela = Tk()
    self.janela.title("Produtos")
    x = (self.janela.winfo_screenwidth() - width) // 2
    y = (self.janela.winfo_screenheight() - height) // 2
    self.janela.geometry(f"{width}x{height}+{x}+{y}")
    self.janela.resizable(False, False)

    mainmenu = Menu(self.janela) 
    self.janela.option_add('*tearOff', FALSE)
    self.janela.config(menu=mainmenu) 
    menu = Menu(mainmenu)
    mainmenu.add_cascade(label='Painéis', menu=menu)
    menu.add_command(label='Painel 1', command=self.carregarPainel1)
    menu.add_command(label='Painel 2', command=self.carregarPainel2)

    self.painelAtual = None
    self.janela.mainloop()

  
  def carregarPainel1(self):
    if self.painelAtual != None:
      self.painelAtual.pack_forget()
    self.painelAtual = Painel1(self.janela)
    self.painelAtual.pack(fill="both", expand=True)

  def carregarPainel2(self):
    if self.painelAtual != None:
      self.painelAtual.pack_forget()
    self.painelAtual = Painel2(self.janela)
    self.painelAtual.pack(fill="both", expand=True)


class Painel1(Frame):
  def __init__(self, janela):
    super().__init__(janela)
    rotulo = Label(self, text='PAINEL 1', font=("Arial", 30))
    rotulo.pack(fill="both", expand=True)


class Painel2(Frame):
  def __init__(self, janela):
    super().__init__(janela)
    rotulo = Label(self, text='PAINEL 2', font=("Arial", 30))
    rotulo.pack(fill="both", expand=True)



Janela(800,600)
