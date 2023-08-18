from main import MinhaPilha

def test_constuctor():
    minha_pilha = MinhaPilha()
    minha_pilha.adicionar(10)
    minha_pilha.adicionar(20)
    minha_pilha.adicionar(30)

    assert minha_pilha.elementos == [10,20,30]

def test_soma():
    minhaSoma = MinhaPilha()
    minhaSoma.adicionar(40)
    minhaSoma.adicionar(50)

    assert minhaSoma.soma() == 90

