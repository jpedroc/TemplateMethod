public class Warrior extends ClassePersonagem{
    @Override
    public void preparar() {
        System.out.println("Sacando espada...");
    }

    @Override
    public void atacar() {
        System.out.println("Cortando inimigo!!!");
    }

    @Override
    public void defender() {
        System.out.println("Levantando escudo.");
    }
}
