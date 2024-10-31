public class Auto 
{
    String Marca;
    String Modelo;
    Float Velocidad;

    // Constructor
    public Auto(String Marca, String Modelo)
    {
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Velocidad = 0.0f;
    }

    // Metodos

    // Metodo para acelerar
    public Float Acelerar(Float Incremento)
    {
        return Velocidad += Incremento;
    }

    // Metodo para frenar
    public Float Frenar(Float Decremento)
    {
        return Velocidad -= Decremento;
    }

    // Metodo para mostrar estado de la velocidad
    public void MostrarEstado()
    {
        System.out.println("El estado de la velocidad del " + Marca + " " + Modelo + " es de: " + Velocidad + "Km/h");
    }

}
