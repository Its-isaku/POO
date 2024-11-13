'''
* 1) Ejemolo simple de herencua en python

#? Clase Principal/Padre

'''
#? clase Padre
class Animal:
    def __init__(self,nombre, edad, tipo):
        self.nombre = nombre
        self.edad = edad
        self.tipo = tipo
        
    def Presentar_animal(self):
        print(f"Hola soy un animal de tipo {self.tipo}, me llamo {self.nombre}, y mi edad es de {self.edad} años")
        
    def Hablar(self):
        print("Todos lo animales hacen un sonido")
        
#? Clase Hijo 1
class Perro(Animal):
        
    def Hablar(self):
        print(f"El perro {self.nombre} hace Woof!")
        
    def Presentar_animal(self):
        super().Presentar_animal()

#? Clase Hijo 2
class Gato(Animal):
    
    def __init__(self, nombre, edad, tipo, Num_vidas):
        super().__init__(nombre, edad, tipo)
        self.Num_vidas = Num_vidas
        
    def Hablar(self):
        print(f"El gato {self.nombre} hace Miau!")
        
    def Presentar_animal(self):
        super().Presentar_animal()
        print(f"Numero de vidas: {self.Num_vidas}")

#? Crear objetos

#animal = Animal("Animal cuaquiera", "Edad cualquiera", "Tipo cualquiera")
#animal.Hablar()
#animal.Presentar_animal()

perro = Perro("Firulais", 2, "Perro")
perro.Hablar()
perro.Presentar_animal()

print("\n")

gato = Gato("garfield", 3, "Gato", 7)
gato.Hablar()
gato.Presentar_animal()