public class TemplateMethod {

    public static void main(String[] args){

        ClassePersonagem personagem = new Mage();
        System.out.println("---> Mago lutando <---");
        personagem.lutar();

        personagem = new Warrior();
        System.out.println("---> Guerreiro lutando <---");
        personagem.lutar();

        personagem = new Archer();
        System.out.println("---> Arqueiro lutando <---");
        personagem.lutar();

    }
}
