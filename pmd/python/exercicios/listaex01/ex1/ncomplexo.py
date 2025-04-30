class NumeroComplexo:

    def __init__(self, a=0, b=0):
        self.a = a
        self.b = b
    
    def __str__(self):
        "Método equivalente ao toString do java"
        return '%.1f + %.1fi' % (self.a, self.b)
    
    def soma(self, nc):
        return NumeroComplexo(self.a + nc.a, self.b + nc.b)
    
    def produto(self, nc):
        return NumeroComplexo(self.a * nc.a - self.b * nc.b, self.b * nc.a + self.a * nc.b)

    def conjugado(self):
        return NumeroComplexo(self.a, -self.b)
