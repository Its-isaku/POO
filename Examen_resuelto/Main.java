
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Circulo circulo = new Circulo();
        CuentaBancaria cuentaBar = new CuentaBancaria("Isai");
        Auto auto = new Auto("Chevrolet", "Malibu");

        Float radio;
        double Monto = 0;
        double Monto2 = 0;
        Float incremento = 0.0f;
        Float decremento = 0.0f;

        System.out.println("Dame el radio del circulo: ");
        radio = Float.valueOf(scanner.nextLine());
        System.out.println("El área del círculo es: " + circulo.CalcularArea(radio));
        System.out.println("El perímetro del círculo es: " + circulo.CalcularPerimetro(radio));

        System.out.println("||------------------------------------------------------------------------------||");

        System.out.println("Dame la cantidad que deseas depositar: ");
        Monto = Double.parseDouble(scanner.nextLine());
        cuentaBar.Depositar(Monto);
        System.out.println("Tu cuenta tiene : " + cuentaBar.mostrar());

        System.out.println("Dame la cantidad que deseas retirar: ");
        Monto2 = Double.parseDouble(scanner.nextLine());
        cuentaBar.Retirar(Monto2);
        System.out.println("Tu cuenta tiene : " + cuentaBar.mostrar() + " despues de retirar");

    System.out.println("||------------------------------------------------------------------------------||");

        auto.MostrarEstado();

        System.out.println("Dame el incremento de velocidad: ");
        incremento = Float.valueOf(scanner.nextLine());
        auto.Acelerar(incremento);
        auto.MostrarEstado();

        System.out.println();

        System.out.println("Dame el decremento de velocidad: ");
        decremento = Float.valueOf(scanner.nextLine());
        auto.Frenar(decremento);
        auto.MostrarEstado();


    }

}
