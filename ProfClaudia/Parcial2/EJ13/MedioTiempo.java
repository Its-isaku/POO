public class MedioTiempo extends Empleado
{
    //? Constructor
    public MedioTiempo(String nombre, double salarioanual)
    {
        super(nombre, salarioanual);
    }
    
    //? Metodos

    //* CalcularBono retorna el 10% del salario anual
    @Override
    public double CalcularBono()
    {
        return getSalarioAnual() * 0.10; //? 10% del salario anual
    }

    //* CalcularBono retorna el 10% por rendimiento
    @Override
    public double CalcularBono(double rendimiento)
    {
        return getSalarioAnual() * 0.10 * rendimiento; //? 10% del salario anual por rendimiento
    }

    //* MostrarDetalles imprime el tipo de empleado y el salario anual
    @Override
    public void MostrarDetalles()
    {
        System.out.println("El empleado de medio tiempo: " + getNombre() + " tiene un salario anual de: " + getSalarioAnual());
    }
}
