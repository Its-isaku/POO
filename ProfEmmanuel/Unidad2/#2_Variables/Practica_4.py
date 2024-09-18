''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 17 - sep - 24

#! practica 4 -> Formulas cadraticas

'''

a = int(input("Dame el valor a: "))
b = int(input("Dame el valor b: "))
c = int(input("Dame el valor c: "))

root1 = (-b +((1/2)*(b*b - (4*a*c)))) / (2*a)
root2 = (-b -((1/2)*(b*b - (4*a*c)))) / (2*a)

print(f"Raiz 1: {root1}")
print(f"Raiz 2: {root2}")
