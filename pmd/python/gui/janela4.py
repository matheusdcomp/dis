from tkinter import *

class MinhaJanela:
 
    def __init__(self, master = None): 
        master.title("Minha Janela")
        self.frame=Frame(master)
        self.frame.pack()
        self.texto=Label(self.frame, text='Clique para ficar amarelo', padx=30)
        self.texto['width']=26
        self.texto['height']=3
        self.texto.pack()
        self.botaoverde=Button(self.frame,text='Clique')
        self.botaoverde['background']='green'
        self.botaoverde.bind("<Button-1>",self.muda_cor)
        self.botaoverde.pack()

    def muda_cor(self, event):
        if self.botaoverde['bg']=='green':
            self.botaoverde['bg']='yellow'
            self.texto['text']='Clique para ficar verde'
        else:
            self.botaoverde['bg']='green'
            self.texto['text']='Clique para ficar amarelo'

 
root = Tk() 
app = MinhaJanela(root) 
root.mainloop()