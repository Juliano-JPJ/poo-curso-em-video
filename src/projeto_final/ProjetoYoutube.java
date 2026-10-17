package projeto_final;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 2 de POO");
        video[2] = new Video("Aula 3 de POO");

        Inscrito inscrito[] = new Inscrito[2];
        inscrito[0] = new Inscrito("Pedro", 22, "Masculino", "Pedrinho2322");
        inscrito[1] = new Inscrito("Vinicius", 18, "Masculino", "SaboneteCheiroso123");

        System.out.println(video[0].toString());
        System.out.println(inscrito[0].toString());
    }
}
