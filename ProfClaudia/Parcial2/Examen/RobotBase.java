//? clase abstracta
public abstract class RobotBase implements RobotInterface
{
    //? Iniciializar robot
    public abstract void Inicializar();

    //? Preparar ingredientes
    public abstract void Preparar_Ingredientes();

    //? Cocinar
    public abstract void Cocinar();

    //? Servir
    public abstract void Servir();

    //? Mostrar estado
    @Override
    public void MostrarEstado(String estado)
    {
        System.out.println(this.getClass().getSimpleName() + ": " + estado);
    } //* el getClass().getSimpleName() regresa el nombre de la clase
}
