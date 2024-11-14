import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        //? Variables
        Scanner scanner = new Scanner(System.in);
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("Juan Base", 100000));
        empleados.add(new TiempoCompleto("Juan Premium", 200000));
        empleados.add(new MedioTiempo("Juan Medio", 150000));
        int opc = 0;
        
        do //? Inicio de switch
        {
            Menu();
            System.out.print("Ingresa la opcion deseada: ");
            opc = Integer.parseInt(scanner.nextLine());

            switch(opc)
            {
                case 1 -> // Operaciones para empleados generales
                { 
                    int opc2 = 0;
                    do //? Inicio de switch para empleados generales
                    {
                        Menu_Empleado();
                        System.out.print("Ingresa la opcion deseada: ");
                        opc2 = Integer.parseInt(scanner.nextLine());
                        
                        for (Empleado empleado : empleados)
                        {
                            // Solo realiza operaciones en empleados generales (no de tiempo completo o medio tiempo)
                            if (!(empleado instanceof TiempoCompleto) && !(empleado instanceof MedioTiempo))
                            {
                                switch(opc2)
                                {
                                    case 1 -> empleado.MostrarDetalles();
                                    case 2 -> System.out.println("El bono de " + empleado.getNombre() + " es de: " + empleado.CalcularBono());
                                    case 3 -> System.out.println("El bono de " + empleado.getNombre() + " es de: " + empleado.CalcularBono(0.08));
                                    case 4 -> System.out.println("El bono de " + empleado.getNombre() + " es de: " + empleado.CalcularBono(0.08, 1.5));
                                    case 9 -> System.out.println("Saliendo...");
                                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                                }
                            }
                        }
                    } while(opc2 != 9); //? Fin de switch para empleados generales
                }

                case 2 -> // Operaciones para empleados de tiempo completo
                { 
                    int opc3 = 0;
                    do //? Inicio de switch para empleados de tiempo completo
                    {
                        Menu_TiempoCompleto_MedioTiempo();
                        System.out.print("Ingresa la opcion deseada: ");
                        opc3 = Integer.parseInt(scanner.nextLine());
                        
                        for (Empleado empleado : empleados)
                        {
                            // Solo realiza operaciones en empleados de tiempo completo
                            if (empleado instanceof TiempoCompleto)
                            {
                                switch(opc3)
                                {
                                    case 1 -> empleado.MostrarDetalles();
                                    case 2 -> System.out.println("El bono de " + empleado.getNombre() + " es de: " + empleado.CalcularBono());
                                    case 3 -> System.out.println("El bono de " + empleado.getNombre() + " es de: " + empleado.CalcularBono(1.5));
                                    case 9 -> System.out.println("Saliendo...");
                                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                                }
                            }
                        }
                    } while(opc3 != 9); //? Fin de switch para empleados de tiempo completo
                }

                case 3 -> // Operaciones para empleados de medio tiempo
                { 
                    int opc4 = 0;
                    do //? Inicio de switch para empleados de medio tiempo
                    {
                        Menu_TiempoCompleto_MedioTiempo();
                        System.out.print("Ingresa la opcion deseada: ");
                        opc4 = Integer.parseInt(scanner.nextLine());
                        
                        for (Empleado empleado : empleados)
                        {
                            // Solo realiza operaciones en empleados de medio tiempo
                            if (empleado instanceof MedioTiempo)
                            {
                                switch(opc4)
                                {
                                    case 1 -> empleado.MostrarDetalles();
                                    case 2 -> System.out.println("El bono de " + empleado.getNombre() + " es de: " + empleado.CalcularBono());
                                    case 3 -> System.out.println("El bono de " + empleado.getNombre() + " es de: " + empleado.CalcularBono(1.5));
                                    case 9 -> System.out.println("Saliendo...");
                                    default -> System.out.println("Opción no válida. Intente nuevamente.");
                                }
                            }
                        }
                    } while(opc4 != 9); //? Fin de switch para empleados de medio tiempo
                }

                case 9 -> System.out.println("Saliendo...");

                default -> System.out.println("Opcion no valida. Intente nuevamente.");
            }
            
        } while(opc != 9); //? Fin de switch principal
    }

    //? Metodos

    public static void Menu()
    {
        System.out.println("\n||---------------Menu---------------||");
        System.out.println("||                                  ||");
        System.out.println("|| 1 -> Empleado                    ||");
        System.out.println("|| 2 -> Empleado Tiempo Completo    ||");
        System.out.println("|| 3 -> Empleado Medio Tiempo       ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||                                  ||");
        System.out.println("||----------------------------------||\n");
    }

    public static void Menu_Empleado()
    {
        System.out.println("\n||----------------------Menu------------------------||");
        System.out.println("||                                                  ||");
        System.out.println("|| 1 -> Mostrar Detalles                            ||");
        System.out.println("|| 2 -> Calcular Bono                               ||");
        System.out.println("|| 3 -> Calcular bono con Porcentaje                ||");
        System.out.println("|| 4 -> Calcular bono con Porcentaje y rendimiento  ||");
        System.out.println("|| 9 -> Salir                                       ||");
        System.out.println("||                                                  ||");
        System.out.println("||--------------------------------------------------||\n");
    }

    public static void Menu_TiempoCompleto_MedioTiempo()
    {
        System.out.println("\n||---------------Menu-----------------||");
        System.out.println("||                                    ||");
        System.out.println("|| 1 -> Mostrar Detalles              ||");
        System.out.println("|| 2 -> Calcular Bono                 ||");
        System.out.println("|| 3 -> Calcular bono con rendimiento ||");
        System.out.println("|| 9 -> Salir                         ||");
        System.out.println("||                                    ||");
        System.out.println("||------------------------------------||\n");
    }

}
