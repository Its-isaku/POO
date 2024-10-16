''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 08 - oct - 24

#! Examen parcial 2.

*  
* 
* 
* 
* 
* 
* 
*  
'''
#? Librerias
import random

print("\n||-----------------------------------||")
print("Ejercicio # 1\n")

contador = 0
oracion = input("dame una oracion: ")

for i in oracion:
    if(i != " "):
        contador += 1
print(f"Tu oracion tiene {contador} caracteres")

contador = 0
for i in oracion:
    if(i == " "):
        contador += 1
print(f"Tu oracion tiene {contador + 1} palabras")

oracion = oracion.upper()
print(f"Tu oracion en Mayusculas: {oracion}")

oracion = oracion.lower()
print(f"Tu oracion en minusculas: {oracion}")

print("\n||-----------------------------------||")
print("Ejercicio # 2\n")

num1 = int(input("Dame el primer digito: "))
num2 = int(input("Dame el segundo digito: "))
num3 = int(input("Dame el terecer digito: "))

if(num2 == num2  == num3):
    print(f"Los digitos 1,2 y 3 son iguales")
elif(num1 > num2):
    if(num1 > num3):
        print(f"digito 1 es el mayor")
    elif(num1 == num3):
        print(f"digito 1 y digito 3 son iguales")
    else:
        print(f"digito 3 es el mayor")
elif(num1 < num2):
    if(num2 > num3):
        print(f"digito 2 es el mayor")
    elif(num2 == num3):
        print(f"digito 2 y digito 3 son iguales")
    else:
        print(f"digito 3 es el mayor")
elif(num1 == num2):
    print(f"digito 1 y digito 2 son iguales")

print("\n||-----------------------------------||")
print("Ejercicio # 3\n")

calificacion =int(input("Dame la calificacion del alumno(0 - 100): "))

if(calificacion == 100):
    print("Calificacion  exelente!")
elif(calificacion >= 80):
    print("Calificacion  Buena!")
elif(calificacion >= 60):
    print("Calificacion  regular!")
elif(calificacion <= 59):
    print("Calificacion reprobatoria!")
    
print("\n||-----------------------------------||")
print("Ejercicio # 4\n")

num1 = random.randint(1, 50)
num2 = random.randint(1, 50)
num3 = random.randint(1, 50)

suma = num1 + num2 + num3
print(f"La suma de los numeros {num1}, {num2}, {num3} es : {suma}")

print("\n||-----------------------------------||")
print("Ejercicio # 5\n")

intentos = 3
password = "UABC2024"

while(True):
    contra = input("Ingresa contrasenia: ")
    if(contra == password):
        print("Contraseña correcta!\n")
        break
    else:
        print("Contraseña incorrecta, intenta nuevamente!\n")
        intentos -= 1
        print(f"Te quedan {intentos} intentosn\n")
        if(intentos == 0):
            print("Contraseñas agotadas!\n")
            break

print("\n||-----------------------------------||")
print("Ejercicio # 6\n") #CORREGIR CON OTRO CICLO

password = "POO_Unidad_2"

while(True):
    contra = input("Ingresa contrasenia: ")
    if(contra == password):
        print("Contraseña correcta!\n")
        break
    else:
        print("Contraseña incorrecta, intenta nuevamente!\n")

print("\n||-----------------------------------||")
print("Ejercicio # 7\n")

num1 = int(input("Dame el primer numero: "))
num2 = int(input("Dame el segundo numero: "))
num3 = int(input("Dame el terecer numero: "))
num4 = int(input("Dame el cuarto numero: "))
num5 = int(input("Dame el quinto numero: "))

promedio = (num1 + num2 + num3 + num4 + num5) / 5

print(f"El promedio de los numeros {num1}, {num2}, {num3}, {num4}, {num5} es : {promedio}")

print("\n||-----------------------------------||")
print("Ejercicio # 8\n")

pares = []
impares = []
num = int(input("Dame un numero: "))


for i in range(0,num + 2, 2):
    pares.append(i)

for j in range(1,num+ 1, 2):
    impares.append(j)
        
print(f"Los numeros pares son: {pares}")
print(f"Los numeros impares son: {impares}")
    
print("\n||-----------------------------------||")
print("Ejercicio # 9\n")

lista = []
contador1 = 0
contador2 = 0
contador3 = 0
for i in range(5):
    num = int(input("Dame un numero: "))
    lista.append(num)

for i in lista:
    if(i >= 10):
        contador1 += 1
    elif(i < 10):
        contador2 += 1

for i in range(len(lista)):
    for j in range(i + 1, len(lista)):
        if(lista[i] == lista[j]):
            contador3 += 1

print(f"cantidad de numeros mayores a 10: {contador1}")
print(f"cantidad de numeros menores a 10: {contador2}")
print(f"cantidad de numeros que se repiten: {contador3}")

print("\n||-----------------------------------||")
print("Ejercicio # 10\n")

frutas = ["manzana", "bannana", "naranja", "uva", "almendra", "kiwi", "arandano"]

print("\n" + frutas[1])
print("\n")

frutas[2] = "pera"
print(frutas)
print("\n")

frutas.append("mango")
print(frutas)
print("\n")

frutas.remove("bannana")
print(frutas)
print("\n")

frutas.insert(1, "sandia")
print(frutas)
print("\n")

print(len(frutas))
print("\n")

for i in frutas:
    print(i)
print("\n")
    
frutas.sort()
print(frutas)
print("\n")

frutas.reverse()
print(frutas)
print("\n")

lista_nueva = [fruta for fruta in frutas if(fruta.startswith("a"))]
print(lista_nueva)

print("\n||-----------------------------------||\n")
