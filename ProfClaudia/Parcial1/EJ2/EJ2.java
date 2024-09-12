//Librerias
import java.util.Scanner;

// Clase principal
public class EJ2 
{
    //Metodos
    public static String CapturaTexto()
    {
        
        System.out.println("Ingresa tu texto: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.next();
    }

    public static void MostrarTexto(String texto)
    {
        System.out.println("El texto ingresado fue: " + texto);
    }



    public static int CapturaEntero()
    {
        
        System.out.println("Ingresa tu Numero entero: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    public static void MostrarEntero(int entero)
    {
        System.out.println("El entero ingresado fue: " + entero);
    }



    public static double CapturaDecimal()
    {
        
        System.out.println("Ingresa tu Numero entero: ");
        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();
    }

    public static void MostrarDecimal(double decimal)
    {

        System.out.println("El decimal ingresado fue: " + decimal);
    }



    //main
    public static void main(String[] args) 
    {
        String texto = CapturaTexto();
        int entero = CapturaEntero();
        double decimal = CapturaDecimal();

        MostrarTexto(texto);
        MostrarEntero(entero);
        MostrarDecimal(decimal);
    }
}
