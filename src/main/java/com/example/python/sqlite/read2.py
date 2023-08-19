import sqlite3

try:
    banco = sqlite3.connect('primeiro_banco.db')
    cursor = banco.cursor()

    # READ
    #cursor.execute("CREATE TABLE pessoas (nome text, idade integer, email text)")
    #cursor.execute("INSERT INTO pessoas VALUES ('Jair',35,'jair.rochant@gmail.com')")
    #cursor.execute("INSERT INTO pessoas VALUES('Dora', 66, 'dora@gmail.com')")
    #cursor.execute("INSERT INTO pessoas VALUES('Jair Pai', 64, 'jrof@gmail.com')")
    #cursor.execute("INSERT INTO pessoas VALUES('Laercio', 37, 'jkianne@gmail.com')")
    #cursor.execute("INSERT INTO pessoas VALUES('Jessica', 32, 'laerciofan@gmail.com')")

    #READ COM VARIÁVEIS
    nome = "Fumaca"
    idade = 2
    email = "fumaca@gmail.com"
    cursor.execute("INSERT INTO pessoas VALUES('"+nome+"',"+str(idade)+",'"+email+"')")

    cursor.execute("SELECT * FROM pessoas")
    print(cursor.fetchall())

    banco.commit()
    banco.close()

except sqlite3.Error as erro:
    print("Erro ao inserir dados: ", erro)