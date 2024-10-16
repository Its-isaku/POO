//? Librerias
import java.util.ArrayList;
import java.util.Scanner;

public class Prac1 
{
    //? clases
    static class Libro
    {
        //* Atributos de la clase
        private String Titulo;
        private String Autor;
        private String FechaPublicacion;
        private int Paginas;
        private String Editorial;

        //* constructor
        public Libro(String Titulo, String Autor, String FechaPublicacion, int Paginas, String Editorial)
        {
            this.Titulo = Titulo;
            this.Autor = Autor;
            this.FechaPublicacion = FechaPublicacion;
            this.Paginas = Paginas;
            this.Editorial = Editorial;
        }

        //* Getters and setters
        public String getTitulo() { return Titulo; }
        public void setTitulo(String titulo) { Titulo = titulo; }

        public String getAutor() { return Autor; }
        public void setAutor(String autor) { Autor = autor; }

        public String getFechaPublicacion() { return FechaPublicacion; }
        public void setFechaPublicacion(String fechaPublicacion) { FechaPublicacion = fechaPublicacion; }

        public int getPaginas() { return Paginas; }
        public void setPaginas(int paginas) { Paginas = paginas; }

        public String getEditorial() { return Editorial; }
        public void setEditorial(String editorial) { Editorial = editorial; }

        //* Metodo para mostrar la informacion del libro
        public void MostrarLibro()
        {
            System.out.println(
                "Título: " + Titulo + "\n" +
                "Autor: " + Autor + "\n" +
                "Fecha de Publicación: " + FechaPublicacion + "\n" +
                "Número de Páginas: " + Paginas + "\n" +
                "Editorial: " + Editorial);
        }
    }

    //? Main
    public static void main(String[] args) 
    {
        //variables
        Scanner scanner = new Scanner(System.in);
        ArrayList<Libro> libros = new ArrayList<>();
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
                    // Pido los datosdel libro al usuario
                    System.out.print("Dame el Titulo: ");
                    String Titulo = scanner.nextLine();

                    System.out.print("Dame el Autor: ");
                    String Autor = scanner.nextLine();

                    System.out.print("Dame la Fecha de Publicacion: ");
                    String FechaPublicacion = scanner.nextLine();

                    System.out.print("Dame el numero de Paginas: ");
                    int Paginas = Integer.parseInt(scanner.nextLine());

                    System.out.print("Dame la Editrorial: ");
                    String Editorial = scanner.nextLine();

                    // creo un ibro nuevo y lo agrego a mi Arreylisy
                    Libro libro = new Libro(Titulo, Autor, FechaPublicacion, Paginas, Editorial);
                    libros.add(libro);

                }

                case 2 ->
                {
                    // Usp siclo for each para iterar sobre lires e imprimirlos
                    for(Libro libro : libros)
                    {
                        libro.MostrarLibro();
                        System.out.println("\n||----------------------------------||\n");
                    }
                }

                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion no valida. Intente nuevamente.");
            }
            
        }while(opc != 9);


    }
    //? Metodos

    //Metodo para mostrar un menu
    public static void Menu()
    {
        System.out.println("\n||---------------Menu---------------||");
        System.out.println("||                                  ||");
        System.out.println("|| 1 -> Crear libro                 ||");
        System.out.println("|| 2 -> Mostrar libros              ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||                                  ||");
        System.out.println("||----------------------------------||\n");
    }

}
