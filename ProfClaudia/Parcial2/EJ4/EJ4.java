import java.util.Scanner;

public class EJ4 {
    public static void main(String[] args) 
    {
        // Variables
        Scanner scanner = new Scanner(System.in);
        int opc = 0;

        // Crear un objeto Persona con datos predeterminados
        Persona Mexicano = new Persona("dannaly", "chavez", "astorga", "19", "06", "04", "BAJA CALIFORNIA", 'M');
        Persona persona = null;
        
        do {
            menu();
            System.out.print("Ingrese la opcion deseada: ");
            opc = scanner.nextInt();
            System.out.println();
            scanner.nextLine(); 

            switch (opc) 
            {
                case 1 -> 
                {
                    persona = crearPersona(scanner);
                    String curp = persona.generarCURP();
                    System.out.println("\nTu CURP es: " + curp + "\n");
                }
                case 2 -> 
                {
                    persona = crearPersona(scanner);
                    String rfc = persona.generarRFC();
                    System.out.println("\nTu RFC es: " + rfc + "\n");
                }
                case 3 -> 
                {
                    // Opcion para generar CURP y RFC usando el objeto
                    System.out.println("Generando CURP y RFC para los datos del Objeto:\n");
                    System.out.println("Nombre: " + Mexicano.nombre + "\n");
                    String curp = Mexicano.generarCURP();
                    System.out.println("CURP de Objeto: " + curp);
                    String rfc = Mexicano.generarRFC();
                    System.out.println("RFC de Objeto: " + rfc + "\n");
                }
                case 9 -> System.out.println("Gracias por utilizar este programa!\n");
                default -> System.out.println("Opcion invalida!\n");
            }

        } while (opc != 9);
    }

    // Metodo para mostrar el menu
    public static void menu() 
    {
        System.out.println("\n||----------------Menu para usuario--------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 1 -> Curp                                           ||"); 
        System.out.println("|| 2 -> RFC                                            ||"); 
        System.out.println("||                                                     ||");                                            
        System.out.println("||------------------Menu para objeto-------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 3 -> Generar Curp y Rfc de objeto                   ||");
        System.out.println("||                                                     ||");
        System.out.println("||-------------------Otras opciones--------------------||");
        System.out.println("||                                                     ||");
        System.out.println("|| 9 -> Salir                                          ||");
        System.out.println("||                                                     ||"); 
        System.out.println("||-----------------------------------------------------||\n");
    }

    // Metodo para crear un objeto Persona solicitando los datos al usuario
    public static Persona crearPersona(Scanner scanner) 
    {
        String nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, entidad;
        char genero;

        // Capturar el nombre
        do 
        {
            System.out.print("Ingresa tu nombre: ");
            nombre = scanner.nextLine().toUpperCase();
        } while (!isString(nombre));

        // Capturar el apellido paterno
        do 
        {
            System.out.print("Ingresa tu Apellido Paterno: ");
            apellidoPaterno = scanner.nextLine().toUpperCase();
        } while (!isString(apellidoPaterno));

        // Capturar el apellido materno
        do 
        {
            System.out.print("Ingresa tu Apellido Materno: ");
            apellidoMaterno = scanner.nextLine().toUpperCase();
        } while (!isString(apellidoMaterno));

        // Capturar dia de nacimiento
        do 
        {
            System.out.print("Ingresa tu dia de nacimiento (dd): ");
            dia = scanner.nextLine();
        } while (dia.length() != 2 || !isNumber(dia));

        // Capturar mes de nacimiento
        do 
        {
            System.out.print("Ingresa tu mes de nacimiento (mm): ");
            mes = scanner.nextLine();
        } while (mes.length() != 2 || !isNumber(mes));

        // Capturar año de nacimiento
        do 
        {
            System.out.print("Ingresa tu anio de nacimiento (aa): ");
            anio = scanner.nextLine();
        } while (anio.length() != 2 || !isNumber(anio));

        // Capturar entidad de nacimiento
        do 
        {
            System.out.print("Ingresa la entidad donde naciste: ");
            entidad = scanner.nextLine().toUpperCase();
        } while (!EN_Valida(entidad));

        // Capturar el genero
        do 
        {
            System.out.print("Ingresa tu genero (H/M): ");
            genero = scanner.nextLine().toUpperCase().charAt(0);
        } while (genero != 'H' && genero != 'M');

        // Crear y devolver el objeto Persona
        return new Persona(nombre, apellidoPaterno, apellidoMaterno, dia, mes, anio, entidad, genero);
    }

    // Metodo para verificar si una cadena contiene solo letras
    public static boolean isString(String s) 
    {
        for (int i = 0; i < s.length(); i++)
        {
            if (!Character.isAlphabetic(s.charAt(i)))
                return false;
        }
        return true;
    }

    // Metodo para verificar si una cadena contiene solo numeros
    public static boolean isNumber(String s) 
    {
        for (int i = 0; i < s.length(); i++) 
        {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }

    // Metodo para validar la entidad de nacimiento
    public static boolean EN_Valida(String EN)
    {
        boolean valido = false;
        switch (EN) 
        {
            case "BAJA CALIFORNIA" ->  valido = true; 
            case "AGUASCALIENTES" ->  valido = true;
            case "BAJA CALIFORNIA SUR" ->  valido = true;
            case "CAMPECHE" ->  valido = true;
            case "COAHUILA" ->  valido = true;
            case "COLIMA" ->  valido = true;
            case "CHIAPAS" ->  valido = true;
            case "CHIHUAHUA" ->  valido = true;
            case "DISTRITO FEDERAL" ->  valido = true;
            case "DURANGO" ->  valido = true;
            case "GUANAJUATO" ->  valido = true; 
            case "GUERRERO" ->  valido = true;
            case "HIDALGO" ->  valido = true;
            case "JALISCO" ->  valido = true;
            case "MEXICO" ->  valido = true;
            case "MICHOACAN" ->  valido = true;
            case "MORELOS" ->  valido = true;
            case "NAYARIT" ->  valido = true;
            case "NUEVO LEON" ->  valido = true;
            case "OAXACA" ->  valido = true;
            case "PUEBLA" ->  valido = true; 
            case "QUERETARO" ->  valido = true;
            case "QUINTANA ROO" ->  valido = true;
            case "SAN LUIS POTOSI" ->  valido = true;
            case "SINALOA" ->  valido = true;
            case "SONORA" ->  valido = true;
            case "TABASCO" ->  valido = true;
            case "TAMAULIPAS" ->  valido = true;
            case "TLAXCALA" ->  valido = true;
            case "VERACRUZ" ->  valido = true;
            case "YUCATAN" ->  valido = true;
            case "ZACATECAS" ->  valido = true;
            case "NACIDO EN EL EXTRANJERO" ->  valido = true;
        }
        return valido;
    }
}

// Clase Persona que contiene los metodos para generar CURP y RFC
class Persona 
{
    // Atributos
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;
    String diaNacimiento;
    String mesNacimiento;
    String anioNacimiento;
    String entidadNacimiento;
    char genero;

    // Constructor
    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String diaNacimiento, String mesNacimiento, String anioNacimiento, String entidadNacimiento, char genero) 
    {
        this.nombre = nombre.toUpperCase();
        this.apellidoPaterno = apellidoPaterno.toUpperCase();
        this.apellidoMaterno = apellidoMaterno.toUpperCase();
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anioNacimiento = anioNacimiento;
        this.entidadNacimiento = entidadNacimiento.toUpperCase();
        this.genero = genero;
    }

    // Metodo para generar CURP
    public String generarCURP() 
    {
        String[] curp = new String[18];
        String Vocales = "AEIOU";
        String consonantes = "BCDFGHJKLMNÑPQRSTVWXYZ";

        curp[0] = Character.toString(apellidoPaterno.charAt(0));
        curp[1] = PrimerVocal(apellidoPaterno, Vocales);
        curp[2] = Character.toString(apellidoMaterno.charAt(0));
        curp[3] = Character.toString(nombre.charAt(0));
        curp[4] = Character.toString(anioNacimiento.charAt(0));
        curp[5] = Character.toString(anioNacimiento.charAt(1));
        curp[6] = Character.toString(mesNacimiento.charAt(0));
        curp[7] = Character.toString(mesNacimiento.charAt(1));
        curp[8] = Character.toString(diaNacimiento.charAt(0));
        curp[9] = Character.toString(diaNacimiento.charAt(1));
        curp[10] = Character.toString(genero);
        curp[11] = Character.toString(EntidadNacimiento(entidadNacimiento).charAt(0));
        curp[12] = Character.toString(EntidadNacimiento(entidadNacimiento).charAt(1));
        curp[13] = PrimerConsonante(apellidoPaterno, consonantes);
        curp[14] = PrimerConsonante(apellidoMaterno, consonantes);
        curp[15] = PrimerConsonante(nombre, consonantes);
        curp[16] = Character.toString(CharacterAleatorio());
        curp[17] = Character.toString(CharacterAleatorio());

        String resultadoCurp = "";
        for (int i = 0; i < curp.length; i++) 
            resultadoCurp += curp[i];  
        return resultadoCurp;
    }

    // Metodo para generar RFC
    public String generarRFC() 
    {
        String[] rfc = new String[13];
        String Vocales = "AEIOU";
        String consonantes = "BCDFGHJKLMNÑPQRSTVWXYZ";

        rfc[0] = Character.toString(apellidoPaterno.charAt(0));
        rfc[1] = PrimerVocal(apellidoPaterno, Vocales);
        rfc[2] = Character.toString(apellidoMaterno.charAt(0));
        rfc[3] = Character.toString(nombre.charAt(0));
        rfc[4] = Character.toString(anioNacimiento.charAt(0));
        rfc[5] = Character.toString(anioNacimiento.charAt(1));
        rfc[6] = Character.toString(mesNacimiento.charAt(0));
        rfc[7] = Character.toString(mesNacimiento.charAt(1));
        rfc[8] = Character.toString(diaNacimiento.charAt(0));
        rfc[9] = Character.toString(diaNacimiento.charAt(1));
        rfc[10] = Character.toString(CharacterAleatorio());
        rfc[11] = Character.toString(CharacterAleatorio());
        rfc[12] = Character.toString(CharacterAleatorio());

        String resultadoRfc = "";
        for (int i = 0; i < rfc.length; i++)
            resultadoRfc += rfc[i]; 

        return resultadoRfc;
    }

    // Metodos auxiliares
    public static String PrimerVocal(String palabra, String Vocales) 
    {
        for (int i = 1; i < palabra.length(); i++) 
        {
            if (Vocales.indexOf(palabra.charAt(i)) != -1) 
                return Character.toString(palabra.charAt(i));
        }
        return "X";
    }

    public static String PrimerConsonante(String palabra, String consonantes) 
    {
        for (int i = 1; i < palabra.length(); i++) 
        {
            if (consonantes.indexOf(palabra.charAt(i)) != -1)
                return Character.toString(palabra.charAt(i));
        }
        return "X";
    }

    public static String EntidadNacimiento(String EN) 
    {
        return switch (EN) 
        {
            case "BAJA CALIFORNIA" -> "BC";
            case "AGUASCALIENTES" -> "AS";
            case "BAJA CALIFORNIA SUR" -> "BS";
            case "CAMPECHE" -> "CC";
            case "COAHUILA" -> "CL";
            case "COLIMA" -> "CM";
            case "CHIAPAS" -> "CS";
            case "CHIHUAHUA" -> "CH";
            case "DISTRITO FEDERAL" -> "DF";
            case "DURANGO" -> "DG";
            case "GUANAJUATO" -> "GT";
            case "GUERRERO" -> "GR";
            case "HIDALGO" -> "HG";
            case "JALISCO" -> "JC";
            case "MEXICO" -> "MC";
            case "MICHOACAN" -> "MM";
            case "MORELOS" -> "MS";
            case "NAYARIT" -> "NT";
            case "NUEVO LEON" -> "NL";
            case "OAXACA" -> "OC";
            case "PUEBLA" -> "PL";
            case "QUERETARO" -> "QT";
            case "QUINTANA ROO" -> "QR";
            case "SAN LUIS POTOSI" -> "SP";
            case "SINALOA" -> "SL";
            case "SONORA" -> "SR";
            case "TABASCO" -> "TC";
            case "TAMAULIPAS" -> "TS";
            case "TLAXCALA" -> "TL";
            case "VERACRUZ" -> "VZ";
            case "YUCATAN" -> "YN";
            case "ZACATECAS" -> "ZS";
            case "NACIDO EN EL EXTRANJERO" -> "NE";
            default -> "XX";
        };
    }

    public static char CharacterAleatorio() 
    {
        return (Math.random() < 0.5) ? (char) (Math.random() * 26 + 'A') : (char) (Math.random() * 10 + '0');
    }
}
