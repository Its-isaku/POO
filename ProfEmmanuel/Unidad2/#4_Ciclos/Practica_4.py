''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 02 - oct - 24

#! practica 4 -> Ciclos

* crear un programa que establezcamos una palabra secreta definida (python) y un numero maximo de 3 intentos.
* usamos un bucle while que se ejecute mientras el numero de intentos sea mayor a 0
* El usuario tiene la oportunidad de advinar la palabra secreta en cada iteracion
* si el usuario adivina la la palabra secreta, el programa feliita al usuario
* y si falla, le dice la palabra secreta

'''

intentos = 3
P_Secreto = "python"
palabra = " "

while intentos > 0:
    palabra = input("Dame la palabra secreta: ")
    if(palabra == P_Secreto):
        print("Felicidades! Adivinaste la palabra secreta\n")
        break
    else:
        print("La palabra secreta es diferente, intenta de nuevo\n")
        print(f"Te quedan {intentos - 1} intentos\n")
        intentos -= 1 

