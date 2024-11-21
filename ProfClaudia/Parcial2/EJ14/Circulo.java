class Circulo extends Figura
{
    double radio;
    
    public Circulo(double radio)
    {
        this.radio = radio;
    }

    @Override
    void MostrarFigura()
    {
        System.out.println("Esta es un circulo");
    }

    @Override
    double CalcularArea()
    {
        return 3.1416 * (radio * radio);
    }
    
}
