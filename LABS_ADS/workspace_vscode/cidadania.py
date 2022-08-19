import cProfile
from email.headerregistry import ContentDispositionHeader
from mailbox import NotEmptyError


class Pessoa(object):
    nome = None
    sexo = None
    idade = None

    def __init__(self, nome, idade, sexo):
        self.nome = nome
        self.idade = idade
        self.sexo = sexo


class Cidadao(Pessoa):
    cpf = None
    def __init__(self, nome, idade, sexo, cpf):
        super().__init__(nome, idade, sexo)
        self.cpf = cpf


nome = input('Nome: ')
idade = input('Idade: ')
sexo = input('Sexo: ')
cpf = input('Cpf: ')

cidadao_1 = Cidadao(nome, idade, sexo, cpf)

print('Nome do cidadao: ' + cidadao_1.nome)
print('Idade do cidadao: ' + cidadao_1.idade)
print('Sexo do cidadao: ' + cidadao_1.sexo)
print("CPF do cidadao: " + cidadao_1.cpf)