from tkinter import *
from tkinter import messagebox


class Painel (Frame):

    def __init__(self, master=None):
        
        super().__init__(master) #isso faz com que self.master = master
        self.grid(padx=10, pady=10) #margem do painel
        
        master.option_add('*tearOff', FALSE) #define que menus devem ser fixos na janela
        mainmenu = Menu(master) #cria o menu
        master.config(menu=mainmenu) #adiciona o menu na janela principal
        
        menuArquivo = Menu(mainmenu) #cria o menu Arquivo
        mainmenu.add_cascade(label='Arquivo', menu=menuArquivo) #menuArquivo é um submenu do mainmenu
        menuArquivo.add_command(label='Novo', command=self.limpar)
        menuArquivo.add_separator()
        menuArquivo.add_command(label='Fechar', command=self.fechar)
        
        menuAjuda = Menu(mainmenu)
        mainmenu.add_cascade(label='Ajuda', menu=menuAjuda)
        menuAjuda.add_command(label='Créditos', command=self.creditos)

        
        self.texto = Text(self, height=10, width=30)        
        self.texto.grid(row=1, column=1, padx=5, pady=5)        
        scroll=Scrollbar(self, orient=VERTICAL, command=self.texto.yview)
        scroll.grid(row=1, column=2, rowspan=15, columnspan=1, sticky=NS)
        self.texto.config(yscrollcommand=scroll.set, font=('Arial', 10))
        


    def limpar(self):
        self.texto.delete(1.0,END)

    def fechar(self): 
        self.master.destroy()

    def creditos(self): 
        messagebox.showinfo('Créditos', 'Desenvolvedor: Matheus Viana')


master = Tk()
Painel(master)
master.mainloop()
