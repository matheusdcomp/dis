from tkinter import *


class Janela:

    def __init__(self, raiz):
        self.raiz = raiz
        self.raiz.title('Login')
        Label(self.raiz,text='Nome:').grid(row=1, column=1,sticky=W, pady=5)
        Label(self.raiz,text='Senha:').grid(row=2, column=1,sticky=W, pady=5)
        self.msg=Label(self.raiz,text='Descubra a senha!')
        self.msg.grid(row=3, column=1, columnspan=2)
        self.nome=Entry(self.raiz, width=10)
        self.nome.grid(row=1, column=2, sticky=E+W, pady=5, padx=5)
        self.nome.focus_force()
        self.senha=Entry(self.raiz, width=10, fg='darkgray',show='l',font=('Wingdings','10'))
        self.senha.grid(row=2,column=2, sticky=E+W, pady=5, padx=5)
        self.ok=Button(self.raiz, width=8, command=self.testar,text='OK')
        self.ok.grid(row=4, column=1, sticky=W, padx=5)
        self.close=Button(self.raiz, width=8, command=self.fechar,text='CANCEL')
        self.close.grid(row=4, column=2, sticky=E, padx=5)

    def testar(self):
        if self.nome.get()==self.senha.get():
            self.msg['text']='Senha correta!'
        else: self.msg['text']='Senha incorreta!'

    def fechar(self): 
        self.raiz.destroy()


raiz = Tk()
Janela(raiz)
raiz.mainloop()
