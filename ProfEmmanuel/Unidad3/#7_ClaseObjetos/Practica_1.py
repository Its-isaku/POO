''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 29 - oct - 2024

#! practica 1 -> Clases y objetos

* Crea una clase rerstaurante
* con sus atributos: Nombre, Tipo_Comida, Rating, Domicilio

'''
print("\n||-----------------------Ejercicio 1-------------------------||\n")

class Restaurante:
    # crear atributos de la clase
    Nombre = " "
    Tipo_Comida = " "
    Rating = 0
    Domicilio = " "

# crear y guardar objetos en la clase estudiante
Restaurante1 = Restaurante()
# Asignamos valores al objeto
Restaurante1.Nombre = "Dominos"
Restaurante1.Tipo_Comida = "Pizza"
Restaurante1.Rating = 3
Restaurante1.Domicilio = "Revolucion #425 zona centro"

# crear y guardar objetos en la clase estudiante
Restaurante2 = Restaurante()
# Asignamos valores al objeto
Restaurante2.Nombre = "Juko"
Restaurante2.Tipo_Comida = "Boneless y Nachos con carne"
Restaurante2.Rating = 5
Restaurante2.Domicilio = "Juares, calle segunda # 4"

# crear y guardar objetos en la clase estudiante
Restaurante3 = Restaurante()
# Asignamos valores al objeto
Restaurante3.Nombre = "Hideki"
Restaurante3.Tipo_Comida = "Sushi"
Restaurante3.Rating = 2
Restaurante3.Domicilio = "Pedregal # 242"

print(vars(Restaurante1))
print(f"El nombre del primer Restaurante es: {Restaurante1.Nombre}")

print(vars(Restaurante2))
print(f"El nombre del Segundo Restaurante es: {Restaurante2.Nombre}")

print(vars(Restaurante3))
print(f"El nombre del Tercer Restaurante es: {Restaurante3.Nombre}")

print("\n||-----------------------Ejercicio 2-------------------------||\n")

'''
*Crea una clase Estudiante
*Crea 3 atributos distintos
*Uno de ellos debe ser un tipo lista donde guardes 3 calificacoiones distintas
*Crea 3 objetos distintos
'''

class Estudiante:
    Nombre =  " "
    Matricula = " "
    Calificaciones = [0, 0, 0]

# objeto 1
Estudiante1 = Estudiante()
Estudiante1.Nombre = "Isai Magdaleno"
Estudiante1.Matricula = "1001"
Estudiante1.Calificaciones = [8, 9, 10]

# objeto 2
Estudiante2 = Estudiante()
Estudiante2.Nombre = "Juan Perez"
Estudiante2.Matricula = "1002"
Estudiante2.Calificaciones = [10, 7, 5]

# objeto 3
Estudiante3 = Estudiante()
Estudiante3.Nombre = "Laura Arreola"
Estudiante3.Matricula = "1003"
Estudiante3.Calificaciones = [10, 6, 10]

print(vars(Estudiante1))
print(f"El nombre del primer estudiante es: {Estudiante1.Nombre}")

print(vars(Estudiante2))
print(f"El nombre del Segundo estudiante es: {Estudiante2.Nombre}")

print(vars(Estudiante3))
print(f"El nombre del Tercer estudiante es: {Estudiante3.Nombre}")