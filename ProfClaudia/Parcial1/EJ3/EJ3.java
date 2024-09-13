//Librerias
import  java.util.ArrayList;
import java.util.Scanner;

public class EJ3 
{
    public static void main(String[] args) 
    {
        // se crea un scanner para obtener respuestas del usario
        Scanner scanner = new Scanner(System.in);
        // se crea un arreglo dinamico de tipo entero
        ArrayList<Integer> num = new ArrayList<>();
        // creo variable auxiliar
        int num_aux;

        do
        {
        // se pide al usuario que ingrese numeros enteros
        System.out.println("Ingrese un numero entero (-1 para terminar): ");
        num_aux = scanner.nextInt();
        if(num_aux != -1) num.add(num_aux);
        }while(num_aux != -1);

        // se muestra el numero de elementos en el arreglo
        int cantidad = num.size();
        System.out.println("\nCantidad de elemetnos: " + cantidad);

        // se muestra la suma de los elementos en el arreglo
        System.out.println("\nLa suma de los elementos es: " + Suma(num));

        // se muestra el promedio de los elementos en el arreglo
        System.out.println("\nEl promedio de los elementos: " + Promedio(num));

        // se muestra el numero mas grande del arreglo
        System.out.println("\nEl numero mayor es: " + NumMayor(num));

        // se muestra el numero mas pequeño del arreglo
        System.out.println("\nEl numero menor es: " + NumMenor(num));

    }
    // Metodos

    public static Integer NumMayor(ArrayList<Integer> num)
    {
        int mayor = num.get(0);
        for (Integer i : num) 
        {
            if(i > mayor) mayor = i;
        }
        return mayor;
    }

    public static Integer NumMenor(ArrayList<Integer> num)
    {
        int menor = num.get(0);
        for (Integer i : num) 
        {
            if(i < menor) menor = i;
        }
        return menor;
    }

    public static Integer Suma(ArrayList<Integer> num)
    {
        int suma = 0;
        for (Integer i : num) 
        {
            suma += i;
        }
        
        return suma;
    }

    public static Integer Promedio(ArrayList<Integer> num)
    {
        int promedio = (Suma(num)) / num.size();
        
        return promedio;
    }
}
