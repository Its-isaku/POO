class Empleado 
{
    //? Atributos
    private String Nombre;
    private double SalarioAnual;

    //? Constructor
    public Empleado(String nombre, double salarioanual)
    {
        this.Nombre = nombre;
        this.SalarioAnual = salarioanual;
    }

    //? getters y setters
    public String getNombre() { return Nombre; }
    public void setNombre(String nombre) { Nombre = nombre; }

    public double getSalarioAnual() { return SalarioAnual; }
    public void setSalarioAnual(double salarioAnual) { SalarioAnual = salarioAnual; }

    //? Metodos

    //* CalcularBono retorna el 5% del salario anual
    public double CalcularBono()
    {
        return SalarioAnual * 0.05; //? 5% del salario anual
    }

    //* CalcularBono retorna el porcentaje del salario anual
    public double CalcularBono(double porcentaje)
    {
        return SalarioAnual * porcentaje; //? porcentaje del salario anual
    }

    //* CalcularBono retorna el porcentaje del salario anual por rendimiento
    public double CalcularBono(double porcentaje, double rendimiento)
    {
        return (SalarioAnual * porcentaje) * rendimiento; //? porcentaje del salario anual por rendimiento
    }

    public void MostrarDetalles()
    {
        System.out.println("El salario anual de: " + Nombre + " es de: " + SalarioAnual);
    }
}
