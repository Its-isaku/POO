import java.util.ArrayList;

public class Banco 
{
    private ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

    public void RegistrarCuetna(Cuenta cuenta)
    {
        cuentas.add(cuenta);
    }

    public Cuenta BuscarCuenta(String numeroCuenta, String pin)
    {
        for(Cuenta cuenta : cuentas)
        {
            if(cuenta.VerificarPin(pin) && cuenta.getNumeroCuenta().equals(numeroCuenta))
                return cuenta;
        }
        return null; // si no se encuentra la cuenta
    }
}
