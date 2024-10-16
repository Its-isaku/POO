contador = 0

palabra = input("Dame una oracion corta: ")
for i in palabra:
    if(i == " "):
        contador += 1
        
print(f"La oracion tiene {contador + 1} palabras")