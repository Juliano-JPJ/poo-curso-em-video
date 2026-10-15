package aula13;

public class Aula13 {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Lobo lobo = new Lobo();
        Cachorro cachorro = new Cachorro();

        mamifero.emitirSom();
        lobo.emitirSom();
        cachorro.emitirSom();

        System.out.println("Frase:");
        cachorro.reagir("Bom garoto");
        cachorro.reagir("Vai apanhar");
        System.out.println("Hora:");
        cachorro.reagir(11, 45);
        cachorro.reagir(19, 00);
        System.out.println("Dono:");
        cachorro.reagir(true);
        cachorro.reagir(false);
        System.out.println("Idade e peso:");
        cachorro.reagir(2, 12.5f);
        cachorro.reagir(17, 4.5f);
    }
}
