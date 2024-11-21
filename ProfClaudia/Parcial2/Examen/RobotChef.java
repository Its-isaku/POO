public class RobotChef extends RobotBase
{
    private final RobotCuchillos cuchillos = new RobotCuchillos();
    private final RobotCocina cocina = new RobotCocina("Chef");

    @Override
    public void Inicializar()
    {
        System.out.println("Robot Chef inicializado! y Listo para cocinar bipbup! ");
    }

    @Override
    public void Preparar_Ingredientes()
    {
        if (cuchillos.isIngredientes_preparados())
            MostrarEstado("Ya se prepararon los ingredientes!");
        else
        {
            MostrarEstado("El mini Robot de Cuchillos debe prepararlos antes!...");
            cuchillos.setIngredientes_preparados(true);
        }
    }

    @Override
    public void Cocinar()
    {
        if (cuchillos.isIngredientes_preparados())
        {
            if (cocina.isCocido())
                MostrarEstado("Ya se cocinó el plato! ");
            else
            {
                MostrarEstado("El mini robot de Cocina debe cocinarlo antes!...");
                cocina.setCocido(true);
            }
        }
        else
            MostrarEstado("No se pueden cocinar los ingredientes si no están preparados!...");
    }

    @Override
    public void Servir()
    {
        if (cocina.isCocido())
            System.out.println("¡Hurra! El plato estaba delicioso!");
        else
            MostrarEstado("No se puede servir un plato que no esté cocido bipbup!...");
    }
}
