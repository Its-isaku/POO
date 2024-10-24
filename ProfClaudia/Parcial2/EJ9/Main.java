public class Main 
{
    public static void main(String[] args) 
    {
        PersonaEj9 persona = new PersonaEj9();

        persona.Nombre =  "Isai";
        persona.Mostrar_nombre();

        // este metodo no se puiede ejecutar porque es privado
        // persona.Edad = 21;

        // Metodo para poder obtener atributos privados con getters y setters
        persona.setEdad(21);
        System.out.println("\nEdad: " + persona.getEdad());

        persona.Direccion  = "Morelos, #425";
        persona.Mostrar_direccion();

        persona.Telefono = "6651272501";
        persona.Mostrar_telefono();

    }
}
