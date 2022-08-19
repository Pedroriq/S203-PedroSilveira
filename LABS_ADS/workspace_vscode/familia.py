class Pai(object):
    nome = "Carlos"
    sobrenome = "Oliveira"
    residencias = "Ilha Bela"
    olhos = "azuis"

class Filha(Pai):
    nome = "Luciana"
    olhos = "castanhos"

class Neta(Filha):
    nome = "Maria"

print("Nomes: ")
print(Pai.nome)
print(Filha.nome)
print(Neta.nome)

print("Residências: ")
print(Pai.residencias)
print(Filha.residencias)
print(Neta.residencias)

print("Olhos: ")
print(Pai.olhos)
print(Filha.olhos)
print(Neta.olhos)  
