''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 17 - sep - 24

#! practica 2 -> Operadores  de asignacion
-
-Debe de actulizar automaticamente para mostrar el total de frutas en la canasta
-Inicialmente tienes 10 frutas en la canasta y necesitamos 20 en total
-vas a realizar los calculos necesarios con cada operador
'''
frutas = 10
print(f"frutas iniciales: {frutas}")

frutas -= 8
print(f"Se le restan 8 fruas: {frutas}")

frutas += 3
print(f"Se le suman 3 fruas: {frutas}")

frutas *= 8
print(f"Se multiplican por 8: {frutas}")

frutas /= 2
print(f"Se dividen entre 2: {frutas}")

print(f"El total de frutas es: {round(frutas)}")


