''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 17 - sep - 24

#! practica 1 -> operadores arithmeticos

1)calcular total del valor de una pizza y una coca (total 110)
2)calcular el 10% de propina
3)Calcular el total con el 10% de la propina

'''

pizza = 80
coca =30
total = pizza + coca
Propina = total * 0.10 

total_con_propina = round(total + (total*Propina/100))

print(f"Total sin porpina {total}")
print(f"El 10% de propina es {Propina}")
print(f"Total con porpina {total_con_propina}")