s = "CXLIX"
tamanho = len(s)
listaLetras = []
listaNum = []

for i in range(tamanho):
    listaLetras.append(s[i])
    match s[i]:
        case 'I':
            listaNum.append(1)
        case 'V':
            listaNum.append(5)
        case 'X':
            listaNum.append(10)
        case 'L':
            listaNum.append(50)
        case 'C':
            listaNum.append(100)
        case 'D':
            listaNum.append(500)
        case 'M':
            listaNum.append(1000)

print(listaNum)

result = listaNum[0]
for i in range(tamanho-1):
    if listaNum[i] >= listaNum[i+1]:
        result = result + listaNum[i+1]
    else: result = result + listaNum[i+1] - listaNum[i] - listaNum[i]
    
print(result)