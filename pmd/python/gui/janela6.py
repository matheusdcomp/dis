from tkinter import *


class Janela(Tk):

  def __init__(self):
    super().__init__()
    self.title('Login')
    Label(self,text='Nome:').grid(row=1, column=1,sticky=W, pady=5)
    Label(self,text='Senha:').grid(row=2, column=1,sticky=W, pady=5)
    self.msg=Label(self,text='Descubra a senha!')
    self.msg.grid(row=3, column=1, columnspan=2)
    self.nome=Entry(self, width=10)
    self.nome.grid(row=1, column=2, sticky=E+W, pady=5, padx=5)
    self.nome.focus_force()
    self.senha=Entry(self, width=10, fg='darkgray',show='l',font=('Wingdings','10'))
    self.senha.grid(row=2,column=2, sticky=E+W, pady=5, padx=5)
    self.ok=Button(self, width=8, command=self.testar,text='OK')
    self.ok.grid(row=4, column=1, sticky=W, padx=5)
    self.close=Button(self, width=8, command=self.fechar,text='CANCEL')
    self.close.grid(row=4, column=2, sticky=E, padx=5)

  def testar(self):
    if self.nome.get()==self.senha.get():
      self.msg['text']='Senha correta!'
    else: 
      self.msg['text']='Senha incorreta!'

  def fechar(self): 
    self.destroy()


Janela().mainloop()
