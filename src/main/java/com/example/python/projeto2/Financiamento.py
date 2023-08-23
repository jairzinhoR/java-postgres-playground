class Financiamento:
    def __init__ (self, valorTotal, entrada, parcelas):
        if entrada < valorTotal * 0.2:
            raise ValueError("A entrada deve ser superior a 20% do valor total do financiamento")
        elif parcelas < 6:
            raise ValueError("O número de parcelas deve ser no mínimo seis")
    
        self.valorTotal = valorTotal
        self.entrada = entrada
        self.parcelas = parcelas

    def prestacao(self):
        return (self.valorTotal-self.entrada)/self.parcelas

finan = Financiamento(1000, 300, 5)
print(finan.prestacao())