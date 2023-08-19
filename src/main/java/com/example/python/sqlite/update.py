import sqlite3

try:
    banco = sqlite3.connect('primeiro_banco.db')
    cursor = banco.cursor()

    # UPDATE
    cursor.execute("UPDATE pessoas SET idade = 36 WHERE nome = 'Jair'")

    cursor.execute("SELECT * FROM pessoas")
    print(cursor.fetchall())

    banco.commit()
    banco.close()

except sqlite3.Error as erro:
    print("Erro ao atualizar os dados: ", erro)