class Piloto:
    aumento = 1.10

    def __init__(self, nome, salario):
        self.nome = nome
        self.salario = salario

    @property
    def email(self):
        return '{}@email.com.br'.format(self.nome)

    def aumentar_salario(self):
        self.salario = int(self.salario * self.aumento)
        return self.salario


rubinho = Piloto('Rubinho', 50000)
print(rubinho.nome, " ", rubinho.salario)
print(rubinho.email)
rubinho.aumentar_salario()
print(rubinho.nome, " ", rubinho.salario)