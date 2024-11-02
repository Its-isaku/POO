
import java.util.ArrayList;
import java.util.Scanner;

//? Librerias
public class Main 
{
    public static void main(String[] args) 
    {
        //? variables
        Scanner scanner = new Scanner(System.in);
        ArrayList<AngyBirds> Birds = new ArrayList<>();
        Birds.add(new Red("Red", 3, "Furia", "Rojo", "Cardenal"));
        Birds.add(new Chuck("Chuck", 5, "Velocidad", "Amarillo", "Canario"));
        Birds.add(new Bomb("Bomb", 2, "Explocion", "Negro", "Cuervo"));

        int opc = 0;

        do
        {
            Menu();
            System.out.print("Ingresa la opcion deseada: ");
            opc = Integer.parseInt(scanner.nextLine());

            switch(opc)
            {
                case 1 ->
                { 
                    Birds.get(0).Lanzar();
                    ((Red) Birds.get(0)).AtaqueEspecial(); // se hace un casting para cambiar de variable y usar el objeto Red
                }

                case 2 ->
                { 
                    Birds.get(1).Lanzar();
                    ((Chuck) Birds.get(1)).AtaqueEspecial(); // se hace un casting para cambiar de variable y usar el objeto Chuck
                }

                case 3 ->
                { 
                    Birds.get(2).Lanzar();
                    ((Bomb) Birds.get(2)).AtaqueEspecial(); // se hace un casting para cambiar de variable y usar el objeto Bomb
                }

                case 9 -> System.out.println("Saliendo...");

                default -> System.out.println("Opcion no valida. Intente nuevamente.");
            }
            
        }while(opc != 9);
    }
    
    //? Metodos

    //* Metodo para mostrar un menu
    public static void Menu()
    {
        System.out.println("\n||---------------Menu---------------||");
        System.out.println("||                                  ||");
        System.out.println("|| 1 -> Lanzar Red                  ||");
        System.out.println("|| 2 -> Lanzar Chuck                ||");
        System.out.println("|| 3 -> Lanzar Bomb                 ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||                                  ||");
        System.out.println("||----------------------------------||\n");
    }
}