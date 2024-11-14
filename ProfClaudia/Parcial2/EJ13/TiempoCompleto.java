public class TiempoCompleto extends Empleado
{
    //? Constructor
    public TiempoCompleto(String nombre, double salarioanual)
    {
        super(nombre, salarioanual);
    }
    
    //? Metodos

    //* CalcularBono retorna el 20% del salario anual
    @Override
    public double CalcularBono()
    {
        return getSalarioAnual() * 0.20; //? 20% del salario anual
    }

    //* CalcularBono retorna el 20% por rendimiento
    @Override   
    public double CalcularBono(double rendimiento)
    {
        return getSalarioAnual() * 0.20 * rendimiento; //? 20% del salario anual por rendimiento
    }

    //* MostrarDetalles imprime el tipo de empleado y el salario anual
    @Override
    public void MostrarDetalles()
    {
        System.out.println("El empleado de tiempo completo: " + getNombre() + " tiene un salario anual de: " + getSalarioAnual());
    }
}
