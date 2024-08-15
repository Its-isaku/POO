#funciones

    #numero de elementos
def NumElementos(lista):
    
    contador  = 0 # inicialiso el contador en 0
    for i in range(len(lista)): #recorro el arreglo lista
        contador += 1 # se auementa 1 en 1
        
    return contador -1 # regresa el numero de  elementos en el arreglo lista -1

def NumMayor(lista):
    
    mayor = lista[0] # inicio mi lista para comparar al prime numero de mi arreglo
    for i in range(len(lista)): # Recorre cada elemento para comparar
        
        if (lista[i] > mayor): # compara el numero del arreglo lista con el numero guardaddo en el arreglo mayor
            mayor = lista[i] # si el arreglo tiene un numero mas grande lo guarda en el arreglo mayor
        
    return mayor # regresa el numero mas grande del arreglo lista 

def NumMenor(lista):
    
    menor = lista[0] # inicio mi lista para comparar al prime numero de mi arreglo
    for i in range(len(lista)): # Recorre cada elemento para comparar
        
        if (lista[i] < menor) and (lista[i] != -1):# compara el numero del arreglo lista con el numero guardaddo en el arreglo menor
            menor = lista[i] # si el arreglo tiene un numero mas pequeño lo guarda en el arreglo menor
        
    return menor # regresa el numero mas pequeño del arreglo lista 


def Sum(lisat):
    
    suma = 0 # inicio mi variable para sumar los numeros
    for i in range(len(lista)): # Recorre cada elemento del arreglo
        
        if (lista[i] != -1): # solo suma los numeros que no son -1
            suma += lista[i] # suma el numero al acumulador suma
        
    return suma # regresa la suma de los numeros en el arreglo lista

def Promedio(lista):
    
    promedio  = 0
    contador  = 0 # inicialiso el contador en 0
    suma = 0 # inicio mi variable para sumar los numeros
    for i in range(len(lista)): # Recorre cada elemento del arreglo
        
        if (lista[i] != -1): # solo suma los numeros que no son -1
            suma += lista[i] # suma el numero al acumulador suma
            
            
    for i in range(len(lista)): #recorro el arreglo lista
        if (lista[i] != -1): # solo suma los numeros que no son -1
            contador += 1 # se auementa 1 en 1
        
    promedio = suma/contador
        
    return promedio # regresa la suma de los numeros en el arreglo lista
    

#main

lista = []

while True:
    
    num = int(input("Dame un numero: (ingrea -1 para parar): "))
    lista.append(num)
    
    if num == -1:
        break
    
    
print("la lista contiene estos numeros: \n ")
for i in range(len(lista)):
    print(lista[i])
    
print("------------------------------------------------")

#NUmero de elementos en la lista
num_elementos = NumElementos(lista)
print("El numero de elementos es : ", num_elementos)

#Numero mayor en la lista
num_mayor = NumMayor(lista)
print("el numero mayor es: ", num_mayor )

#Numero menor en la lista
num_menor = NumMenor(lista)
print("el numero menor es: ", num_menor )

#suma de elementos en la lista 
Suma_elementos = Sum(lista)
print("la suma de los elementos es: ", Suma_elementos)

#Promedia el numero de elementos en la lista
Promedios_elementos = Promedio(lista)
print("el promedios de elementos en la lista es : ", Promedios_elementos)