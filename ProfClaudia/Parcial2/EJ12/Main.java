//? Librerias
public class Main 
{
    public static void main(String[] args) 
    {
        Perro chucho = new Perro("Firulais", 2, "Pastor Aleman");
        System.out.println("Nombre: " + chucho.getNombre());
        System.out.println("Edad: " + chucho.getEdad());
        System.out.println("Raza: " + chucho.getRaza());

        System.out.println();

        Gato minino = new Gato("Garfield", 3, "7");
        System.out.println("Nombre: " + minino.getNombre());
        System.out.println("Edad: " + minino.getEdad());
        System.out.println("Numero de vidas: " + minino.getNumVidas());

        //? usar metodos con polimorfismo
        System.out.println();
        chucho.hacerRuido();
        minino.hacerRuido();

        System.out.println();
        chucho.hacerRuido(10);
        chucho.hacerRuido("Agudo", 2.5f);
        System.out.println();
        minino.hacerRuido(5);
        minino.hacerRuido("Grave", 3.5f);
    }
}
