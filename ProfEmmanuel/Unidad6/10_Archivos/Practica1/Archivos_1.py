''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 21 - nov - 2024

#! practica 1 -> Archivos
#* Escribe un mensaje en un fichero y posteriormente léelo.
'''

Fichero = open('C:\\Users\\RogSt\\Desktop\\POO\\ProfEmmanuel\\Unidad6\\10_Archivos\\Practica1\\prueba1.txt', 'a+')
Fichero.write("Hola Mundo\n")
Fichero.seek(0)
print(Fichero.read())
Fichero.close()