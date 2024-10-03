//Librerias
import java.util.ArrayList;
import java.util.Scanner;

public class EJ8
{
    //Clases

    static class Trelo 
    {
        private String Tarea;
        private String Status;

        // Constructor
        public Trelo(String Tarea, String Status) 
        {
            this.Tarea = Tarea;
            this.Status = Status;
        }

        //Getters y setters para mostrar listas
        public String getStatus()
        {
            return Status;
        }

        public void setStatus(String Status)
        {
            this.Status = Status;
        }

        public String getTarea()
        {
            return Tarea;
        }
    }

    // Main
    public static void main(String[] args) 
    {
        //Variables
        Scanner scanner = new Scanner(System.in);
        ArrayList<Trelo> trelo = new ArrayList<>();
        String status[] = new String[3];
        status[0] = "Pendiente";
        status[1] = "En Proceso";
        status[2] = "Terminado";
        String TareaNueva = "";
        int opc = 0;

        do
        {
            menu();
            System.out.print("Ingrese su opcion: ");
            opc = Integer.parseInt(scanner.nextLine());

            switch (opc)
            {
                case 1 -> 
                {
                    System.out.print("Dame la tarea nueva: ");
                    TareaNueva = scanner.nextLine();
                    Trelo obj = new Trelo(TareaNueva, status[0]);
                    trelo.add(obj);
                    System.out.println("\nTarea agregada con exito!\n");
                }

                case 2 -> 
                {
                    if(!trelo.isEmpty())
                    {
                        mostrarTareas(trelo);
                        System.out.print("\nQue tarea deseas marcar como 'En proceso': \n");
                        int Numtarea = Integer.parseInt(scanner.nextLine()) - 1;
                        trelo.get(Numtarea).setStatus(status[1]);
                        System.out.println("\nTarea actualizada!\n");
                    }
                    else
                        System.out.println("No hay tareas!");
                }

                case 3-> 
                {
                    if(!trelo.isEmpty())
                    {
                        mostrarTareas(trelo);
                        System.out.print("\nQue tarea deseas marcar como 'Terminado': \n");
                        int NumTarea = Integer.parseInt(scanner.nextLine()) - 1;
                        trelo.get(NumTarea).setStatus(status[2]);
                        System.out.println("\nTarea actualizada!\n");
                    }
                    else
                        System.out.println("No hay tareas!");
                }

                case 4 -> 
                {
                    if (!trelo.isEmpty()) 
                    {
                        mostrarTareas(trelo);
                        System.out.print("Seleccione la tarea para eliminar:");
                        int NumTarea = Integer.parseInt(scanner.nextLine()) - 1;
                        trelo.remove(NumTarea);
                        System.out.println("Tarea eliminada.");
                    } 
                    else
                        System.out.println("No hay tareas disponibles.");
                }

                case 5 -> 
                {
                    System.out.println("||-----------------------------------------------------||\n");
                    System.out.println("Tareas 'Pendientes':");
                    mostrarTareasEstado(trelo, status[0]);
                    System.out.println();
                    System.out.println("||-----------------------------------------------------||\n");
                }

                case 6 -> 
                {
                    System.out.println("||-----------------------------------------------------||\n");
                    System.out.println("Tareas 'En Proceso':");
                    mostrarTareasEstado(trelo, status[1]);
                    System.out.println();
                    System.out.println("||-----------------------------------------------------||\n");
                }

                case 7 -> 
                {
                    System.out.println("||-----------------------------------------------------||\n");
                    System.out.println("Tareas 'Terminado':");
                    mostrarTareasEstado(trelo, status[2]);
                    System.out.println();
                    System.out.println("||-----------------------------------------------------||\n");
                }
                case 9 -> System.out.println("Saliendo...");
                default -> System.out.println("Opcion invalida!");
            }
        }while(opc != 9);
    }
    // Metodos

    public static void menu() 
    {
        System.out.println("\n||----------------Menu para Lista--------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 1 -> Agregar nueva tarea                            ||");
        System.out.println("|| 2 -> Marcar tarea como 'En proceso'                 ||");
        System.out.println("|| 3 -> Marcar tarea como 'completada'                 ||");
        System.out.println("|| 4 -> Eliminar tarea                                 ||");
        System.out.println("|| 5 -> Mostrar tareas 'Pendientes                     ||");
        System.out.println("|| 6 -> Mostrar tareas 'En proceso'                    ||");
        System.out.println("|| 7 -> Mostrar tareas 'Terminadas'                    ||");
        System.out.println("||                                                     ||");
        System.out.println("||-------------------Otras opciones--------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 9 -> Salir                                          ||");
        System.out.println("||                                                     ||");
        System.out.println("||-----------------------------------------------------||\n");
    }

    // Metodo para mostrar la información del Trelo
    public static void mostrarTareas(ArrayList<Trelo> trelo) 
    {
        for (int i = 0; i < trelo.size(); i++) 
            System.out.println("[" + (i + 1) + "]" + " -> " + trelo.get(i).getTarea() + "( " + trelo.get(i).getStatus() + ")");
    }

    // Método para mostrar tareas por estado
    public static void mostrarTareasEstado(ArrayList<Trelo> trelo, String Estado)
    {
        int contador = 1; 
        for(Trelo tarea : trelo)
        {
            if(tarea.getStatus().equals(Estado)) // Solo mostrar si el estado coincide
            {
                System.out.println("[" + contador + "]" + " -> " + tarea.getTarea());
                contador++;
            }
        }
    }

}

