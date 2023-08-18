class MinhaPilha:
    def __init__(self):
        self.elementos = []

    def adicionar(self, item):
        self.elementos.append(item)
    
    def soma(self):
        return self.elementos[0] + self.elementos[1]

minha_pilha = MinhaPilha()
minha_pilha.adicionar(10)
minha_pilha.adicionar(20)
minha_pilha.adicionar(30)
print(minha_pilha.elementos)  # Saída: [10, 20, 30]

minhaSoma = MinhaPilha()
minhaSoma.adicionar(40)
minhaSoma.adicionar(50)
print(minhaSoma.soma())
