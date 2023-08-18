import unittest
from piloto import Piloto

class PilotoTest(unittest.TestCase):
    def setUp(self):
        self.piloto1 = Piloto('Ayrton', 50000)
        self.piloto2 = Piloto('Rubinho', 40000)
        self.piloto3 = Piloto('Kaka', 10000)

    def test_email(self):
        self.assertEqual(self.piloto1.email, 'Ayrton@email.com.br')
        self.assertEqual(self.piloto2.email, 'Rubinho@email.com.br')
        self.assertEqual(self.piloto3.email, 'Kaka@email.com.br')

    def test_aumento_salario(self):
        self.assertEqual(self.piloto1.aumentar_salario(), 55000)
        self.assertEqual(self.piloto2.aumentar_salario(), 44000)
        self.assertEqual(self.piloto3.aumentar_salario(), 11000)

# Este poasso abaixo permite que sejam executados todos os testes

if __name__ == '__main__':
    unittest.main()