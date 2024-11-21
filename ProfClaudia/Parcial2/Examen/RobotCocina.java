public class RobotCocina extends RobotBase
{
    private final String tipo_comida;
    private boolean cocido = false;

    public RobotCocina(String tipo_comida)
    {
        this.tipo_comida = tipo_comida;
    }

    public boolean isCocido() { return cocido; }
    public void setCocido(boolean cocido) { this.cocido = cocido; }

    @Override
    public void Inicializar()
    {
        System.out.println("Robot Cocina (" + tipo_comida + ") inicializado! y Listo para cocinar bipbup!");
    }

    @Override
    public void Preparar_Ingredientes()
    {
        MostrarEstado("No puedo Preparar los Ingredientes, soy un robot para cocinar...");
    }

    @Override
    public void Cocinar()
    {
        MostrarEstado("Cocinando plato (" + tipo_comida + ")...");
    }

    @Override
    public void Servir()
    {
        MostrarEstado("No puedo servir, soy un robot para cocinar... ");
    }
}
