//? Librerias
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        //? Variables
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        ArrayList<Alumno> alumnos = new ArrayList<>();

        //? Creacion objetos
        alumnos.add(new Alumno("Isai", 2201501, new double[]{}));
        alumnos.add(new Alumno("Gareth", 2201602, new double[]{}));
        alumnos.add(new Alumno("Sofia", 2201703, new double[]{}));

        //? Codigo principal
        do
        {
            Menu();
            System.out.print("Ingrese una opción: ");
            opc = scanner.nextInt();
            System.out.println();

            switch (opc)
            {
                case 1 -> asignarCalificaciones(alumnos);
                case 2 -> mostrarPromedios(alumnos);
                case 9 -> System.out.println("Saliendo del programa...");
                default -> System.out.println("Opción no válida");
            }
        } while (opc != 9);
    }
    //? Metodos

    public static void Menu()
    {
        System.out.println("\n||---------------Menú---------------||");
        System.out.println("|| 1 -> Asignar calificaciones      ||");
        System.out.println("|| 2 -> Ver promedios               ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||----------------------------------||\n");
    }

    public static void asignarCalificaciones(ArrayList<Alumno> alumnos)
    {
        try 
        {
            List<Double> calificaciones = leerCalificacionesDesdeArchivo("proyecto.csv");
            for (Alumno alumno : alumnos)
            {
                if (calificaciones.size() < 7) 
                {
                    System.out.println("No hay suficientes calificaciones para " + alumno.getNombre());
                    break;
                }

                //* Asignar las primeras 7 calificaciones sin eliminarlas del archivo
                double[] calificacionesAlumno = new double[7];
                for (int i = 0; i < 7; i++) 
                    calificacionesAlumno[i] = calificaciones.get(i);

                alumno.setCalificaciones(calificacionesAlumno);
                alumno.calcularPromedio();
                System.out.println("Calificaciones asignadas correctamente a " + alumno.getNombre() + "!");
            }

            //* Guardar todos los alumnos después de asignar calificaciones
            guardarAlumnosEnArchivo(alumnos);
        } 
        catch (IOException e) {System.out.println("Error: " + e.getMessage());}
    }

    public static List<Double> leerCalificacionesDesdeArchivo(String nombreArchivo) throws IOException
    {
        List<Double> calificaciones = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(nombreArchivo)))
        {
            String linea;
            while ((linea = lector.readLine()) != null) 
            {
                String[] datos = linea.split(",");
                for (String dato : datos) 
                {
                    try {calificaciones.add(Double.parseDouble(dato.trim()));} 
                    catch (NumberFormatException e) {System.out.println("Dato inválido ignorado: " + dato);}
                }
            }
        }
        return calificaciones;
    }

    public static void guardarAlumnosEnArchivo(ArrayList<Alumno> alumnos)
    {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter("Alumnos.txt", false))) //* Sobrescribe el archivo
        {
            for (Alumno alumno : alumnos)
            {
                escritor.write("Nombre: " + alumno.getNombre());
                escritor.newLine();
                escritor.write("Matricula: " + alumno.getMatricula());
                escritor.newLine();
                escritor.write("Calificaciones: ");
                for (double calificacion : alumno.getCalificaciones())
                    escritor.write(calificacion + " ");
                escritor.newLine();
                escritor.write("Promedio: " + alumno.getPromedio());
                escritor.newLine();
            }
            System.out.println("El archivo se escribió correctamente!");
        } 
        catch (IOException e) {System.out.println("Error al escribir en el archivo: " + e.getMessage());}
    }

    public static void mostrarPromedios(ArrayList<Alumno> alumnos)
    {
        for (Alumno alumno : alumnos)
        {
            System.out.println("Nombre: " + alumno.getNombre());
            System.out.println("Matricula: " + alumno.getMatricula());
            System.out.println("Promedio: " + alumno.getPromedio());
            System.out.println();
        }
    }
}