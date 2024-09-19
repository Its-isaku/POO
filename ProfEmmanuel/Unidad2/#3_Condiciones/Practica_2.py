''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 18 - sep - 24

#! practica 1 -> Condiciones
# 2) Calculo de calificaciones promedio y la asignacioon de una calificacion dinal basaad en puntuacion:
    -Solicitar al usuario las calificaciones de 3 examenes.
    - calcula el promedio de esas calificaciones y la asignacioon de una calificacion final
    - calificacion como USA

'''

cal1 = int(input("Dame calificacion 1: "))
cal2 = int(input("Dame calificacion 2: "))
cal3 = int(input("Dame calificacion 3: "))

promedio = (cal1 + cal2 + cal3)/3

if promedio >= 93:
    calificacion_final = "A+"
elif promedio >= 90:
    calificacion_final = "A"
elif promedio >= 87:
    calificacion_final = "B+"
elif promedio >= 83:
    calificacion_final = "B"
elif promedio >= 80:
    calificacion_final = "B-"
elif promedio >= 77:
    calificacion_final = "C+"
elif promedio >= 73:
    calificacion_final = "C"
elif promedio >= 70:
    calificacion_final = "C-"
elif promedio >= 67:
    calificacion_final = "D+"
elif promedio >= 63:
    calificacion_final = "D"
elif promedio - 60:
    calificacion_final = "F"

print(f"Tu calificacion promedio es: {round(promedio)}")
print(f"Tu calificacion final es: {calificacion_final}")