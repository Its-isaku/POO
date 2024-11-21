public class Pajaro  implements Volador 
{
    boolean EnAire = false;

    @Override
    public void despegar()
    {
        if(!EnAire)
        {
            System.out.println("Despegando pajaro...");
            EnAire = true;
        }
        else
            System.out.println("Pajaro ya esta en el aire");
    }

    @Override
    public void aterrizar()
    {
        if(EnAire)
        {
            System.out.println("Aterrizando pajaro...");
            EnAire = false;
        }
        else
            System.out.println("Pajaro ya esta en tierra");
    }    
}
