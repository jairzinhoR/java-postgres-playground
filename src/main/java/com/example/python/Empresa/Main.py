import sqlite3;

conn = sqlite3.connect("DadosEmpresa.db")

#conn.execute('CREATE TABLE profissao (ID INTEGER PRIMARY KEY AUTOINCREMENT, nome_profissao TEXT)')
#conn.execute("INSERT INTO profissao (nome_profissao) VALUES ('Sociólogo')")
#conn.execute("INSERT INTO profissao (nome_profissao) VALUES ('Artista')")
#conn.execute("INSERT INTO profissao (nome_profissao) VALUES ('Professor')")
#conn.execute("INSERT INTO profissao (nome_profissao) VALUES ('Cientista de Dados')")

#conn.execute('CREATE TABLE pagamento (ID INTEGER PRIMARY KEY AUTOINCREMENT, ID_Contratado INTEGER, VALOR DOUBLE)')

#conn.execute('CREATE TABLE contratado (ID INTEGER PRIMARY KEY AUTOINCREMENT, nome TEXT, CPF INTEGER, ID_Profissao INTEGER)')

conn.commit()

listar = conn.execute("SELECT * FROM profissao;")
for i in listar:
    print(i)

#conn.execute('CREATE 
# TABLE pagamento (INT ID, ID_contratado, Valor)')
#conn.execute('CREATE TABLE contratado (INT ID, TEXT ID_Nome, Valor)')