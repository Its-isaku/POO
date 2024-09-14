//Librerias
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;

// Clase principal
public class EJ3 
{
    public static void main(String[] args) 
    {
        // se crea un scanner para obtener respuestas del usuario
        Scanner scanner = new Scanner(System.in);
        // Se crean variables
        HashMap<String, List<Float>> calificaciones = new HashMap<>();
        String Clave = " ";
        int opc = 0;
        String aux = "";

        do
        {
            Menu();
            System.out.print("Seleccione una opcion: ");
            aux = scanner.next();
            if(!SoloNumInt(aux)) System.out.println("Debes Introducir un numero entre 1 y 5");
            else
            {
                opc = Integer.parseInt(aux);
                aux = "";
                switch(opc)
                {
                    case 1 -> 
                    {
                        // pido nombre y calificacion del alumno
                        System.out.println("Dame el nombre del alumno: ");
                        Clave = scanner.next().toUpperCase();
                        // creare una ArrayList para guardar las 5 calificaciones
                        calificaciones.put(Clave, new ArrayList<>());
                        // pido y agrego las 5 calificaciones al ArrayList
                        for (int i = 0; i < 5; i++)
                        {
                            System.out.print("Calificacion " + (i + 1) + ": ");
                            // se guarda la calificacion en un String para comprobar que sea un numero
                            aux = scanner.next();
                            if(!SoloNumFloat(aux)) {System.out.println("Debes Introducir un numero"); i--;}
                            else calificaciones.get(Clave).add(Float.valueOf(aux));
                        }
                        System.out.println("\nCalificaciones agregadas correctamente!");
                    }

                    case 2 -> 
                    {
                        // mostrare lista de alumnos y sus calificaciones
                        System.out.println("\nLista de alumnos y calificaciones:\n");
                        // bucle para mostrar nombre del alumno
                        for(Entry<String, List<Float>> entry : calificaciones.entrySet())
                        {
                            System.out.print(entry.getKey() + ": ");
                            // bucle para mostrar las calificaciones
                            for(Float valor : entry.getValue()) System.out.print(valor + ", ");
                            System.out.println("\nSu promedio es: " + Promedio(entry.getValue()) );
                            System.out.println("\n");
                        }
                    }

                    case 3 -> 
                    {
                        // mostrar lista de alumnos y sus calificaciones
                        System.out.println("\nLista de alumnos y calificaciones:\n");
                        for (Entry<String, List<Float>> entry : calificaciones.entrySet()) 
                        {
                            System.out.print(entry.getKey() + ": ");
                            for (Float valor : entry.getValue()) System.out.print(valor + ", ");
                            System.out.println("\nSu calificacion mas baja es: " + MasBajo(entry.getValue()));
                            System.out.println("\n");
                        }
                    }


                    case 4 -> 
                    {
                        // mostrar lista de alumnos y sus calificaciones
                        System.out.println("\nLista de alumnos y calificaciones:\n");
                        for (Entry<String, List<Float>> entry : calificaciones.entrySet()) 
                        {
                            System.out.print(entry.getKey() + ": ");
                            for (Float valor : entry.getValue()) System.out.print(valor + ", ");
                            System.out.println("\nSu calificacion mas alta es: " + MasAlto(entry.getValue()));
                            System.out.println("\n");
                        }
                    }

                    case 5 -> System.out.println("Saliendo....\n");

                    default -> System.out.println("Debe elejir una de las opciones!");
                }
            }
        }while(opc != 5);



        // se Cierra el Scanner
        scanner.close();
    }
    //Metodos
    public static void Menu()
    {
        System.out.println("\n||-------------------------Menu para captura de calificaciones-------------------------||");
        System.out.println("||                                                                                     ||");
        System.out.println("||  1 -> Capturar nombre y calificaciones                                              ||");
        System.out.println("||  2 -> Imprimir calificaciones y promedio                                            ||");
        System.out.println("||  3 -> Imprimir calificaciones y calificacion mas baja                               ||");
        System.out.println("||  4 -> Imprimir calificaciones y calificacion mas alta                               ||");
        System.out.println("||  5 -> salir                                                                         ||");
        System.out.println("||                                                                                     ||");
        System.out.println("||-------------------------------------------------------------------------------------||\n");
    }

    public static Float MasBajo(List<Float> calificaciones) 
    {
        Float menor = calificaciones.get(0);
        // Encuentra la calificación más baja
        for (Float valor : calificaciones) if (valor < menor) menor = valor;
        return menor;
    }


    public static Float MasAlto(List<Float> calificaciones) 
    {
        Float mayor = calificaciones.get(0);
        // Encuentra la calificación más alta
        for (Float valor : calificaciones) if (valor > mayor) mayor = valor;
        return mayor;
    }


    public static Float Promedio(List<Float> calificaciones) 
    {
        Float suma = 0f;
        // Suma todas las calificaciones en la lista
        for (Float calificacion : calificaciones) suma += calificacion;
        // Devuelve la suma dividida entre el número de calificaciones
        return suma / calificaciones.size();
    }

    public static boolean SoloNumInt(String aux)
    {
        // verifica que sea solo numeros
        try {Integer.valueOf(aux); return true;}
        catch(NumberFormatException e) { return false;}
    }

    public static boolean SoloNumFloat(String aux)
    {
        // verifica que sea solo numeros
        try {Float.valueOf(aux); return true;}
        catch(NumberFormatException e) { return false;}
    }

}
