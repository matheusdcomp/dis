class Ponto:

    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    
    def distancia(self, p):
        return (self.x - p.x)**2 + (self.y - p.y)**2

    def __str__(self):
        return '(%.1f, %.1f)' % (self.x, self.y)  