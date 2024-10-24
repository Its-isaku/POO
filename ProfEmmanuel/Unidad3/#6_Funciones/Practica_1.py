''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 16 - oct - 24

#! practica 1 -> Funciones

* 
*  
* 
* 
* 

'''

print("\nhola Mundo!")
print("Como estas?\n")

print("hola Mundo!")
print("Como estas?\n")

print("hola Mundo!\n")
print("Como estas?\n")

print("hola Mundo!")
print("Como estas?\n")

print("hola Mundo")
print("Como estas?\n")

print("--------------------------------------------------------")

def HolaMundo():
    print("\nHola Mundo! 2")
    print("Como estas? 2\n")    

HolaMundo()

print("--------------------------------------------------------")

nombre = "Emmanuel"
edad = 32

def cumple():
    print(f"Feliz cumple #{edad} {nombre}!\n")
    
    
def cumple2(nombre = "Chichita", edad = 120):
    print(f"Feliz cumple #{edad} {nombre}!\n")

def cumple3(nombre, edad):
    print(f"Feliz cumple #{edad} {nombre}!\n")

def cumple4():
    edad = 32
    nombre = "Emmanuel"
    print(f"Feliz cumple #{edad} {nombre}!\n")


cumple()
cumple2()
cumple3("GOKU", 1000)
cumple4()
