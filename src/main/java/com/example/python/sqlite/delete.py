import sqlite3

try:
    banco = sqlite3.connect('primeiro_banco.db')
    cursor = banco.cursor()

    # DELETE
    #cursor.execute("DELETE FROM pessoas WHERE idade > 65")

    cursor.execute("SELECT * FROM pessoas")
    print(cursor.fetchall())

    banco.commit()
    banco.close()
    print("Os dados foram removidos com sucesso")

except sqlite3.Error as erro:
    print("Erro ao excluir: ", erro)