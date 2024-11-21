//? Librerias
import java.util.Scanner;

public class Main 
{
    
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Avion avion = new Avion();
        Pajaro pajaro = new Pajaro();
        int opc = 0;

        do //? Inicio de switch para empleados de medio tiempo
        {
            Menu();
            System.out.print("Ingresa la opcion deseada: ");
            opc = Integer.parseInt(scanner.nextLine());

            switch(opc)
            {
                case 1 -> avion.despegar();
                case 2 -> avion.aterrizar();
                case 3 -> pajaro.despegar();
                case 4 -> pajaro.aterrizar();
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        
                    
        } while(opc != 9); //? Fin de switch para empleados de medio tiempo
    }
    
    public static void Menu()
    {
        System.out.println("\n||---------------Menu---------------||");
        System.out.println("||                                  ||");
        System.out.println("|| 1 -> Despegar Avion              ||");
        System.out.println("|| 2 -> Aterrizar Avion             ||");
        System.out.println("|| 3 -> Despegar Pajaro             ||");
        System.out.println("|| 4 -> Aterrizar Pajaro            ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||                                  ||");
        System.out.println("||----------------------------------||\n");
    }

}
