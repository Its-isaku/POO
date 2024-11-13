''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 12 - nov - 2024

#! practica 2 -> Herencia

Instrucciones:

* Crear una jerarquía de clases para representar empleados en una empresa:

* En este ejemplo, crearemos una clase base Empleado con un constructor y un método para calcular el salario anual.

* Luego, crearemos una subclase Gerente que hereda de Empleado y agrega un atributo bono.

* Utilizamos super() en el constructor de la subclase para llamar al constructor de la superclase, asegurando que los atributos nombre y salario se inicialicen correctamente.

* Además, en la subclase Gerente, sobreescribiremos el método calcular_salario_anual para agregar el bono al salario anual.

* Usando super(), llamamos al método de la superclase Empleado para obtener el salario base anual y luego agregamos el bono.

* Este ejemplo demuestra cómo super() se utiliza para llamar a métodos y constructores de la superclase, permitiendo que la subclase extienda o modifique la funcionalidad heredada.
'''

class Empleado:
    
    def __init__(self, nombre, salario):
        self.nombre = nombre
        self.salario = salario # salario semanal
        
    def calcular_salario_anual(self):
        return ((self.salario * 4) * 12)  # salario anual
    
    def presentar_empleado(self):
        print(f"El empleado {self.nombre} gana ${self.salario} a la semana, ${self.salario * 4} al mes y ${self.calcular_salario_anual()} al año")
        
class Gerente(Empleado):
    
    def __init__(self, nombre, salario, bono):
        super().__init__(nombre, salario)
        self.bono = bono
        
    def calcular_salario_anual(self):
        salario_base = super().calcular_salario_anual()
        return salario_base + self.bono
    
    def presentar_gerente(self):
        super().presentar_empleado()
        print(f"Además, el gerente {self.nombre} recibe un bono de ${self.bono} al año")
        
# Crear instancias de las clases

print()
empleado1 = Gerente("Juan", 500, 12000)
empleado1.presentar_gerente()

print()
empleado2 = Gerente("ivann", 1000, 20000)
empleado2.presentar_gerente()

print()
empleado3 = Gerente("isai", 1800, 30000)
empleado3.presentar_gerente()
print()


