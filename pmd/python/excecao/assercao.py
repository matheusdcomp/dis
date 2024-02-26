def KelvinToFahrenheit(temperatura):
   assert (temperatura >= 0),"Temperatura menor que o zero absoluto"
   return ((temperatura-273) * 1.8) + 32

print(KelvinToFahrenheit(273))
print(KelvinToFahrenheit(-5))
