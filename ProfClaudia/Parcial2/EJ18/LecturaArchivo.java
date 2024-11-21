//? Libreris
import java.io.*;

public class LecturaArchivo
{
    public static void main(String[] args) 
    {
        //? Variables

        //? Crear objeto de la clase
        BufferedReader Lector = null;

        try
        {
            File Archivo = new File("Archivo.txt");
            Lector = new BufferedReader(new FileReader(Archivo));

            String Linea;
            while((Linea = Lector.readLine()) != null)
                System.out.println(Linea);
        } 
        catch(FileNotFoundException e) { System.out.println("\nError: el archivo no fue encontrado! \n" + e.getMessage() + "\n"); }
        catch(IOException e) {System.out.println("Error al leer el archivo! \n" + e.getMessage() +"\n" ); }
        finally
        {
            try { if(Lector != null) Lector.close(); }
            catch(IOException e) { System.out.println("Error al cerrar el archivo!" + e.getMessage() + "\n"); }
        }
    }
}
    //? Metodos

