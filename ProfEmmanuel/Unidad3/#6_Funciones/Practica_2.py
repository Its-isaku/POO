"""
- Practica 1
realizar 2 funciones
- Mostrar el nombre del restaurante y su menu de opciones a eleir
- Pedir en un input la opcion de elegir, si el numero esta fuera de las opciones
, que me vuelva a preguntar
- Despues de elegir en un input la opcion seleccionada, deberas que realizar una comparacion
para desplegar la opcion elegida por el usuario en un print
- que lo mande a la terminal el producto elegido con su precio
"""

def menu():
    opc=-1
    while(opc<=0 or opc>=6):
        print("MENU\n 1. Hamburgesa\n 2. HotDog\n 3. Papas\n 4. Chilaquiles\n 5.Huevos rancheros\n Eliga una opcion")
        opc = int(input())
        if(opc<=0 or opc>=6):
            print("opcion no valida")
    return opc

def comparacion(opc):
    if opc==1:
        return print("cuesta $70")
    elif opc==2:
        return print("cuesta $40")
    elif opc==3:
        return print("cuesta $20")
    elif opc==4:
        return print("cuesta $50")
    elif opc==5:
        return print("cuesta $60")
opc = menu()
comparacion(opc)
            



