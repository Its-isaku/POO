''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 24 - sep - 24

#! practica 3 -> Condiciones
 


'''

edad = int(input("Dame tu edad: "))
genero = input("Dame tu genero(m/f): ")

if(edad >=18):
    if(genero == "M"):
        print("Eres un hombre mayor de edad!")
    else:
        print("Eres una mujer mayor de edad!")
else:
    print("Eres menor de edad!")