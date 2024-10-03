''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 02 - oct - 24

#! practica 1 -> Listas

* Crear una lista de tareas pendientes y realiza algunasd operaciones basicas con ella 
* Crear lista que contenga 5 elementos e imprimelo
* Imprime el elemento 3
* usa slicing para imprimir los elementos 3, 4, 5
* agrega una tarea e imprime la lista
* Modifica el elemento 4
* marca una tarea de las creadas como completada y eliminala e imprime la lista
* intenta imprimir el elemento 9 

'''
# se crea lista de tareas
Lista = ["Limpiar cuarto",
        "tirar basura",
        "terminar tarea",
        "regar plantas",
        "pasear perros"]
#contador de tareas
Num = 1

print("\n||---------------Lista de tareas---------------||\n")

print("Tareas pendientes:")
for tarea in Lista:
    print(f"[{Num}] {tarea}")
    Num += 1

print("\n||---------------------------------------------||\n")
print("Operacion #1: Imprime el elemento 3\n")

print(f"[3] {Lista[2]}")

print("\n||---------------------------------------------||\n")
print("Operacion #2: usa slicing para imprimir los elementos 3, 4, 5\n")

print(Lista[2:5])

print("\n||---------------------------------------------||\n")
print("Operacion #3: agrega una tarea e imprime la lista\n")

Num = 1
Lista.append("Hacer la cena")
print("Tareas pendientes:")
for tarea in Lista:
    print(f"[{Num}] {tarea}")
    Num += 1

print("\n||---------------------------------------------||\n")
print("Operacion #4: Modifica el elemento 4\n")

Num = 1
Lista[3] = "Recoger Hermano menor"
print("Tareas pendientes:")
for tarea in Lista:
    print(f"[{Num}] {tarea}")
    Num += 1

print("\n||---------------------------------------------||\n")
print("Operacion #4: marca una tarea de las creadas como completada y eliminala e imprime la lista\n")

Num = 1
print("Tareas pendientes:")
for tarea in Lista:
    print(f"[{Num}] {tarea}")
    Num += 1
    
completado = int(input("\nque tarea deseas marcar completada: "))
Lista.pop(completado - 1)
print("tarea Completada!\n")

Num = 1
print("Tareas pendientes:")
for tarea in Lista:
    print(f"[{Num}] {tarea}")
    Num += 1

print("\n||---------------------------------------------||\n")
print("Operacion #4: intenta imprimir el elemento 9\n")

print(Lista[9]) # error