''' 
#? Nombre: Almeraz Landeros isai Magdaleno
#? Grupo: 544
#? Profesor: Emmanuel Gomez
#? fecha: 11 - nov - 2024

#! practica 4 -> Clases y objetos

* Crear una clase Estudiante con atributos básicos como nombre, edad y matrícula, y una clase BaseDeDatos que gestionará las operaciones de registrar, editar, eliminar y consultar estudiantes.

* 1-Clase Estudiante: Contiene un constructor que inicializa los atributos nombre, edad y matricula. 
    Tiene un método mostrar_informacion para imprimir los datos del estudiante.
    
* 2-Clase BaseDeDatos: Tiene una lista estudiantes que actúa como una base de datos.

* 3-Métodos para manejar las operaciones:
    - registrar_estudiante: Crea un nuevo estudiante y lo agrega a la lista.
    - editar_estudiante: Permite cambiar el nombre y/o la edad de un estudiante en base a la matrícula.
    - eliminar_estudiante: Elimina un estudiante basado en su matrícula.
    - consultar_estudiantes: Muestra la lista de todos los estudiantes registrados.
    
* 4-Función menu: Muestra un menú interactivo para que el usuario pueda elegir qué acción realizar.
    Llama a los métodos correspondientes de la clase BaseDeDatos.

* 5-Cómo funciona:
    -Ejecuta el programa.
    -Selecciona la opción deseada en el menú: registrar, editar, eliminar o consultar estudiantes.
    -Los datos se manejan como si estuvieran en una base de datos, pero usando listas y objetos en Python.
    
* 6-Clase Estudiante: Define los atributos y un método para mostrar la información del estudiante.

* 7-Clase BaseDeDatos: Administra una lista de estudiantes y realiza operaciones CRUD(registrar, editar, eliminar, consultar).
    -Función menu: Permite la interacción con el usuario mediante un menú en consola
    
'''
class Estudiante: #? Clase Estudiante
    
    def __init__(self, nombre, edad, matricula): #? Constructor de la clase Estudiante
        self.nombre = nombre
        self.edad = edad
        self.matricula = matricula

    def mostrar_informacion(self): #? Metodo mostrar_informacion
        print(f'Nombre: {self.nombre}, Edad: {self.edad}, Matrícula: {self.matricula}')

class BaseDeDatos:#? Clase BaseDeDatos
    def __init__(self):
        self.estudiantes = [] #? Lista de estudiantes

    def registrar_estudiante(self, nombre, edad, matricula): #? Metodo registrar_estudiante
        nuevo_estudiante = Estudiante(nombre, edad, matricula) #? Crear un nuevo estudiante
        self.estudiantes.append(nuevo_estudiante) #? Agregar el nuevo estudiante a la lista
        print('Estudiante registrado con éxito.')

    def editar_estudiante(self, matricula, nombre=None, edad=None): #? Metodo editar_estudiante
        for estudiante in self.estudiantes: #? Recorre la lista de estudiantes
            if estudiante.matricula == matricula: #? Si la matricula del estudiante es igual a la matricula ingresada
                if nombre:  #? Si el nombre no es nulo
                    estudiante.nombre = nombre
                if edad:    #? Si la edad no es nula
                    estudiante.edad = edad
                print('Estudiante editado con éxito.')
                return
        print('Estudiante no encontrado.')

    def eliminar_estudiante(self, matricula):    #? Metodo eliminar_estudiante
        for estudiante in self.estudiantes:    #? Recorre la lista de estudiantes
            if estudiante.matricula == matricula:   #? Si la matricula del estudiante es igual a la matricula ingresada
                self.estudiantes.remove(estudiante)    #? Elimina el estudiante de la lista
                print('Estudiante eliminado con éxito.')
                return
        print('Estudiante no encontrado.')

    def consultar_estudiantes(self):    #? Metodo consultar_estudiantes
        if not self.estudiantes:    #? Si no hay estudiantes
            print('No hay estudiantes registrados.')
        for estudiante in self.estudiantes:    #? Recorre la lista de estudiantes
            estudiante.mostrar_informacion()   #? Muestra la informacion del estudiante

def menu():   #? Funcion menu
    print("\n||--------------Menu-------------||")
    print("|| 1 -> Registrar estudiante     ||")
    print("|| 2 -> Editar estudiante        ||")
    print("|| 3 -> Eliminar estudiante      ||")
    print("|| 4 -> Consultar estudiantes    ||")
    print("|| 9. Salir                      ||")
    print("||-------------------------------||\n")
    
    return int(input("\nIngrese opcion: "))   #? Regresa la opcion ingresada por el usuario

bd = BaseDeDatos()    #? Instancia de la clase BaseDeDatos

while True:
    opc = menu()
    
    if opc == 1:    #? Crear un nuevo estudiante
        nombre = input("Nombre: ")
        edad = input("Edad: ")
        matricula = input("Matrícula: ")
        bd.registrar_estudiante(nombre, edad, matricula)
        
    elif opc == 2:  #? Editar un estudiante
        if not bd.estudiantes:  # Verificación si no hay estudiantes
            print("No hay estudiantes registrados. Registre un estudiante primero.")
        else:
            matricula = input("Matrícula del estudiante a editar: ")
            nombre = input("Nuevo nombre (dejar en blanco para no cambiar): ")
            edad = input("Nueva edad (dejar en blanco para no cambiar): ")
            bd.editar_estudiante(matricula, nombre if nombre else None, edad if edad else None)
        
    elif opc == 3:  #? Eliminar un estudiante
        if not bd.estudiantes:  # Verificación si no hay estudiantes
            print("No hay estudiantes registrados. Registre un estudiante primero.")
        else:
            matricula = input("Matrícula del estudiante a eliminar: ")
            bd.eliminar_estudiante(matricula)
        
    elif opc == 4:  #? Consultar estudiantes
        bd.consultar_estudiantes()
        
    elif opc == 9:  #? Salir
        break
    
    else:   #? Opcion no valida
        print("Opción no válida. Intente de nuevo.")