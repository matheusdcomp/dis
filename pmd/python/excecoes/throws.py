class TestaThrows:

	def testa(self):
		a = 5 / 0  #exceção

	def main(self):
		try:
			self.testa()
		 
		except ZeroDivisionError:
			print("\nPAM: divisão por zero")


TestaThrows().main()
