''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 24 - sep - 24

#! practica 2 -> Ciclos

* solisitar al usuario que ingrese un numero entero positivo
* Se debe de sumar todos los digitos del nmero que el usuario ingreso
* para hacer esto, debes de recorrer cada digito y sumarlo con el siguiente.
* Al final debe de mostrar la suma total de los digitos.
'''

num = int(input("Dame un numero: "))
suma = 0

for i in str(num):
    i = int(i)
    suma += i
    
print(suma)
