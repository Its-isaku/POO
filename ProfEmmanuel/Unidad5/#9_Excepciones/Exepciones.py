
#! Exepciones

"""
* Se utliiza un objeto especial llamdo exepcion para controlar cualquier error que ocurra en un programa.
* cuando ocurre un error, python genera un objeto exepcion y lo lanza o arroja. Si no se controla esta exepcion la ejecucion del programa se datiene y se 
    muestra el eror (traceback) que indica la causa del error.
* Python maneja ;as exepciones de manera elegante, lo que permite a los programadores detectar, informar y manejar errores de manera eficiente.

#? Tipos de errores:
* python tiene varios tipos de errores, algunos de los cuales son:
    1. SyntaxError: se produce cuando se escribe un codigo que no sigue las reglas de la sintaxis de python.
    2. NameError: se produce cuando se intenta acceder a una variable que no esta definida.
    3. TypeError: se produce cuando se intenta realizar una operacion no permitida en un tipo de dato.
    4. ValueError: se produce cuando se intenta realizar una operacion con un valor inapropiado.
    5. ZeroDivisionError: se produce cuando se intenta dividir un numero por cero.
    6. FileNotFoundError: se produce cuando se intenta abrir un archivo que no existe.
    7. ImportError: se produce cuando se intenta importar un modulo que no existe.
    8. IndexError: se produce cuando se intenta acceder a un indice que no existe en una lista.
    9. KeyError: se produce cuando se intenta acceder a una clave que no existe en un diccionario.
    10. AttributeError: se produce cuando se intenta acceder a un atributo que no existe en un objeto.
    11. Exeption: es la clase base para todas las exepciones en python.
    
#?||---------------------------------------------Ejemplos---------------------------------------------||

    print(5 + "5")

    print(0/0)

    import math
    print(math.exxp(1000))

    lista = [1, 2, 3, 4]
    print(lista[4])

    llave = {"nombre": "Juan", "edad": 25}
    print(llave["apellido"])

    x = open("archivo.txt")

    import request

    ptint("hola"))
    
#?||----------------------------------------Como usar try-exept----------------------------------------||






#?||---------------------------------------------Ejemplos---------------------------------------------||
try:
    #bloque de codigo 1
    pass
except :
    
try:
    #bloque de codigo 2
    pass
else:
    #bloque de codigo 3
    pass
finally:
    #bloque de codigo 4
    pass
except:
    

def divicion(a, b):
    resultado = a / b
    print(resultado)
divicion(10, 10)

def divicion(a, b):
    try:
        resultado = a / b
        print(resultado)
    except ZeroDivisionError: 
        print("No se puede dividir por cero")
divicion(0, 0)

def divicion(a, b):
    try:
        resultado = a / b
    except ZeroDivisionError: 
        print("No se puede dividir por cero")
    else:
        print(resultado)
divicion(5, 5)

def divicion(a, b):
    try:
        resultado = a / b
    except ZeroDivisionError: 
        print("No se puede dividir por cero")
    else:
        print(resultado)
    finally:
        print("Cualquier cosa se ejecutara siempre al final") 
divicion(0, 0)
"""

try:
    resulrado = 10 / "xd"
except ZeroDivisionError:
    print("No se puede dividir por cero")
except TypeError:
    print("No se puede dividir por una cadena")
