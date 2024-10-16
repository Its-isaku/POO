//* Librerias
import java.util.ArrayList;
import java.util.Scanner;

public class Examen_U2_Persona 
{
    //* Clases
    
    static class Persona
    {
        //* atributos de la clase
        private String Nombre;
        private int Edad;
        private String Genero;

        //* constructor
        public Persona(String Nombre, int Edad, String Genero)
        {
            this.Nombre = Nombre;
            this.Edad = Edad;
            this.Genero = Genero;
        }

        //* Getters y setters
        public String getNombre() { return Nombre; }
        public void setNombre(String Nombre) { this.Nombre = Nombre; }

        public int getEdad() { return Edad; }
        public void setEdad(int Edad) { this.Edad = Edad; }

        public String getGenero() { return Genero; }
        public void setGenero(String Genero) { this.Genero = Genero; }

        //* metodos
        public static void MostrarInformacion(String Nombre, int Edad, String Genero)
        {
            System.out.println(
                "Nombre: " + Nombre + ", " +
                "Edad: " + Edad + ", " +
                "Genero: " + Genero);
        }

    }


    //*  Main
    public static void main(String[] args) 
    {
        //* Variables
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        int opc = 0;

        do
        {
            //* Mando a llamar al menu 
            Menu();
            //* pregunto por la opcion deseada
            System.out.print("Ingresa la opcion deseada: ");
            opc = Integer.parseInt(scanner.nextLine());
            System.out.println(); // * arrojo un print para generar un espacio

            switch(opc)
            {
                case 1 ->  //* si la opcion es 1 , pido los datos necesarios para poder crear un objeto de mi clase
                {
                    System.out.print("Introduce el nombre: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Introduce la edad: ");
                    int edad = Integer.parseInt(scanner.nextLine());

                    System.out.print("Introduce el genero(H/M): ");
                    String genero = scanner.nextLine().toUpperCase();

                    //* Genero un objeto con los datos 
                    Persona persona = new Persona(nombre, edad, genero);
                    //* agrego el objeto a mi lista
                    personas.add(persona);
                }
                
                case 2 -> 
                {
                    System.out.println("lista de pesonas:");
                    for(Persona persona : personas)
                        Persona.MostrarInformacion(persona.getNombre(), persona.getEdad(), persona.getGenero());
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
        System.out.println("|| [1] -> Introducior nueva persona           ||");
        System.out.println("|| [2] -> Mostrar personas                    ||");
        System.out.println("|| [9] -> Salir                               ||");
        System.out.println("||                                            ||");
        System.out.println("||--------------------------------------------||");

    }

}
