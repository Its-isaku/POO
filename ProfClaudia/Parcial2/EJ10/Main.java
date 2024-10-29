//* Librerias
import java.util.Scanner;

//* Main
public class Main 
{
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) 
    {
        //? variables
        Banco banco = new Banco();
        int opc = 0;

        do
        {
            Menu();
            System.out.print("Ingresa la opcion deseada: ");
            String Aux = scanner.nextLine();

                if(esNumero(Aux))
                {
                    opc = Integer.parseInt(Aux);

                    switch(opc)
                    {
                        case 1 -> { CrearCuenta(banco); }
                        case 2 -> { AccederCuenta(banco); }
                        case 9 -> System.out.println("\nSaliendo...\n");
                        default -> System.out.println("\nError: Ingrese una opcion valida.\n");
                    }
                }
        }while(opc != 9);


    }
    //* Metodos
    
    //Menu
    public static void Menu() 
    {
        System.out.println("\n||-------------------Menu de Banco---------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 1 -> Crear cueta bancaria                           ||");
        System.out.println("|| 2 -> Acceder a cuenta                               ||");
        System.out.println("|| 9 -> Salir                                          ||");
        System.out.println("||                                                     ||");
        System.out.println("||-----------------------------------------------------||\n");
    }

    private static void CrearCuenta(Banco banco)
    {
        String Aux = "";

        System.out.println("\n||--------------------------------------------------||\n");

       // Validación para el nombre del titular: solo letras, sin números ni caracteres especiales
        String titular = "";
        while (!titular.matches("[a-zA-Z ]+")) 
        {
            System.out.print("Ingrese el nombre del titular: ");
            titular = scanner.nextLine();

            if (!titular.matches("[a-zA-Z ]+")) 
                System.out.println("El nombre solo debe contener letras y espacios.\n");
        }


        // Validación para el tipo de cuenta
        String tipoCuenta = "";
        while (!(tipoCuenta.equalsIgnoreCase("Personal") || tipoCuenta.equalsIgnoreCase("Empresa"))) {
            System.out.print("Ingrese el tipo de cuenta(Personal/Empresa): ");
            tipoCuenta = scanner.nextLine();
            if (!(tipoCuenta.equalsIgnoreCase("Personal") || tipoCuenta.equalsIgnoreCase("Empresa"))) {
                System.out.println("Tipo de cuenta inválido. Debe ser 'Personal' o 'Empresa'.\n");
            }
        }

        // Validación para el primer depósito mayor a $100
        double saldo = -1;
        while (saldo < 100) {
            System.out.print("Ingrese el primer depósito (debe ser mayor a $100): ");
            Aux = scanner.nextLine();
            if (esNumero(Aux)) {
                saldo = Double.parseDouble(Aux);
                if (saldo < 100) {
                    System.out.println("El depósito debe ser mayor a $100.\n");
                }
            } else {
                System.out.println("Depósito inválido. Ingrese un número válido.\n");
            }
        }

        // Validación para el número de cuenta de 9 dígitos (solo números)
        String numeroCuenta = "";
        while (numeroCuenta.length() != 9 || !esNumero(numeroCuenta)) {
            System.out.print("Ingrese el número de cuenta (9 dígitos): ");
            numeroCuenta = scanner.nextLine();
            if (numeroCuenta.length() != 9 || !esNumero(numeroCuenta)) {
                System.out.println("Número de cuenta inválido. Debe ser de 9 dígitos.\n");
            }
        }

        // Validación para la CLABE interbancaria de 16 dígitos (solo números)
        String clabe = "";
        while (clabe.length() != 16 || !esNumero(clabe)) {
            System.out.print("Ingrese la CLABE interbancaria (16 dígitos): ");
            clabe = scanner.nextLine();
            if (clabe.length() != 16 || !esNumero(clabe)) {
                System.out.println("CLABE inválida. Debe tener exactamente 16 dígitos.\n");
            }
        }

        // Validación para el PIN de 4 dígitos (solo números)
        String pin = "";
        while (pin.length() != 4 || !esNumero(pin)) {
            System.out.print("Cree un PIN para su cuenta (4 dígitos): ");
            pin = scanner.nextLine();
            if (pin.length() != 4 || !esNumero(pin)) {
                System.out.println("PIN inválido. Debe tener exactamente 4 dígitos.\n");
            }
        }

        // Creación de la cuenta después de la validación
        Cuenta cuenta = new Cuenta(titular, tipoCuenta, saldo, numeroCuenta, clabe, pin);
        banco.RegistrarCuetna(cuenta);
        System.out.println("\nCuenta creada exitosamente.");
        System.out.println("\n||--------------------------------------------------||\n");
    }

        

    private static boolean esNumero(String Num)
    {
        // Verificar que la entrada no sea vacía y que solo contenga dígitos
        if (Num != null && Num.matches("\\d+"))
        {
            return true;
        }
        else
        {
            System.out.println("Error: Ingrese una opcion valida.");
            return false;
        }
    }

    private static void AccederCuenta(Banco banco)
    {
        System.out.print("Ingresa numero de cuenta: ");
        String Aux1 = scanner.nextLine();

        System.out.print("Ingrese su PIN: ");
        String Aux2 = scanner.nextLine();

        if (esNumero(Aux1) && esNumero(Aux2))  // Validar la entrada
        {
            String numeroCuenta = Aux1;
            String pin = Aux2;

            Cuenta cuenta = banco.BuscarCuenta(numeroCuenta, pin);
        
            if(cuenta != null)
            {
                int opc = 0;
                do
                {
                    Cuenta.Menu();
                    System.out.print("Ingresa la opción deseada: ");
                    String Aux = scanner.nextLine();

                    if (esNumero(Aux))  // Validar la entrada
                    {
                        opc = Integer.parseInt(Aux);

                        switch(opc)
                        {
                            case 1 -> 
                            { 
                                System.out.print("Ingrese el monto a depositar: $"); 
                                String AuxC1 = scanner.nextLine();

                                if (esNumero(AuxC1))  // Validar la entrada
                                {
                                    double monto = Double.parseDouble(AuxC1);
                                    cuenta.Depositar(monto); 
                                }    
                            }

                            case 2 -> 
                            { 
                                System.out.print("Ingrese el monto a retirar: $");
                                String AuxC2 = scanner.nextLine();

                                if (esNumero(AuxC2))  // Validar la entrada
                                {
                                    double monto = Double.parseDouble(AuxC2);
                                    cuenta.Retirar(monto); 
                                }
                            }
                            case 3 -> { System.out.println("Saldo actual: $" + cuenta.getSaldo()); }
                            case 9 -> System.out.println("\nSaliendo...\n");
                            default -> System.out.println("\nError: Ingrese una opcion valida.\n");
                        }
                    }
                } while(opc != 9);
            }
            else
                System.out.println("Número de cuenta o PIN incorrectos");
        }
    }
}
