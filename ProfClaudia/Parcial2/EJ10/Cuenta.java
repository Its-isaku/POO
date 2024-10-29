
public class Cuenta 
{
    private String Titular;
    private String TipoCuenta;
    private Double Saldo;
    private String NumeroCuenta;
    private String ClabeInterbancaria;
    private String Pin;

    //? Constructor
    public Cuenta(String titular, String tipoCuenta, Double saldo, String numeroCuenta, String clabeInterbancaria, String pin) 
    {
        this.Titular = titular;
        this.TipoCuenta = tipoCuenta;
        this.Saldo = saldo;
        this.NumeroCuenta = numeroCuenta;
        this.ClabeInterbancaria = clabeInterbancaria;
        this.Pin = pin;
    }

    public String getTitular() { return Titular; }
    public void setTitular(String titular) { Titular = titular; }

    public String getTipoCuenta() { return TipoCuenta; }
    public void setTipoCuenta(String tipoCuenta) { TipoCuenta = tipoCuenta; }

    public Double getSaldo() { return Saldo; }
    public void setSaldo(Double saldo) { Saldo = saldo; }

    public String getNumeroCuenta() { return NumeroCuenta; }
    public void setNumeroCuenta(String numeroCuenta) { NumeroCuenta = numeroCuenta; }

    public String getClabeInterbancaria() { return ClabeInterbancaria; }
    public void setClabeInterbancaria(String clabeInterbancaria) { ClabeInterbancaria = clabeInterbancaria; }

    public String getPin() { return Pin; }
    public void setPin(String pin) { Pin = pin; }

    //? Metodos

    // Metodo para verificar Pin
    public boolean VerificarPin(String pin)
    {
        if(!pin.equals(Pin))
        {
            System.out.println("PIN incorrecto.");
            return false;
        }
        return true;
    }

    // Metodo para mirar saldo
    public Double VerSaldo()
    {
        return Saldo;
    }

   // Metodo para depositar dinero
public void Depositar(Double monto)
{
    if(monto > 0)
    {
        Saldo += monto;
        System.out.println("Saldo depositado exitosamente!\n");
    }
    else
        System.out.println("Error: El monto debe ser positivo.\n");
}

// Metodo para retirar dinero
public void Retirar(Double monto)
{
    if(monto > 0 && monto <= Saldo)
    {
        Saldo -= monto;
        System.out.println("Saldo retirado exitosamente!\n");
    }
    else
        System.out.println("Error: El monto debe ser positivo y no exceder el saldo disponible.\n");
}


    public static void Menu() 
        {
            System.out.println("\n||-------------------Menu de Banco---------------------||");
            System.out.println("||                                                     ||");
            System.out.println("|| 1 -> Depositar                                      ||");
            System.out.println("|| 2 -> Retirar                                        ||");
            System.out.println("|| 3 -> Ver saldo                                      ||");
            System.out.println("|| 9 -> Salir                                          ||");
            System.out.println("||                                                     ||");
            System.out.println("||-----------------------------------------------------||\n");
        }
}
