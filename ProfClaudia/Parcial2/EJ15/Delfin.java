class Delfin extends Animal implements Nadador
{
    @Override
    void EmitirSonido() 
    {
        System.out.println("El delfín emite un sonido agudo");
    }

    @Override
    public void nadar() 
    {
        System.out.println("El delfín nada");
    }
    
}
