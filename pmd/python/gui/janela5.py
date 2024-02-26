from tkinter import *


class Janela:

    def __init__(self, master=None):
        master.title("Adivinho")
        self.frame = Frame(master)
        self.frame.pack()
        self.frame2 = Frame(master)
        self.frame2.pack()
        self.titulo = Label(self.frame, text='VIDENTE 2005', font=('Verdana', '13', 'bold'))
        self.titulo.pack()
        self.msg = Label(self.frame, width=40, height=6, text='Adivinho o evento ocorrido!')
        self.msg.focus_force() #define o foco para msg. Aperte TAB para b01 ganhar o foco
        self.msg.pack()
        # Definindo o botão 1
        self.b01 = Button(self.frame2, text='Botão 1')
        self.b01['padx'] = 10 
        self.b01['pady'] = 5
        self.b01['bg'] = 'deepskyblue'
        self.b01.bind("<Return>", self.keypress01)
        self.b01.bind("<Any-Button>", self.button01)
        self.b01.bind("<FocusIn>", self.fin01)
        self.b01.bind("<FocusOut>", self.fout01)
        self.b01['relief'] = RIDGE
        self.b01.pack(side=LEFT)
        # Definindo o botão 2
        self.b02 = Button(self.frame2, text='Botão 2')
        self.b02['padx'] = 10
        self.b02['pady'] = 5
        self.b02['bg'] = 'deepskyblue'
        self.b02.bind("<Return>", self.keypress02)
        self.b02.bind("<Any-Button>", self.button02)
        self.b02.bind("<FocusIn>", self.fin02)
        self.b02.bind("<FocusOut>", self.fout02)
        self.b02['relief'] = RIDGE
        self.b02.pack(side=LEFT)


    def keypress01(self, event):
        self.msg['text'] = 'ENTER sobre o Botão 1' #b01 precisa estar com o foco

    def keypress02(self, event): 
        self.msg['text'] = 'ENTER sobre o Botão 2' #b02 precisa estar com o foco

    def button01(self, event): 
        self.msg['text'] = 'Clique sobre o Botão 1' 

    def button02(self, event): 
        self.msg['text'] = 'Clique sobre o Botão 2'


    def fin01(self, event): 
        self.b01['relief'] = FLAT #deixa o botao liso quando ganha o foco

    def fout01(self, event):
        self.b01['relief'] = RIDGE #deixa o botao com altorrelevo quando ganha o foco

    def fin02(self, event): 
        self.b02['relief'] = FLAT

    def fout02(self, event): 
        self.b02['relief'] = RIDGE


raiz = Tk()
Janela(raiz)
raiz.mainloop()
