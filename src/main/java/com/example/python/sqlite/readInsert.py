import sqlite3

try:
    banco = sqlite3.connect('primeiro_banco.db')
    cursor = banco.cursor()

    # INSERT
    #cursor.execute('''CREATE TABLE pessoas (
    #    ID INTEGER PRIMARY KEY AUTOINCREMENT,
    #    nome TEXT,
    #    idade INTEGER,
    #    email TEXT)''')
    
    #cursor.execute("INSERT INTO pessoas VALUES ('Jair',35,'jair.rochant@gmail.com')")
    cursor.execute("INSERT INTO pessoas VALUES(2, 'Dora', 66, 'dora@gmail.com')")
    cursor.execute("INSERT INTO pessoas VALUES(3, 'Jair Pai', 64, 'jrof@gmail.com')")
    cursor.execute("INSERT INTO pessoas VALUES(4, 'Laercio', 37, 'jkianne@gmail.com')")
    cursor.execute("INSERT INTO pessoas VALUES(5, 'Jessica', 32, 'laerciofan@gmail.com')")

    #INSERT COM VARIÁVEIS
    #nome = "Amelie"
    #idade = 11
    #email = "amelie@gmail.com"
    #cursor.execute("INSERT INTO pessoas VALUES('"+nome+"',"+str(idade)+",'"+email+"')")

    #READ
    #cursor.execute("SELECT * FROM pessoas")
    #print(cursor.fetchall())

    #GOOD READ
    pessoas = cursor.execute("SELECT * FROM pessoas")
    for pessoa in pessoas:
        print(pessoa)

    banco.commit()
    banco.close()

except sqlite3.Error as erro:
    print("Erro ao inserir dados: ", erro)