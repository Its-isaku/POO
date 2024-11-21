public class Avion implements Volador 
{
    boolean EnAire = false;

    @Override
    public void despegar()
    {
        if(!EnAire)
        {
            System.out.println("Despegando avion...");
            EnAire = true;
        }
        else
            System.out.println("Avion ya esta en el aire");
    }

    @Override
    public void aterrizar()
    {
        if(EnAire)
        {
            System.out.println("Aterrizando avion...");
            EnAire = false;
        }
        else
            System.out.println("Avion ya esta en tierra");
    }
}
