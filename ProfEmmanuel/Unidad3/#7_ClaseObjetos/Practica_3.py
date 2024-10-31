class Banco:
    def __init__(self, titular, saldo, nip):
        """
        Constructor de la clase Banco que inicializa el titular, saldo y nip.
        """
        self.titular = titular
        self.saldo = saldo
        self.nip = nip

    def mostrar_datos(self):
        """
        Muestra el nombre del titular y el saldo actual de la cuenta.
        """
        print(f"Bienvenido {self.titular}! Su saldo es: ${self.saldo}")

    def verificar_datos(self, nip, titular):
        """
        Verifica si el nip y el titular ingresados coinciden con los datos de la cuenta.
        """
        return self.nip == nip and self.titular == titular

    def depositar(self, monto):
        """
        Agrega el monto ingresado al saldo si es un número positivo.
        """
        if monto >= 0:
            self.saldo += monto
            print(f"Depositado exitosamente. Nuevo saldo: ${self.saldo}")
        else:
            print("No se puede depositar una cantidad negativa.")

    def retirar(self, monto):
        """
        Resta el monto del saldo si es válido (mayor o igual a cero y no supera el saldo).
        """
        if 0 <= monto <= self.saldo:
            self.saldo -= monto
            print(f"Retirado exitosamente. Nuevo saldo: ${self.saldo}")
        else:
            print("Cantidad no válida para retirar.")

def menu_principal():
    """
    Muestra el menú principal con opciones para crear cuenta, acceder y salir.
    """
    print("\n||-----------Menu------------||")
    print("|| 1 -> Crear cuenta         ||")
    print("|| 2 -> Acceder Cuenta       ||")
    print("|| 9 -> Salir                ||")
    print("||---------------------------||")
    return int(input("\nIngrese opcion: "))

def menu_operaciones():
    """
    Muestra el menú de operaciones para depositar, retirar, ver saldo y salir.
    """
    print("\n||-----------Operaciones-----------||")
    print("|| 1 -> Depositar                   ||")
    print("|| 2 -> Retirar                     ||")
    print("|| 3 -> Ver saldo                   ||")
    print("|| 9 -> Salir                       ||")
    print("||----------------------------------||")
    return int(input("\nIngrese opcion: "))

def crear_cuenta():
    """
    Crea una nueva cuenta con un titular, un nip y un saldo inicial.
    """
    titular = input("Titular de la cuenta: ")
    nip = input("NIP (4 dígitos): ")
    
    # Validación de que el NIP tiene 4 dígitos numéricos
    if len(nip) != 4 or not nip.isdigit():
        print("Error: El NIP debe tener exactamente 4 dígitos numéricos.")
        return  # Salimos de la función sin crear una cuenta

    saldo_inicial = float(input("Primer depósito (mínimo $100): $"))
    
    # Verifica que el depósito inicial sea al menos $100
    if saldo_inicial < 100:
        print("Error: El depósito inicial debe ser al menos $100.")
        return  # Salimos de la función sin crear una cuenta

    # Crea la cuenta y la agrega a la lista de clientes
    nueva_cuenta = Banco(titular, saldo_inicial, nip)
    clientes.append(nueva_cuenta)
    print(f"Cuenta creada con éxito para {titular}.")

def encontrar_cuenta(clientes):
    """
    Busca una cuenta en la lista de clientes verificando NIP y titular.
    """
    nip = input("Introduzca su NIP: ")
    titular = input("Introduzca nombre asociado con cuenta: ")
    
    # Busca la cuenta en la lista de clientes
    for cliente in clientes:
        if cliente.verificar_datos(nip, titular):
            return cliente
    print("NIP o titular incorrecto.")
    return None

# Lista para almacenar múltiples cuentas
clientes = []

print("\n||-------------------------Practica de clase banco------------------------||")

# Ciclo principal del programa para manejar el menú principal
while True:
    opcion = menu_principal()
    
    # Opción para salir del programa
    if opcion == 9:
        print("\nSaliendo...\n")
        break
    
    # Opción para crear una cuenta
    elif opcion == 1:
        crear_cuenta()
    
    # Opción para acceder a una cuenta existente
    elif opcion == 2:
        if clientes:
            cliente = encontrar_cuenta(clientes)
            
            # Verifica que se encontró una cuenta
            if cliente:
                # Ciclo para realizar operaciones dentro de la cuenta
                while True:
                    opcion_operacion = menu_operaciones()
                    
                    # Salir de las operaciones
                    if opcion_operacion == 9:
                        print("\nSaliendo...\n")
                        break
                    
                    # Opción para depositar dinero
                    elif opcion_operacion == 1:
                        monto = float(input("Monto a depositar: $"))
                        cliente.depositar(monto)
                    
                    # Opción para retirar dinero
                    elif opcion_operacion == 2:
                        monto = float(input("Monto a retirar: $"))
                        cliente.retirar(monto)
                    
                    # Opción para mostrar el saldo
                    elif opcion_operacion == 3:
                        cliente.mostrar_datos()
                    
                    # Mensaje para opción inválida en el menú de operaciones
                    else:
                        print("\nOpción inválida!\n")
        else:
            print("\nNo hay cuentas disponibles.")
    
    # Mensaje para opción inválida en el menú principal
    else:
        print("\nOpción inválida.")

print("\n||------------------------------------------------------------------------||\n")
