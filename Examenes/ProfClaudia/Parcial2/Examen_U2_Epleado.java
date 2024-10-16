//* Librerias

import java.util.ArrayList;
import java.util.Scanner;

public class Examen_U2_Epleado 
{
    // * Clases
    static class Empleado
    {
        //* atributos de la clase
        private String Nombre;
        private double SalarioOg;

        //* constructor
        public Empleado(String Nombre, double SalarioOg)
        {
            this.Nombre = Nombre;
            this.SalarioOg = SalarioOg;
        }

        //* Getters y setters
        public String getNombre() { return Nombre; }
        public void setNombre(String Nombre) { this.Nombre = Nombre; }

        public double getSalario() { return SalarioOg; }
        public void setSalario(int SalarioOg) { this.SalarioOg = SalarioOg; }

        //* metodos
        public static void AumentarSalario(String Nombre, double SalarioOg, double Aumento)
        {
            double SalarioNuevo = 0;
            // * Primero multiplico el aumento por 0.01, despues ese aumento lo multiplico por el salario original para poder obtener cuanto se le aumentara
            // * despues le sumo ese dsalario al salario original
            SalarioNuevo = ((SalarioOg * (Aumento * 0.01)) + SalarioOg);

            System.out.println("El nuevo salario de: " + Nombre + " aplicando un aumento del " +  Aumento + "% es: " + SalarioNuevo);
        }
    }

    //*  Main
    public static void main(String[] args) 
    {
        //* Variables
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<>();
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
                    System.out.print("Introduce el nombre del empleado: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Introduce el Salario: ");
                    double salario = Double.parseDouble(scanner.nextLine());

                    Empleado empleado = new Empleado(nombre, salario);
                    empleados.add(empleado);
                }

                case 2 -> 
                {
                    System.out.println("Dame el aumentos para aplicar a los empleados: ");
                    double aumento = Double.parseDouble(scanner.nextLine());
                    System.out.println("\nLista de salarios originales de empleados: ");

                    for(Empleado empleado : empleados)
                        Empleado.AumentarSalario(empleado.getNombre(), empleado.getSalario(), aumento);
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
        System.out.println("||-----------------------Menu-----------------------||");
        System.out.println("||                                                  ||");
        System.out.println("|| [1] -> Introducir salario base de empleado       ||");
        System.out.println("|| [2] -> Modificar salario de empleados             ||");
        System.out.println("|| [9] -> Salir                                     ||");
        System.out.println("||                                                  ||");
        System.out.println("||--------------------------------------------------||");
    }

    

}
