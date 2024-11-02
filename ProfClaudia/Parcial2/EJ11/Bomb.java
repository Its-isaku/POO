//? Sub clase 1
class Bomb extends AngyBirds
{
    //? Atributos
    private String Especie;
    private String Color;

    public Bomb(String nombre, int cantidad, String poder, String color, String especie)
    {
        super(nombre, cantidad, poder); // se llama al constructor de la superclse
        this.Color = color;
        this.Especie = especie;
    }

    //? Getters y setters
    public String getEspecie() { return Especie; }
    public void setEspecie(String Especie) { this.Especie = Especie; }

    public String getColor() { return Color; }
    public void setColor(String Color) { this.Color = Color; }

    //? Metodos

    // Metodo para usar el poder de Bomb
    public void AtaqueEspecial()
    {
        if(getCantidad() > 0)
            System.out.println(getNombre() + " realiza su ataque " + getPoder());
    }
}
