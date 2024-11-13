''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 11 - nov - 2024

#! practica 1 -> Herencia

* 1) Crea la clase Padre Vehiculo y agregale 3 atributos y 1 metodoen el cual podamos desplegarr la informacion de sus atributos
* 2) Crea al menos dos subclases (Autobus, motos) que hereden de la clase vehiculo
* 3) Cada subclase debe agregar atributos y metodos especificos para ese tipo de vehiculo
* 4) crea instancias de las subclases y llamar a los metodos para obtener informacion sobre los vehiculos
* 5) Heredar el metodo presentar de la clase principal para que se presenten los vehiculos de las subclases
* 6) puedes personalizar los atributos para reptesentar vehiculos reales o ficticios
'''

# Clase Padre
class Vehiculo:
    
    def __init__(self, marca, modelo, color, tipo, motor):
        self.marca = marca
        self.modelo = modelo
        self.color = color
        self.tipo = tipo
        self.motor = motor
        
    def Presentar_Vehiculo(self):
        print(f"El tipo de este vehiculo es {self.tipo}, es de marca {self.marca}, modelo {self.modelo}, con motor {self.motor} y de color {self.color}")

# Clase Hijo 1
class Autobus(Vehiculo):
    
    def __init__(self, marca, modelo, color, tipo, motor, capacidad):
        super().__init__(marca, modelo, color, tipo, motor)
        self.capacidad = capacidad
        
    def Presentar_Autobus(self):
        super().Presentar_Vehiculo()
        print(f"La capacidad de este autobus es de {self.capacidad} pasajeros")
    
    def Bajan_Personas(self):
        print("Un pasajero ha gritado 'Bajan!'")

# Clase Hijo 2
class Motos(Vehiculo):
    
    def __init__(self, marca, modelo, color, tipo, motor, Num_ruedas):
        super().__init__(marca, modelo, color, tipo, motor)
        self.Num_ruedas = Num_ruedas
        
    def Presentar_Motos(self):
        super().Presentar_Vehiculo()
        print(f"Esta motocicleta tiene {self.Num_ruedas} ruedas")

    def Hacer_wheelie(self):
        print("La motocicleta ha hecho un wheelie, rumm rumm")

# Clase Hijo 3
class Coche(Vehiculo):
    
    def __init__(self, marca, modelo, color, tipo, motor, Num_puertas):
        super().__init__(marca, modelo, color, tipo, motor)
        self.Num_puertas = Num_puertas
        
    def Presentar_Coche(self):
        super().Presentar_Vehiculo()
        print(f"Este coche tiene {self.Num_puertas} puertas")
    
    def Pitar(self):
        print("El coche ha pitado, pii pii")

# Funciones de menú
def Menu1():
    print("||-----------Menu-----------||")
    print("|| 1 -> Crear Objetos       ||")
    print("|| 2 -> Usar metodos        ||")
    print("|| 9 -> Salir               ||")
    print("||--------------------------||")
    
    opcion = int(input("\nIngrese opcion: "))
    return opcion

def Menu_Crear_Objetos():
    print("||-----------Menu-----------||")
    print("|| 1 -> Crear Autobus       ||")
    print("|| 2 -> Crear Motocicleta   ||")
    print("|| 3 -> Crear Coche         ||")
    print("|| 9 -> Volver al menu      ||")
    print("||--------------------------||")
    
    opcion = int(input("\nIngrese opcion: "))
    return opcion

def Menu_Usar_Metodos():
    print("||------------Menu------------||")
    print("|| 1 -> Presentar Autobus      ||")
    print("|| 2 -> Bajar Personas         ||")
    print("|| 3 -> Presentar Motocicleta  ||")
    print("|| 4 -> Hacer wheelie          ||")
    print("|| 5 -> Presentar Coche        ||")
    print("|| 6 -> Pitar                  ||")
    print("|| 9 -> Volver al menu         ||")
    print("||----------------------------||")
    
    opcion = int(input("\nIngrese opcion: "))
    return opcion

# Main
print("\n||-----------------------------Practica #1 de Herencia-----------------------------||\n")

Autobus1 = None
Motos1 = None
Coche1 = None

objetos_Autobus = []
objetos_Motos = []
objetos_Coche = []

while True:
    opc = Menu1()
    
    if opc == 9:
        print("\nSaliendo...\n")
        break  # Termina el programa al elegir la opción de salida en el menú principal
    
    elif opc == 1:
        while True:
            opc2 = Menu_Crear_Objetos()
            
            if opc2 == 9:
                break  # Regresa al menú principal
            
            elif opc2 == 1:
                # Lógica para crear un Autobus
                Marca = input("Ingrese la marca: ")
                Modelo = input("Ingrese el modelo: ")
                Color = input("Ingrese el color: ")
                Tipo = input("Ingrese el tipo: ")
                Motor = input("Ingrese el motor: ")
                Capacidad = input("Ingrese la capacidad: ")
                
                Autobus1 = Autobus(Marca, Modelo, Color, Tipo, Motor, Capacidad)
                objetos_Autobus.append(Autobus1)
                print("Autobús creado exitosamente.")
                
            elif opc2 == 2:
                # Lógica para crear una Motocicleta
                Marca = input("Ingrese la marca: ")
                Modelo = input("Ingrese el modelo: ")
                Color = input("Ingrese el color: ")
                Tipo = input("Ingrese el tipo: ")
                Motor = input("Ingrese el motor: ")
                Num_ruedas = input("Ingrese el numero de ruedas: ")
                
                Motos1 = Motos(Marca, Modelo, Color, Tipo, Motor, Num_ruedas)
                objetos_Motos.append(Motos1)
                print("Motocicleta creada exitosamente.")
                
            elif opc2 == 3:
                # Lógica para crear un Coche
                Marca = input("Ingrese la marca: ")
                Modelo = input("Ingrese el modelo: ")
                Color = input("Ingrese el color: ")
                Tipo = input("Ingrese el tipo: ")
                Motor = input("Ingrese el motor: ")
                Num_puertas = input("Ingrese el numero de puertas: ")
                
                Coche1 = Coche(Marca, Modelo, Color, Tipo, Motor, Num_puertas)
                objetos_Coche.append(Coche1)
                print("Coche creado exitosamente.")
                
            else:
                print("\nOpcion invalida!\n")
    
    elif opc == 2:
        while True:
            opc3 = Menu_Usar_Metodos()
            
            if opc3 == 9:
                break  # Regresa al menú principal
            
            elif opc3 == 1:
                if Autobus1:
                    for i in objetos_Autobus:
                        i.Presentar_Autobus()
                else:
                    print("No has creado un Autobus aún.")
                
            elif opc3 == 2:
                if Autobus1:
                    Autobus1.Bajan_Personas()
                else:
                    print("No has creado un Autobus aún.")
                
            elif opc3 == 3:
                if Motos1:
                    for i in objetos_Motos:
                        i.Presentar_Motos()
                else:
                    print("No has creado una Motocicleta aún.")
                
            elif opc3 == 4:
                if Motos1:
                    Motos1.Hacer_wheelie()
                else:
                    print("No has creado una Motocicleta aún.")
                
            elif opc3 == 5:
                if Coche1:
                    for i in objetos_Coche:
                        i.Presentar_Coche()
                else:
                    print("No has creado un Coche aún.")
                
            elif opc3 == 6:
                if Coche1:
                    Coche1.Pitar()
                else:
                    print("No has creado un Coche aún.")
                
            else:
                print("\nOpcion invalida!\n")
