class A:
  def __init__(self):
    self.x = 5


class B (A):
  def __init__(self):
    super().__init__()
    self.y = 10

a = A()
b = B()

print(f"A[{a.x}]")
print(f"B[{b.x},{b.y}]")
