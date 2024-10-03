''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 02 - oct - 24

#! practica 2 -> Listas

* Crea una lista con nombres de frutas e imprimelo: manzana, bannana, naranja, uva, almendra, kiwi, arandano 
* Imprime el segundo elemento de la lista de frutas
* cambia el tercer elemento de la lista de frutas a "pera" e imprime la lista
* agrega "mango" al final de la lista e imprime la lista de frutas
* elimina "banana" de la lista de frutas e imprime la lista
* Inserta "sandia"  entre manzana  y pera e imprime la lista
* imprime la longitud de la lista de frutas
* utiliza un ciclo for para imprimir cada fruta en la lista
* ordena la lista de frutas alfabeticamente
* invierte el orden de la lista de rutas
* investiga como crear una lista nueva con las frutas que inician con la letra 'a.'

'''

frutas = ["manzana", "bannana", "naranja", "uva", "almendra", "kiwi", "arandano"]

print("\n||---------------Lista de frutas---------------||\n")
print("Operacion #1: Imprime el segundo elemento de la lista de frutas \n")

print(frutas[1])

print("\n||---------------------------------------------||\n")
print("Operacion #2: cambia el tercer elemento de la lista de frutas a 'pera' e imprime la lista\n")

frutas[2] = "pera"
print(frutas)

print("\n||---------------------------------------------||\n")
print("Operacion #3: agrega 'mango' al final de la lista e imprime la lista de frutas\n")

frutas.append("mango")
print(frutas)

print("\n||---------------------------------------------||\n")
print("Operacion #4: elimina 'banana' de la lista de frutas e imprime la lista\n")

frutas.remove("bannana")
print(frutas)

print("\n||---------------------------------------------||\n")
print("Operacion #5: Inserta 'sandia'  entre manzana  y pera e imprime la lista\n")

frutas.insert(1 ,"sandia")
print(frutas)

print("\n||---------------------------------------------||\n")
print("Operacion #6: imprime la longitud de la lista de frutas\n")

print(f"Longitud de la lista frutas: {len(frutas)}")

print("\n||---------------------------------------------||\n")
print("Operacion #7: utiliza un ciclo for para imprimir cada fruta en la lista\n")

Num = 0
print("Lista de frutas:")
for fruta in frutas:
    print(f"[{Num}] {fruta}")
    Num += 1

print("\n||---------------------------------------------||\n")
print("Operacion #8: ordena la lista de frutas alfabeticamente\n")

frutas.sort()
print(frutas)

print("\n||---------------------------------------------||\n")
print("Operacion #9: invierte el orden de la lista de rutas\n")

frutas.reverse()
print(frutas)

print("\n||---------------------------------------------||\n")
print("Operacion #10: investiga como crear una lista nueva con las frutas que inician con la letra 'a.'\n")

nueva_lista = [fruta for fruta in frutas if fruta.startswith("a")]
print(nueva_lista)

#? [fruta for fruta in frutas]: Es un bucle que recorre cada elemento (fruta) en la lista frutas.
#? [if fruta.startswith("a")]: Es un filtro que verifica si el nombre de la fruta comienza con la letra 'a'. 