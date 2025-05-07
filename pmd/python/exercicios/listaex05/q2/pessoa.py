from enum import Enum


class Sexo (Enum):
    MASCULINO = 1
    FEMININO = 2


class Pessoa:

    estados = [
        "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES",  
		"GO", "MA", "MG", "MS", "MT", "PA", "PE", "PI", "PR", 
		"RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO"
    ]

    def __init__(self, nome='', sexo=Sexo.MASCULINO, cidade='', estado=''):
        self.nome = nome
        self.sexo = sexo
        self.cidade = cidade
        self.estado = estado
