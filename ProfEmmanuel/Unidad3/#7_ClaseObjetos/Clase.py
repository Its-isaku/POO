''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 29 - oct - 2024

#! Clases y objetos
'''

class Estudiante:
    # crear atributos de la clase
    matricula = 0
    nombre = " "
    edad = 0
    promedio =  0.0
    vigente = False

# crear y guardar objetos en la clase estudiante
estudiante1 = Estudiante()
# Asignamos valores al objeto
estudiante1.matricula = 1001
estudiante1.nombre = "Alvin Yakitori"
estudiante1.edad = 22
estudiante1.promedio = 100
estudiante1.vigente = True

print(vars(estudiante1))
print(f"El nombre del primer estudiante es: {estudiante1.nombre}")

# crear y guardar objetos en la clase estudiante
estudiante2 = Estudiante()
# Asignamos valores al objeto 
estudiante2.matricula = 1002
estudiante2.nombre = "Almeraz Isai"
estudiante2.edad = 21
estudiante2.promedio = 188
estudiante2.vigente = True

print(vars(estudiante2))
print(f"El nombre del primer estudiante es: {estudiante2.nombre}")
