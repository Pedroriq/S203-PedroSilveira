import math

val = input("Entre comc um valor inteiro: ")
val = int(val)

val = math.pow(val,3)

if(val > 100):
    print (f"o numero {val} é maior que 100")
else:
    print(f"o numero {val} é menor que 100")