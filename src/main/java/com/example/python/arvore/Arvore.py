class Node:
    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

def inserir_na_arvore(node, value):
    if node is None:
        return Node(value)
    
    if value < node.value:
        node.left = inserir_na_arvore(node.left, value)
    else:
        node.right = inserir_na_arvore(node.right, value)
    
    return node

def construir_arvore(valores):
    root = None
    for valor in valores:
        root = inserir_na_arvore(root, valor)
    return root

# Solicitar valores ao usuário
valores = [int(x) for x in input("Digite os valores separados por espaço: ").split()]

# Construir a árvore
raiz = construir_arvore(valores)

print("Árvore construída com sucesso!")
