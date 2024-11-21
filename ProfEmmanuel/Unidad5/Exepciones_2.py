''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 11 - nov - 2024

#! practica 2 -> Exepciones
* El programa solicita al usuario un número y permite elegir entre varias
    operaciones matemáticas. También tiene errores que se deben corregir.
    
#? Instrucciones:
1-Identifica los errores y corrige el código añadiendo manejo de excepciones (try, except).
2-Corrige el error lógico de operaciones con cadenas.
3-Añade validaciones para las opciones del menú.
4-Permite al usuario salir escribiendo "salir" en cualquier momento.
5-Mejora la experiencia del usuario con mensajes más claros.

'''
#? Programa con errores
def operaciones_matematicas():
    print("\nBienvenido, en este programa podras calcuarl el doble, triple y cuadrado de un numero!")
    while True:
        try:
            numero = int(input("Introduce un número para realizar las operaciones: "))
            while True:
                try:
                    print("\n||-------------Menu-------------||")
                    print("|| 1 -> Calcular el doble       ||")
                    print("|| 2 -> Calcular el triple      ||")
                    print("|| 3 -> Calcular el cuadrado    ||")
                    print("|| 9 -> Salir                   ||")
                    print("||------------------------------||\n")
                    opcion = int(input("Introduce el número de la operación que deseas realizar(1 - 3 o 9): "))

                    if opcion == 9:
                        print("\nSaliendo del programa...\n")
                        return
                    elif opcion == 1:
                        resultado = numero * 2
                    elif opcion == 2:
                        resultado = numero * 3
                    elif opcion == 3:
                        resultado = numero ** 2
                    else:
                        print("Operación no válida.\n")

                    print(f"El resultado es: {resultado}\n")
                    break
                except ValueError:
                    print("Error: Debes ingresar un numero valido.\n")
                except UnboundLocalError:
                    print("Error: Debes ingresar un numero entre 1 - 3 o 9.")
        except ValueError:
            print("Error: Debes ingresar un numero valido.\n")

#? Llamar a la función
operaciones_matematicas()
