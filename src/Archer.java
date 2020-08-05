public class Archer extends ClassePersonagem{
    @Override
    public void preparar() {
        System.out.println("Mirando arco...");
    }

    @Override
    public void atacar() {
        System.out.println("Flecha disparada!!!");
    }

    @Override
    public void defender() {
        System.out.println("Recuando...");
    }
}
