public class Gato extends Animal
{
    //? Atributos
    private String NumVidas;

    //? Constructor
    public Gato(String nombre, int edad, String NumVidas)
    {
        super(nombre, edad);
        this.NumVidas = NumVidas;
    }

    //? Getters y Setters
    public String getNumVidas() { return NumVidas;}
    public void setNumVidas(String NumVidas) { this.NumVidas = NumVidas;}

    //? Metodos

    //* Metodo para hacer un ruido
    
    @Override
    public void hacerRuido()
    {
        System.out.println("El gato esta maullando");
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
