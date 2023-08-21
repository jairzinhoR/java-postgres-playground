import sqlite3

conexao = sqlite3.connect("alunos.db")

conexao.execute(''' CREATE TABLE IF NOT EXISTS alunos (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NULL,
    idade INT NOT NULL); ''')

def inserir_aluno(nome, idade):
    conexao.execute("INSERT INTO alunos (nome, idade) VALUES (?, ?);", (nome, idade))
    conexao.commit()
    print("Aluno cadastrado")
    listar_alunos()

def listar_alunos():
    alunos = conexao.execute("SELECT * FROM alunos;")
    for aluno in alunos:
        print(aluno)

def atualizar_aluno(id, nome, idade):
    conexao.execute("UPDATE alunos SET nome = ?, idade = ? WHERE id = ?;", (nome, idade, id))
    conexao.commit()
    print("Cadastro atualizado")
    listar_alunos()

def deletar_aluno(id):
    conexao.execute("DELETE FROM alunos WHERE id = ?;", (id,))
    conexao.commit()
    print("Cadastro deletado")
    listar_alunos()

