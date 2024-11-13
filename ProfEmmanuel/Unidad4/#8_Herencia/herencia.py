#herencia

#concepto
"""
la herencia en python es un concepto fundamental, rn la programacion orientada
a objetos que permite crear nuevas clases basadas en clases existentes.

la herencia permite que una clase herede atrivutos y metodos de otra clase (la clase base 
o superclase), lo que facilita la reutilizacion de codigo y la construccion de jerarquias
de clases.
La nueva clase creada se llama subclase o clas derivada.

En la herencia, la subclase adquiere las caracteristicas o atributos de la superclse
y puede agregar sus propios atributos y metodos incluso modificar los heredados.

Esto fomenta el principi de reutilizacion de codigo y permite una estructura
de programacion modular.
"""

"""
VENTAJAS

-representa bien las relaciones del mundo real
-propporciona la reutilizacion de un codigo. no tenemos que escribir el mismo codigo
una y otra vez
-nos permite agregar mas caracteristicas a una clase sin modificarla
- es de naturaleza transitiva, lo que significa que si la clase b hereda lo de la clse a, entonces
todas las subclases de b heredaran automaticamente de la clase A.

SINTAXIS DE PYTHON.

1) herencia
"""
class Padre:
    def __init__(self, a1_padre, a2_padre):
        self.a1_padre=a1_padre
        self.a2_padre=a2_padre

    def metodo1_padre(self):
        return "metodo uno de la clase padre"
    

class Padre2:
    def __init__(self, a1_padre2, a2_padre2):
        self.a1_padre2=a1_padre2
        self.a2_padre2=a2_padre2

    def metodo1_padre2(self):
        return "metodo uno de la clase padre2"
    
class Hijo(Padre):
    def __init__(self, a1_padre, a2_padre, a1_hijo):
        Padre.__init__(a1_padre, a2_padre)
        self.a1_hijo=a1_hijo

    def metodo1_hijo(self):
        return "metodo 1 de la clase hijo"
    
# 1) Ejemplo simple de herencia en python

# Clase Padre
class Animal:
    def __init__(self, tipo, nombre, edad):
        self.tipo = tipo
        self.nombre = nombre
        self.edad = edad

    def presentar_animal(self):
        print(f"hola soy un animal de tipo {self.tipo}, me llamo {self.nombre} y mi edad es de {self.edad} años")

    def hablar(self):
        print("Todos los animales emiten un ruido")

class Perro(Animal):
    def hablar(self):
        print(f"el perro {self.nombre} hace Woof Woof!")

class Gato(Animal):
    def __init__(self, tipo, nombre, edad, num_vidas):
        super().__init__(tipo, nombre, edad)
        self.num_vidas = num_vidas

    def hablar(self):
        print("El gato hace miau miau")

    def presentar_gato(self, color):
        print(f"Te presento al gato {self.nombre} y es color {color}")

# Crear objetos en sus debidas clases
animal = Animal("Tipo cualquiera", "Animal cualquiera", "Edad cualquiera")
perro1 = Perro("perro", "firulais" , 5)

gato1=Gato("Gato","Lia", 7, 9)

gato1.hablar()
gato1.presentar_gato("naranja")

# Metodo super()
"""
Al llamar al nombre directo de la clase para la herencia de un atributp
y/o metodo nos trae lo que queramos heredar de la clase padre a la clase pa
dre a la subclase sin embargo el uso del metodo super() nos permite traer con e
xactitud con manera correcrta y eficiente lo que necesitamos heredar de la 
clase padre. 
"""
