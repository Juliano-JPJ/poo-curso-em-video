package aula07;

public class UFC {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];

        lutador[0] = new Lutador("Charles DO BRONX Oliveira", "Brasil", 36, 1.78f, 70.0f,
                37, 11, 0);

        lutador[1] = new Lutador("Max BLESSED Holloway", "EUA",34, 1.80f, 70.2f,
                27, 9, 0);

        lutador[2] = new Lutador("Carlos THE NIGHTMARE Prates", "Brasil", 33, 1.85f, 77.1f,
                24, 7, 0);

        lutador[3] = new Lutador("Ian THE FUTURE Machado Garry", "Irlanda", 28, 1.91f, 77.0f,
                17, 2, 0);

        lutador[4] = new Lutador("Alex POATAN Pereira", "Brasil", 38, 1.93f, 113.0f,
                13, 4, 0);

        lutador[5] = new Lutador("Waldo SALSA BOY Cortes Acosta", "República Dominicana", 34, 1.93f,
                119.0f, 17, 4, 0);
    }
}
