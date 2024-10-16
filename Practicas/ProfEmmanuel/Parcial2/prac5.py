pos = int(input("posicion de secuensia fibonacci: "))

a = 0
b = 1

for i in range(0,pos):
    print(a)
    b += a
    a = b - a