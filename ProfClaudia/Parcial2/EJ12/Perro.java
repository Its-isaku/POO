public class Perro extends Animal 
{
    //? Atributos
    private String raza;

    //? Constructor
    public Perro(String nombre, int edad, String raza)
    {
        super(nombre, edad);
        this.raza = raza;
    }

    //? Getters y Setters
    public String getRaza() { return raza;}
    public void setRaza(String raza) { this.raza = raza;}

    //? Metodos

    //* Metodo para hacer un ruido

    @Override
    public void hacerRuido()
    {
        System.out.println("El perro esta ladrando");
    }

    //* Metodo para hacer un ruido con parametros
    @Override
    public void hacerRuido(int Volumen)
    {
        System.out.println(getNombre() + " esta haciendo un ruido, su volumen es: " + Volumen);
    }

    @Override
    public void hacerRuido(String Tonos, float Duracion)
    {
        System.out.println(getNombre() + " esta haciendo un ruido, su tono es: " + Tonos + " y su duracion es " + Duracion);
    }

}
