public class RobotCuchillos extends RobotBase
{
    private boolean ingredientes_preparados = false;

    public boolean isIngredientes_preparados() { return ingredientes_preparados; }
    public void setIngredientes_preparados(boolean ingredientes_preparados) { this.ingredientes_preparados = ingredientes_preparados; }

    @Override
    public void Inicializar()
    {
        System.out.println("Robot Cuchillos inicializado! y Listo para cortar bipbup!");
    }

    @Override
    public void Preparar_Ingredientes()
    {
        MostrarEstado("Cortando ingredientes...");
    }

    @Override
    public void Cocinar()
    {
        MostrarEstado("No puedo cocinar, soy un robot cuchillos! ");
    }

    @Override
    public void Servir()
    {
        MostrarEstado("No puedo servir, soy un robot cuchillos! ");
    }
}
