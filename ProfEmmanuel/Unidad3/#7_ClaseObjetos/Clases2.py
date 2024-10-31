''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 29 - oct - 2024

#! Clases y objetos 2
'''

#Crar clase con objetos, atributos , metodos con con el uso de la funcion Constructora __init__ y self
class Estudiante:
    def __init__(self, matricula, nombre, edad, prom, vig):
        #crear atributos de la clase
        self.Matricula = matricula
        self.Nombre = nombre
        self.Edad = edad
        self.promedio = prom
        self.Vigencia = vig
    
    #funciones propias de la clase
    
    def Presentar(self):
        print(f"\nHola! mi nombre es {self.Nombre}, Tengo {self.Edad} años y un promedio de {self.promedio}")
#crear y guardar objetos en la clase estudiante

#Asigno valores al objeto
estudiante1 = Estudiante(1001, "Isai Magdaleno", 21, 8.5, True)
estudiante2 = Estudiante(1002, "Emmanuel Gomez", 22, 9.0, False)

#Mostrar datos a pantalla
print(vars(estudiante1),"\n",vars(estudiante2))

estudiante1.Presentar()
estudiante2.Presentar()