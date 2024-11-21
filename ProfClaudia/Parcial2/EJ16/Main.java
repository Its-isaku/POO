import java.util.Scanner;

public class Main 
{
    
    public static void main(String[] args) 
    {
        Bicicleta bicicleta = new Bicicleta();
        Carro carro = new Carro();
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        do //? Inicio de switch para empleados de medio tiempo
        {
            Menu();
            System.out.print("Ingresa la opcion deseada: ");
            opc = Integer.parseInt(scanner.nextLine());

            switch(opc)
            {
                case 1 -> carro.Acelerar();
                case 2 -> carro.Frenar();
                case 3 -> bicicleta.Acelerar();
                case 4 -> bicicleta.Frenar();
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        
                    
        } while(opc != 9); //? Fin de switch para empleados de medio tiempo
    }
    
    public static void Menu()
    {
        System.out.println("\n||---------------Menu---------------||");
        System.out.println("||                                  ||");
        System.out.println("|| 1 -> Acelerar Carro              ||");
        System.out.println("|| 2 -> Frenar Carro                ||");
        System.out.println("|| 3 -> Acelerar Bicicleta          ||");
        System.out.println("|| 4 -> Frenar Bicicleta            ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||                                  ||");
        System.out.println("||----------------------------------||\n");
    }

}
