public class Mage extends ClassePersonagem{
    @Override
    public void preparar() {
        System.out.println("Canalizando energia...");
    }

    @Override
    public void atacar() {
        System.out.println("Lançando bola de fogo!!!");
    }

    @Override
    public void defender() {
        System.out.println("Criando barreira mágica!!");
    }
}
