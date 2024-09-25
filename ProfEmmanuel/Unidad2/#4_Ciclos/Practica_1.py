''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 24 - sep - 24

#! practica 1 -> Ciclos

* solisitar al usuario que ingrese un numero y luego determinar si es par o impar
* usar siclos para desplegar  los numeros impares desde deonde empieza hasta donde termina

'''
num = int(input("Dame un numero: "))

if num%2 == 0:
    print(f"tu numero: {num} es par\n")
    print("Lista de tu numero par")
    
    for i in range(1, num, 2):
        print(i+1)
    
else:
    print(f"tu numero: {num} es impar\n")
    print("Lista de tu numero imprar")
    
    for i in range(0, num, 2):
        print(i+1)