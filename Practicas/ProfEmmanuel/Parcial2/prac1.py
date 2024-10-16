tacos_asada = 30
tacos_adobada = 35
tacos_cabeza = 40
sodas = 25

Porcentaje = 0
Propina = 0
Total = 0
Total_ConPropina = 0

contador = int(input("cuantos tacos de asada fueron? "))
Total += contador * tacos_asada

contador = int(input("cuantos tacos de adobada fueron? "))
Total += contador * tacos_adobada

contador = int(input("cuantos tacos de cabeza fueron? "))
Total += contador * tacos_cabeza

contador = int(input("cuantas sodas fueron? "))
Total += contador * sodas

Porcentaje = int(input("cuanto deseas dar de propina(10%/15%/20%)? "))
Propina = Total * (Porcentaje * 0.01)
Total_ConPropina = Propina + Total

print(f"El total sin propina es: {Total}")
print(f"El total con propina es: {Total_ConPropina}")


