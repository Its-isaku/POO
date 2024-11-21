''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 11 - nov - 2024

#! practica 1 -> Exepciones
* Crearan un programa sencillo que ustedes quieran, que maneje 3 diferentes tipos de errores con
    su excepción. Deberán de ser claros en las instrucciones que le den al usuario de lo que hará en el programa.

'''
def Menu_Operaciones():
    print("\n||-----------Menu-----------||")
    print("|| 1 -> Sumar               ||")
    print("|| 2 -> Restar              ||")
    print("|| 3 -> Multiplicar         ||")
    print("|| 4 -> Dividir             ||")
    print("|| 9 -> Salir               ||")
    print("||--------------------------||\n")
    while True:
        try:
            opcion = int(input("\nIngrese opcion: "))
            return opcion
        except ValueError:
            print("Error: Debes ingresar un numero valido.\n")
            
def Calculadora_Basica(operacion):
    try:
        if operacion == 1:
            accion = "Sumar"
        elif operacion == 2:
            accion = "Restar"
        elif operacion == 3:
            accion = "Multiplicar"
        elif operacion == 4:
            accion = "Dividir"
        
        num1 = float(input(f"Ingrese el primer numero para {accion}: "))
        num2 = float(input(f"Ingrese el segundo numero para {accion}: "))
        
        if operacion == 1:
            resultado = num1 + num2
        elif operacion == 2:
            resultado = num1 - num2
        elif operacion == 3:
            resultado = num1 * num2
        elif operacion == 4:
            try:
                resultado = num1 / num2
            except ZeroDivisionError:
                print("Error: No se puede dividir por cero.\n")
                return
        print(f"El resultado es: {resultado}")
    except ValueError:
        print("Error: Debes ingresar un numero valido.\n")

print("Bienvenido a la calculadora de operaciones matematicas!\n")

while True:
    print("Elige que operacion deseas realizar(Solo numeros del 1 - 4 y 9):\n")
    operacion = Menu_Operaciones()
    
    if operacion == 9:
        print("Gracias por usar la calculadora de operaciones matematicas!\n")
        break

    elif operacion in [1, 2, 3, 4]:
        print("Operacion seleccionada Corretamente!\n")
        Calculadora_Basica(operacion)
    else:
        print("Error: Debes ingresar una opcion valida.\n")
        continue


