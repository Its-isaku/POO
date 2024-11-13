//? Clase Animal
public class Animal 
{
    //? Atributos
    private String Nombre;
    private int edad;

    //? Constructor con parametros
    public Animal(String nombre, int edad)
    {
        this.Nombre = nombre;
        this.edad = edad;
    }

    //? Constructor sin parametros
    public Animal()
    {
        this.Nombre = "";
        this.edad = 0;
    }

    //? getters y setters
    public String getNombre() { return Nombre;}
    public void setNombre(String nombre) { Nombre = nombre;}

    public int getEdad() { return edad;}
    public void setEdad(int edad) { this.edad = edad;}

    //? Metodos

    //* Metodo para hacer un ruido sin parametros
    public void hacerRuido()
    {
        System.out.println("El animal esta haciendo un ruido");
    }

    //* Metodo para hacer un ruido con parametros
    public void hacerRuido(int Volumen)
    {
        System.out.println("El animal esta haciendo un ruido, su volumen es: " + Volumen);
    }

    public void hacerRuido(String Tonos, float Duracion)
    {
        System.out.println("El animal esta haciendo un ruido, su tono es: " + Tonos + " y su duracion es " + Duracion);
    }

}
