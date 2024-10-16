//* Mando a llamar los paquetes de las clases 

//* Librerias
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        //* Variables
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        int opc2 = 0;

        do
        {
            Menu();
            System.out.print("Ingresa la opcion deseada: ");
            opc = Integer.parseInt(scanner.nextLine());
            System.out.println();

            switch(opc)
            {
                case 1 -> 
                {
                    
                }

                case 2 -> 
                {
                
                }

                case 3 -> 
                {
                
                }

                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida. Intente nuevamente.");
            }
            System.out.println();

        }while(opc != 9);
    }
    //* Metodo

    //* Menu
    public static void Menu()
    {
        System.out.println("||--------------------Menu--------------------||");
        System.out.println("||                                            ||");
        System.out.println("|| [1] -> clase de Pesonas                    ||");
        System.out.println("|| [2] -> clase de Producto                   ||");
        System.out.println("|| [3] -> clase de Empleado                   ||");
        System.out.println("|| [9] -> Salir                               ||");
        System.out.println("||                                            ||");
        System.out.println("||--------------------------------------------||");
    }
}
