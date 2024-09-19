''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 18 - sep - 24

#! practica 1 -> Condiciones
# 1) crear un porgrama que determina si un numero ingresado por el usueario es positivo o negativo o igial a 0
'''

num  = int(input("Dame un nuero: "))
if num < 0:
    print("El numero es negativo")
elif num > 0:
    print("El numero es positivo")
elif num == 0:
    print("El numero es igual a 0")