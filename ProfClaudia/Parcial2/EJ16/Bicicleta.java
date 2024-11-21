class Bicicleta extends Vehiculo 
{
    int Velocidad = 0;

    @Override
    void Acelerar() 
    {
        Velocidad += 10;
        if (Velocidad > 0) 
        {
            System.out.println("Acelerando bicicleta");
            System.out.println("Velocidad actual: " + Velocidad + " km/h");
        }
        else
            System.out.println("La bicicleta ya se encuentra detenida");
    }

    @Override
    void Frenar() 
    {
        Velocidad -= 10;
        if (Velocidad > 0) 
        {
            System.out.println("Frenando bicicleta");
            System.out.println("Velocidad actual: " + Velocidad + " km/h");
        }
        else
            System.out.println("La bicicleta ya se encuentra detenida");
    }
}
