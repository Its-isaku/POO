''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 24 - sep - 24

#! practica 3 -> Ciclos

* 
* 
* 
* 
'''
print("debes dar los numeros desde el 0 hasta tu numero deseado")
print("EJ: 0123")
num = input("Introduce un  numero: ")

for s1 in num:
    fila =  [] #creo una lista para acomodar las compinaciones
    for s2 in num:
        fila.append(f"({s1} {s2})")
    print(f", ".join(fila)) 
