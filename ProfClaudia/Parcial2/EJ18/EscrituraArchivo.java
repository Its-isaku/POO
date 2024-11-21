//? Libreris
import java.io.*;

public class EscrituraArchivo
{
    public static void main(String[] args) 
    {
        //? Variables

        //? Crear objeto de la clase
        BufferedWriter Escritor = null;

        try
        {
            File Archivo = new File("Archivo.txt");
            Escritor = new BufferedWriter(new FileWriter(Archivo));
            Escritor.write("Hola papus!\n");
            Escritor.newLine();
            Escritor.write("Como estan?\n");
            System.out.println("El archivo se escribio correctamente!");
        } 
        catch(IOException e) {System.out.println("Error al escribir en el archivo! \n" + e.getMessage() +"\n" ); }
        finally
        {
            try { if(Escritor != null) Escritor.close(); }
            catch(IOException e) { System.out.println("Error al cerrar el archivo!" + e.getMessage() + "\n"); }
        }
    }
}
    //? Metodos

