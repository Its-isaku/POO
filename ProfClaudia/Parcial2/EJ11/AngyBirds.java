//? Clase Padre
class AngyBirds 
{
    //? Atributos
    private String Nombre;
    private String Poder;
    private int Cantidad;
    

    //? Constructor
    public AngyBirds(String nombre, int cantidad, String Poder)
    {
        this.Nombre = nombre;
        this.Poder = Poder;
        this.Cantidad = cantidad;
    }

    //? Getters y Setters
    public String getNombre() { return Nombre; }
    public void setNombre(String Nombre) { this.Nombre = Nombre; }

    public String getPoder() { return Poder; }
    public void setPoder(String Poder) { this.Poder = Poder; }

    public int getCantidad() { return Cantidad; }
    public void setCantidad(int Cantidad) { this.Cantidad = Cantidad; }

    //? Metodos

    //* Metodo que lanza personaje y disinuye su cantidad
    public void Lanzar()
    {
        if(Cantidad > 0)
        {
            Cantidad--;
            System.out.println("Se ha lanzado a " + Nombre + ", le quedan: " + Cantidad + " turnos.\n");
        }
        else
            System.out.println(Nombre + " Ya no tiene turnos disponibles");
    }
}
