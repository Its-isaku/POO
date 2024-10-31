
public class Circulo
{
    float Radio;

    public Circulo()
    {
        this.Radio = 0;
    }

    //? metodo para calcular Area
    public float CalcularArea(Float radio)
    {
        float PI = 3.1416f; // Valor de Pi
        return PI * (radio * radio);
    }

    //? metodo para calcular perimetro
    public float CalcularPerimetro(Float radio)
    {
        float PI = 3.1416f; // Valor de Pi
        return 2 * PI * radio;
    }
}
