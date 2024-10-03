from datetime import time
from random import choice
import string
import time  # Importa el módulo correcto

letras = string.ascii_letters + " "
resultado = ""

for letra in "Hola Mundo":
    while True:
        L = choice(letras)
        print(resultado + L)
        if L == letra:
            resultado += L
            break  
        time.sleep(0.01)