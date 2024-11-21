/*
! ||----------------------------Contexto----------------------------||
*¡Te has vuelto muy famoso en los últimos años al crear robots complejos capaces de hacer cosas que pensábamos que solo los
*       humanos podían hacer! Hoy, has decidido hacer el primer Robot Chef completamente funcional que existe llamado Magnum Opus.
* Para eso, el robot deberá tener la capacidad de cortar carne, picar verduras, cocinar un buen guiso con los ingredientes y servirlo en un tazón. 
* Sin embargo, en el proceso de hacer su Magnum Opus, se ha decidido crear también algunos pequeños asistentes robóticos muy capaces de hacer una sola tarea para ayudar a su Robot Chef. 
* Creaste un mini robot con 2 cuchillos para las manos, muy eficiente para preparar la carne y las verduras, pero completamente inútil para cocinarlo o servirlo. 
* Creaste también tres versiones de un mini robot con manos calientes, increíble para cocinar a la temperatura adecuada pero terrible con cuchillos o para servir. 
* La primera versión solo cocina desayunos, la segunda solo cocina comidas y la tercera solo cocina cenas. 
* Después de mucho tiempo, finalmente lo lograste. Creaste el primer robot de cocina y algunos asistentes para ayudarlo. 
*Esta noche es la noche, ¡tienes que ir y mostrarles a los críticos quién manda!. ¡Instruye a tus robots con gracia para cocinar todos los platos que pidan!

! ||--------------------------Instrucciones--------------------------||
* Haz un menú en el que puedas seleccionar entre desayunos, comidas y cenas.
* Posteriormente podrás seleccionar un robot para controlar, después de eso, podrás seleccionar la acción que quieres que realice. Todos ellos prepararán el mismo plato y, como tal, deberás coordinarlos con cuidado.
*   Nota: No se puede cocinar sin los ingredientes preparados, y no se puede servir un plato que no esté cocido.
* Si se sigue el procedimiento correctamente ((1)preparar ingredientes -> (2) cocinar -> (3) servir), se imprimirá un mensaje que dice "¡Hurra! El plato estaba delicioso".
* Considera que el usuario introducira el paso que quiere realizar (1,2 o 3)
* Si se perdió uno de los primeros 2 pasos, o si un robot hizo algo que no es capaz de hacer, se deberá imprimir un mensaje de error personalizado

? En esta práctica se espera el uso de:
*   Interfacesi.
*   Clases abstractasii.
*   Herenciaiii.
 */

//? Librerias
import java.util.Scanner;

public class Main 
{
    //? Metodo principal
    public static void main(String[] args) 
    {
        //? Variables
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        //? Crear objeto de la clase
        RobotChef chef = new RobotChef();
        RobotCuchillos cuchillos = new RobotCuchillos();
        RobotCocina desayuno = new RobotCocina("Desayuno");
        RobotCocina comida = new RobotCocina("Comida");
        RobotCocina cena = new RobotCocina("Cena");
        RobotBase[] robots = {chef, cuchillos, desayuno, comida, cena};

        //? Codigo principal
        do //* Inicio de switch para empleados de medio tiempo
        {
            Menu();
            System.out.print("Ingresa el plato deseado: ");
            opc = Integer.parseInt(scanner.nextLine());

            switch (opc) 
            {
                case 1 -> 
                {
                    System.out.println("Elegiste Desayuno, ¡excelente elección!");
                    SeleccionarRobot(chef, cuchillos, desayuno, null, null);
                }
                case 2 -> 
                {
                    System.out.println("Elegiste Comida, ¡excelente elección!");
                    SeleccionarRobot(chef, cuchillos, null, comida, null);
                }
                case 3 -> 
                {
                    System.out.println("Elegiste Cena, ¡excelente elección!");
                    SeleccionarRobot(chef, cuchillos, null, null, cena);
                }
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        
                    
        } while(opc != 9); //? Fin de switch
    }

    //? Metodos

    //* Metodo Menu
    public static void Menu()
    {
        System.out.println("\n||---------------Menu---------------||");
        System.out.println("||           Bienvenidos!           ||");
        System.out.println("|| 1 -> Desayuno                    ||");
        System.out.println("|| 2 -> Comida                      ||");
        System.out.println("|| 3 -> Cena                        ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||                                  ||");
        System.out.println("||----------------------------------||\n");
    }

    //* Metodo Menu para los menus
    public static void Menu_Robots()
    {
        System.out.println("\n||-------------Acciones-------------||");
        System.out.println("||                                  ||");
        System.out.println("|| 1 -> Chef                        ||");
        System.out.println("|| 2 -> Cuchillos                   ||");
        System.out.println("|| 3 -> cocina                      ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||                                  ||");
        System.out.println("||----------------------------------||\n");
    }

    //* Metodo Menu para las acciones
    public static void Menu_Acciones()
    {
        System.out.println("\n||-------------Acciones-------------||");
        System.out.println("||                                  ||");
        System.out.println("|| 1 -> Preparar                    ||");
        System.out.println("|| 2 -> Cocinar                     ||");
        System.out.println("|| 3 -> Servir                      ||");
        System.out.println("|| 9 -> Salir                       ||");
        System.out.println("||                                  ||");
        System.out.println("||----------------------------------||\n");
    }

    //* Método para gestionar un robot
    public static void GestionarRobot(RobotBase robot) 
    {
        Scanner scanner = new Scanner(System.in);
        robot.Inicializar(); //* Inicializar el robot
        int accion;

        do 
        {
            Menu_Acciones();
            System.out.print("Elige la acción a realizar: ");
            accion = Integer.parseInt(scanner.nextLine());

            switch (accion) 
            {
                case 1 -> robot.Preparar_Ingredientes();
                case 2 -> robot.Cocinar();
                case 3 -> robot.Servir();
                case 9 -> System.out.println("Regresando al menú anterior...");
                default -> System.out.println("Acción no válida.");
            }
        } while (accion != 9);
    }

    //* Método para seleccionar un robot
    public static void SeleccionarRobot(RobotBase chef, RobotBase cuchillos, RobotBase desayuno, RobotBase comida, RobotBase cena) 
    {
        Scanner scanner = new Scanner(System.in);
        int opc2;

        do 
        {
            Menu_Robots();
            System.out.print("Ingresa el robot deseado: ");
            opc2 = Integer.parseInt(scanner.nextLine());

            switch (opc2) 
            {
                case 1 -> GestionarRobot(chef);
                case 2 -> GestionarRobot(cuchillos);
                case 3 -> 
                {
                    if (desayuno != null) GestionarRobot(desayuno);
                    if (comida != null) GestionarRobot(comida);
                    if (cena != null) GestionarRobot(cena);
                }
                case 9 -> System.out.println("Regresando al menú principal...");
                default -> System.out.println("Opción no válida.");
            }
        } while (opc2 != 9);
    }
}
