//Librerias
import java.util.Scanner;

class Libro
    {
        private String Titulo;
        private String Autor;
        private String FechaPublicacion;
        private int Paginas ;
        private String Editorial;

        //Constructor
        public Libro(String Titulo, String Autor, String FechaPublicacion, int Paginas, String Editorial)
        {
            this.Titulo = Titulo;
            this.Autor = Autor;
            this.FechaPublicacion = FechaPublicacion;
            this.Paginas = Paginas;
            this.Editorial = Editorial;
        }

        public void mostrarLibro(String Titulo, String Autor, String FechaPublicacion, int Paginas, String Editorial)
        {
            System.out.println("Titulo: " + Titulo +
                                "\nAutor: "  + Autor +
                                "\nFecha de publicacion: " + FechaPublicacion +
                                "\nPaginas: " + Paginas +
                                "\nEditorial: " + Editorial);
        }
    }

public class EJ6 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int opc = 0;
        String Titulo = "";
        String Autor = "";
        String FechaPublicacion = "";
        int Paginas  = 0;
        String Editorial = "";


        do
        {
            menu();
            System.out.print("Ingrese la opcion deseada: ");
            opc = scanner.nextInt();
            System.out.println();
            scanner.nextLine(); 
            
            switch (opc)
            {
                case 1 -> 
                {
                    System.out.print("Dame el  Titulo: ");
                    Titulo = scanner.nextLine();

                    System.out.print("Dame el  Autor: ");
                    Autor = scanner.nextLine();

                    System.out.print("Dame el  Fecha de Publicacion: ");
                    FechaPublicacion = scanner.nextLine();

                    System.out.print("Dame el  Paginas: ");
                    Paginas = (scanner.nextInt());
                    scanner.nextLine(); 

                    System.out.print("Dame el  Editorial: ");
                    Editorial= scanner.nextLine();

                    Libro libro1 = new Libro(Titulo, Autor, FechaPublicacion, Paginas, Editorial);
                    libro1.mostrarLibro(Titulo, Autor, FechaPublicacion, Paginas, Editorial);
                }

                case 2 -> 
                {
                    Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", "1605", 1216, "Edibo");
                    libro1.mostrarLibro("El Quijote", "Miguel de Cervantes", "1605", 1216, "Edibo");
                }

                case 9 -> System.out.println("Gracias por usar este programa! \n");
            }

        }while(opc != 9);

    }

    public static void menu() 
    {
        System.out.println("\n||----------------Menu para usuario--------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 1 -> Crear libro                                    ||"); 
        System.out.println("||                                                     ||");                                            
        System.out.println("||------------------Menu para objeto-------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 2 -> arrojar libro predeterminado                   ||");
        System.out.println("||                                                     ||");
        System.out.println("||-------------------Otras opciones--------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 9 -> Salir                                          ||");
        System.out.println("||                                                     ||"); 
        System.out.println("||-----------------------------------------------------||\n");
    }

    
}
