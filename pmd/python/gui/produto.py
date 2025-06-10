from tkinter import *
from tkinter.ttk import *


def centralizarJanela(janela, width, height, resizable=False):
  screen_width = janela.winfo_screenwidth()
  screen_height = janela.winfo_screenheight()
  x = (screen_width - width) // 2
  y = (screen_height - height) // 2
  janela.geometry(f"{width}x{height}+{x}+{y}")
  janela.resizable(resizable, resizable)#nao funciona com grid


class ProdutoForm:

  def __init__(self):
    categorias = ["DIVERSOS", "LIMPEZA", "MANUTENÇÃO"]
    janela = Tk()
    janela.title("Produtos")
    centralizarJanela(janela, 800, 600)

    styleLB = Style()
    styleLB.configure("TLabel", font=("Arial", 16, "bold"))
    styleBT = Style()
    styleBT.configure("TButton", font=("Arial", 16, "bold"))
    styleCT = Style()
    styleCT.configure("TEntry", font=("Arial", 16, "bold"))
    styleCB = Style()
    styleCB.configure("TCombobox", font=("Arial", 16, "bold"))
    

    lbnm = Label(janela, style="TLabel", text="Nome:")
    self.ennm = Entry(janela, style="TEntry")
    lbvl = Label(janela, style="TLabel", text="Valor:")
    self.envl = Entry(janela, style="TEntry")
    lbct = Label(janela, style="TLabel", text="Categoria:")
    self.cbct = Combobox(janela, style="TCombobox", values=categorias)  
    btsv = Button(janela, style="TButton", text="Salvar", command=self.cliqueBtsv)
    btal = Button(janela, style="TButton", text="Alterar", command=self.cliqueBtal)
    btrm = Button(janela, style="TButton", text="Apagar", command=self.cliqueBtrm)
    btcn = Button(janela, style="TButton", text="Cancelar", command=self.cliqueBtcn)
    self.lbrd = Label(janela, style="TLabel")
    
    self.cbct.current(0)

    self.tvps = Treeview(janela, show="headings")
    self.tvps["columns"] = ["Nome", "Valor", "Categoria"]
    self.tvps.heading("Nome", text="Nome")
    self.tvps.column("Nome",minwidth=50,width=400, stretch=NO)
    self.tvps.heading("Valor", text="Valor")
    self.tvps.column("Valor",minwidth=50,width=180, stretch=NO)
    self.tvps.heading("Categoria", text="Categoria")
    self.tvps.column("Categoria",minwidth=50,width=180, stretch=NO)

    lbnm.grid(row=0, column=0, padx=5, pady=5, sticky=(N,S,E,W))
    self.ennm.grid(row=0, column=1, columnspan=3, padx=5, pady=5, sticky=(N,S,E,W))
    lbvl.grid(row=1, column=0, padx=5, pady=5, sticky=(N,S,E,W))
    self.envl.grid(row=1, column=1, padx=5, pady=5, sticky=(N,S,E,W))
    lbct.grid(row=1, column=2, padx=5, pady=5, sticky=(N,S,E,W))
    self.cbct.grid(row=1, column=3, padx=5, pady=5, sticky=(N,S,E,W))
    btsv.grid(row=2, column=0, padx=5, pady=5, sticky=(N,S,E,W))
    btal.grid(row=2, column=1, padx=5, pady=5, sticky=(N,S,E,W))
    btrm.grid(row=2, column=2, padx=5, pady=5, sticky=(N,S,E,W))
    btcn.grid(row=2, column=3, padx=5, pady=5, sticky=(N,S,E,W))
    self.tvps.grid(row=3, column=0, columnspan=4, padx=5, pady=5, sticky=(N,S,E,W))
    self.lbrd.grid(row=4, column=0, columnspan=4, padx=5, pady=5, sticky=(N,S,E,W))
    

    janela.rowconfigure(3, weight=1)    
    janela.columnconfigure(0, weight=1)
    janela.columnconfigure(1, weight=1)
    janela.columnconfigure(2, weight=1)
    janela.columnconfigure(3, weight=1)
    janela.mainloop()

  def cliqueBtsv(self):
    p = (self.ennm.get().upper(), float(self.envl.get()), self.cbct.get())
    self.tvps.insert('', 'end', None, values=p)
    self.lbrd["text"] = f"<< PRODUTO {self.ennm.get().upper()} CADASTRADO >>"

  def cliqueBtal(self): 
    produdosSelecionados = self.tvps.selection()
    if (len(produdosSelecionados) > 0):
      self.tvps.delete(produdosSelecionados[0])
      p = (self.ennm.get().upper(), float(self.envl.get()), self.cbct.get())
      self.tvps.insert('', 'end', None, values=p)
      self.lbrd["text"] = f"<< PRODUTO {self.ennm.get().upper()} ATUALIZADO >>"
      
  def cliqueBtrm(self):
    produdosSelecionados = self.tvps.selection()        
    for p in produdosSelecionados:
      self.tvps.delete(p)
      self.lbrd["text"] = "<< PRODUTO(S) REMOVIDO(S) >>"

  def cliqueBtcn(self):
    self.ennm.delete(0,END)
    self.envl.delete(0,END)
    self.cbct.current(1)
    self.lbrd["text"] = ""



ProdutoForm()
