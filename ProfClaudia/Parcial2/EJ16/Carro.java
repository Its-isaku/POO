class Carro extends Vehiculo
{
    int Velocidad = 0;

    @Override
    void Acelerar() 
    {
        Velocidad += 20;
        if (Velocidad > 0) 
        {
            System.out.println("Acelerando carro");
            System.out.println("Velocidad actual: " + Velocidad + " km/h");
        }
        else
            System.out.println("El carro ya se encuentra detenido");
    }

    @Override
    void Frenar() 
    {
        Velocidad -= 20;
        if (Velocidad > 0) 
        {
            System.out.println("Frenando carro");
            System.out.println("Velocidad actual: " + Velocidad + " km/h");
        }
        else
            System.out.println("El carro ya se encuentra detenido");
    }
}
