public class PersonaEj9
{
    public String Nombre;
    private int Edad;
    protected String Direccion;
    String Telefono;
    
    public int getEdad() { return Edad; }

    public void setEdad(int Edad) 
    {
        if(Edad > 0) 
            this.Edad = Edad;
        else
            System.out.println("la edad no puedw ser negativa");
    }
    
    //? Metodos

    public void Mostrar_nombre()
    {
        System.out.println("\nTu nombre es: " + Nombre);
    }

    private void Mostrar_edad()
    {
        System.out.println("\nTu edad es: " + Edad);
    }

    protected void Mostrar_direccion()
    {
        System.out.println("\nTu dirección es: " + Direccion);
    }

    void Mostrar_telefono()
    {
        System.out.println("\nTu teléfono es: " + Telefono);
    }

}