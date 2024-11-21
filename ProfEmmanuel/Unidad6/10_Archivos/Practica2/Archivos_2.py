''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 21 - nov - 2024

#! practica 2 -> Archivos
#* Realizar una función en la que debas introducir un numero entre 1 y 10, 
    se realice su tabla de multiplicar y se guarde en un fichero con el nombre practica.txt
'''

print("\nBienvenido, vamos a crear una tabla de multiplicar!\n")
while True:
    try:
        numero = int(input("Introduce un número entre 1 y 10: "))
        archivo = open("C:\\Users\\RogSt\\Desktop\\POO\\ProfEmmanuel\\Unidad6\\10_Archivos\\Practica2\\practica.txt", "w+")

        for i in range(1, 11):
            archivo.write(f"{numero} x {i} = {numero * i}\n")

        print("Tabla de multiplicar creada\n")
        break
    except ValueError:
        print("Debes introducir un número entre 1 y 10\n")

archivo.seek(0)
print("Tabla de multiplicar Creada: \n")
print(archivo.read())
archivo.close()