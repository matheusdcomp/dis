from tkinter import *
from tkinter import ttk

from pessoa import Pessoa


class PainelPessoa (Frame):

    def __init__(self, master):        
        super().__init__(master)
        margem = 5
        self.master.title('Casdastro de pessoas') 
        self.grid(padx=margem, pady=margem)
        self.widgets()
        #self.pessoas = []
    

    def widgets(self):
        
        margem = 5
        linha = 0

        pnCampos = Frame(self)
        pnCampos.pack()
        pnTabela = Frame(self)
        pnTabela.pack()
        pnBotoes = Frame(self)
        pnBotoes.pack()        
        
        linha+=1
        self.lbNome = Label(pnCampos, text='Nome:')
        self.lbNome.grid(row=linha, column=1, sticky=W, pady=margem)
        self.enNome = Entry(pnCampos)
        self.enNome.grid(row=linha, column=2, columnspan=3, sticky=W+E, pady=margem)
        
        linha+=1
        self.sexovar = IntVar()
        self.lbSexo = Label(pnCampos, text='Sexo:')
        self.lbSexo.grid(row=linha, column=1, sticky=W, pady=margem)
        self.rbSexoM = Radiobutton(pnCampos, text="Masculino", variable=self.sexovar, value=1)
        self.rbSexoM.grid(row=linha, column=2, sticky=W+E, pady=margem)
        self.rbSexoF = Radiobutton(pnCampos, text="Feminino", variable=self.sexovar, value=2)
        self.rbSexoF.grid(row=linha, column=3, sticky=W+E, pady=margem)        

        linha+=1
        self.lbCidade = Label(pnCampos, text='Cidade:')
        self.lbCidade.grid(row=linha, column=1, sticky=W, pady=margem)
        self.enCidade = Entry(pnCampos, width=70)
        self.enCidade.grid(row=linha, column=2, columnspan=2, sticky=W, pady=margem)
        self.lbEstado = Label(pnCampos, width=5, text='UF:', anchor='e')
        self.lbEstado.grid(row=linha, column=3, sticky=E, pady=margem)
        self.cbEstado = ttk.Combobox(pnCampos, width=3, values=Pessoa.estados)
        self.cbEstado.grid(row=linha, column=4, sticky=W, pady=margem*5)
        self.cbEstado.current(0)
        
        self.tvw = ttk.Treeview(pnTabela)
        self.tvw['columns'] = ['Nome', 'Sexo', 'Cidade', 'UF']
        self.tvw['show'] = 'headings'
        self.tvw.heading('Nome', text='Nome')
        self.tvw.column('Nome',minwidth=0,width=200, stretch=NO)
        self.tvw.heading('Sexo', text='Sexo')
        self.tvw.column('Sexo',minwidth=0,width=70, stretch=NO)
        self.tvw.heading('Cidade', text='Cidade')
        self.tvw.column('Cidade',minwidth=0,width=220, stretch=NO)
        self.tvw.heading('UF', text='UF')
        self.tvw.column('UF',minwidth=0,width=30, stretch=NO)
        self.tvw.pack()

        self.btInserir = Button(pnBotoes, text='Inserir', width=15, command=self.inserir)
        self.btInserir.grid(row=1, column=1, sticky=W+E, pady=margem)
        self.btRemover = Button(pnBotoes, text='Remover', width=15, command=self.remover)
        self.btRemover.grid(row=1, column=2, sticky=W+E, pady=margem)
        

    def inserir(self): 
        sexo = 'Masculino' if self.sexovar.get() == 1 else 'Feminino'
        pessoa = (self.enNome.get(), sexo, self.enCidade.get(), self.cbEstado.get())
        self.tvw.insert('', 'end', None, values=pessoa)


    def remover(self):
        selected_items = self.tvw.selection()        
        for selected_item in selected_items:          
            self.tvw.delete(selected_item)
        
        

