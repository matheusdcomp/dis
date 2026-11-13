class Ponto:

    def __init__(self, x=0, y=0):
        self.x = x
        self.y = y
    
    def distancia(self, p):
        return (self.x - p.x)**2 + (self.y - p.y)**2

    def __str__(self):
        return '(%.1f, %.1f)' % (self.x, self.y)  


p1 = Ponto(1)
p2 = Ponto(3,7)

print(f"\n({p1.x},{p1.y})")
print("\n(%.2f,%.2f)" %(p2.x, p2.y))

print(f"Distancia entre {p1} e {p2}: {p1.distancia(p2)}")