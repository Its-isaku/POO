public class CuentaBancaria 
{
    double saldo;
    String titular;

    // Constructor
    public CuentaBancaria(String titular)
    {
        this.titular = titular;
        this.saldo = 0;
    }
    //Metodos

    //Metdo para depositar dinero
    public double Depositar(double monto)
    {
        return saldo += monto;
    }

    public double Retirar(double monto)
    {
        return saldo -= monto;
    }

    public Double mostrar()
    {
        return saldo;
    }
}
