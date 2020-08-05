public abstract class ClassePersonagem {
    // Cada classe concreta irá aplicar seu estilo de luta: preparando, atacando e defendendo.
    public abstract void preparar();
    public abstract void atacar();
    public abstract void defender();

    // Mas no final, todas precisarão se preparar, atacar e se defender durante uma luta.
    public void lutar(){
        preparar();
        atacar();
        defender();
        System.out.println();
    }
}
