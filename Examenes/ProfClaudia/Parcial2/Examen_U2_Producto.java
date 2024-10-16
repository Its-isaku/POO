//* Librerias
import java.util.ArrayList;
import java.util.Scanner;

public class Examen_U2_Producto 
{
    //* Clases
    static class Producto
    {
        //* atributos de la clase
        private String Nombre;
        private double Precio;

        //* constructor
        public Producto(String Nombre, double Precio)
        {
            this.Nombre = Nombre;
            this.Precio = Precio;
        }

        //* Getters y setters
        public String getNombre() { return Nombre; }
        public void setNombre(String Nombre) { this.Nombre = Nombre; }

        public double getPrecio() { return Precio; }
        public void setPrecio(int Precio) { this.Precio = Precio; }

        //* metodos
        public static void CalcularDescuento(String Nombre, double Precio, double Descuento)
        {
            double PrecioDescuento = 0;
            // * Primero multiplico el descuento por 0.01, desoues ese descuento por el precio original para poder obtener el descuento
            // * despues le resto ese descuento al precio original
            PrecioDescuento = ((Precio * (Descuento * 0.01)) - Precio);

            System.out.println("El precio final del producto: " + Nombre + " aplicando un descuento del " +  Descuento + "% es: " + ((PrecioDescuento) *-1 ));
        }
    }

    //*  Main
    public static void main(String[] args) 
    {
        //* Variables
        Scanner scanner = new Scanner(System.in);
        ArrayList<Producto> personas = new ArrayList<>();
        int opc = 0;

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
                    System.out.print("Introduce el nombre del producto: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Introduce el precio: ");
                    double precio = Double.parseDouble(scanner.nextLine());

                    Producto producto = new Producto(nombre, precio);
                    personas.add(producto);
                }

                case 2 -> 
                {
                    System.out.println("Dame el descuento para aplicar a productos: ");
                    double descuento =Double.parseDouble(scanner.nextLine());

                    for(Producto producto : personas)
                        Producto.CalcularDescuento(producto.getNombre(), producto.getPrecio(), descuento);
                }

                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida. Intente nuevamente.");
            }
            System.out.println();

        }while(opc != 9);
        
        
    }
    //* Metodos

    //* Menu
    public static void Menu()
    {
        System.out.println("||--------------------Menu--------------------||");
        System.out.println("||                                            ||");
        System.out.println("|| [1] -> Introducir Producto a carrito       ||");
        System.out.println("|| [2] -> Calcular precio con descuento       ||");
        System.out.println("|| [9] -> Salir                               ||");
        System.out.println("||                                            ||");
        System.out.println("||--------------------------------------------||");

    }

}
