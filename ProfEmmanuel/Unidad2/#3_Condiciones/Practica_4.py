''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 24 - sep - 24

#! practica 4 -> Condiciones
 


'''
contraEstablecida = "12345678"

print("\nla contraseña debe tener al menos 8 caracteres!")
print("\n|-----------------------------------------------||\n")
contra = input("Contraseña: ")

if(len(str(contra)) >= 8):
    print("\nLa contraseña cumple los requisitos!\n")
    if(contra != contraEstablecida):
        print("\nGenial haz cambiado la contraseña!")
    else:
        print("\nContraseña es igual a la ya establecida!")
else:
    
    print("\nLa contraseña es demasiado corta e insegura!")
print("\n|-----------------------------------------------||\n") 