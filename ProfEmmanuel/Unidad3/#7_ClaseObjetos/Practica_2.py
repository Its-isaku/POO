''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 30 - oct - 2024

#! practica 2 -> Clases y objetos

* Crea una clase Auto
* Minimo 5 atributos
* 2 objetos
* Los siguientes objetos:

    * Presentar_Auto() -> Mostrar losd atos del auto creado
    
    * Acelerar() -> Cada vez que se llame este metodo aumente la velocidad de +10, si se llama antes de encender el auto, que despliegue: "Primero encender auto"
    
    * Detener() -> Si la velocidad es mayor a 0 disminuir -10, si esta en cero desplegar: "Auto se ha detenido"
    
    * Apagar() -> Si esta encendido y la  verlocidad  es 0, que despliegue: "Apagando auto". sino: "Auto Apagado"

'''

class Auto:
    
    def __init__(self, modelo, marca, año, color, tipoTransmicion):
        self.Modelo = modelo
        self.Marca = marca
        self.Año = año
        self.color = color
        self.TipoTransmicion = tipoTransmicion
        self.Encendido = False
        self.Velocidad = 0
        
    # Funciones
    
    def Presentar_Auto(self):
        print(f"Modelo: {self.Modelo}, Marca: {self.Marca}, Año: {self.Año}, Color: {self.color}, Tipo de transmision: {self.TipoTransmicion}, Encendido: {self.Encendido}, Velocidad: {self.Velocidad}")
        
    def Encender(self): #metodo propio 
        self.Encendido = True
        print("Auto encendido!\n")
        
    def Acelerar(self):
        if self.Encendido == True:
            self.Velocidad += 10
            print(f"Velocidad ahora: {self.Velocidad}Km/h")
        else:
            print("\nPrimero enciende el auto!\n")
            
    def Detener(self):
        if self.Velocidad > 0 and self.Encendido == True:
            self.Velocidad -= 10
            print(f"Velocidad ahora: {self.Velocidad}Km/h")
        elif self.Encendido == False:
            print("\nAuto Apagado\n         ")
        elif self.Velocidad == 0:
            print("\nAuto se ha detenido\n")
            
    def Apagar(self):
        if self.Encendido == True and self.Velocidad > 0:
            print("Debes parar el auto primero!\n")
        elif self.Encendido == True and self.Velocidad == 0:
            self.Encendido = False
            print("\nAuto Apagado\n")
        elif self.Encendido == False:
            print("\nAuto Apagado\n")
            
def Menu1():
    print("||-----------Menu------------||")
    print("|| Que Auto deseas usar?     ||")
    print("|| 1 -> Auto2                ||")
    print("|| 2 -> Auto1                ||")
    print("|| 9. Salir                  ||")
    print("||---------------------------||")
    
    opcion = int(input("\nIngrese opcion: "))
    return opcion
    
def Menu2():
    print("||-----------Menu-----------||")
    print("|| 1 -> Encender            ||")
    print("|| 2 -> Acelerar            ||")
    print("|| 3 -> Detener             ||")
    print("|| 4 -> Apagar              ||")
    print("|| 9. Salir                 ||")
    print("||--------------------------||")
    
    opcion = int(input("\nIngrese opcion: "))
    return opcion
            
print("||-------------------------Practica de clase Auto-------------------------||")

Auto1 = Auto("Mustang", "Ford", 1965, "Rojo", "Manual")
Auto2 = Auto("Camaro", "Chevrolet", 1969, "Negro", "Automatico")

print("\nLista de Autos:")
Auto1.Presentar_Auto()
Auto2.Presentar_Auto()
print("\n")

while True:
    opc = Menu1()
    
    if opc == 9:
        print("\nSaliendo...\n")
        break
    
    elif opc == 1:
        while True:
            opc2 = Menu2()
            
            if opc2 == 9:
                break
            
            elif opc2 == 1:
                Auto1.Encender()
                
            elif opc2 == 2:
                Auto1.Acelerar()
                
            elif opc2 == 3:
                Auto1.Detener()
                
            elif opc2 == 4:
                Auto1.Apagar()
                
            else:
                print("\nOpcion invalida!\n")
    elif opc == 2:
        while True:
            opc2 = Menu2()
            
            if opc2 == 9:
                break
            
            elif opc2 == 1:
                Auto1.Encender()
                
            elif opc2 == 2:
                Auto1.Acelerar()
                
            elif opc2 == 3:
                Auto1.Detener()
                
            elif opc2 == 4:
                Auto1.Apagar()
                
            else:
                print("\nOpcion invalida!\n")
        
    else:
        print("\nOpcion invalida!\n")


print("||------------------------------------------------------------------------||")