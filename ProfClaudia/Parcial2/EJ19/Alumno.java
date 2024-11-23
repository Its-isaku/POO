public class Alumno 
{
    //? Atributos
    private String nombre;
    private int Matricula;
    private double calificaciones[];
    private double promedio;

    //? Constructor
    public Alumno(String nombre, int Matricula, double calificaciones[])
    {
        this.nombre = nombre;
        this.Matricula = Matricula;
        this.calificaciones = calificaciones;
        this.promedio = 0;
    }

    //? Setters y Getters

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getMatricula() { return Matricula; }
    public void setMatricula(int Matricula) { this.Matricula = Matricula; }

    public double[] getCalificaciones() { return calificaciones; }
    public void setCalificaciones(double[] calificaciones) { this.calificaciones = calificaciones; }

    public double getPromedio() { return promedio; }
    public void setPromedio(double promedio) { this.promedio = promedio; }

    //? Metodos
    
    public double calcularPromedio()
    {
        double suma = 0;
        for (int i = 0; i < calificaciones.length; i++)
            suma += calificaciones[i];
        promedio = suma / calificaciones.length;

        return promedio;
    }



}
