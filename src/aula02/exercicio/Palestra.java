package aula02.exercicio;

public class Palestra {
    String titulo;
    String diaDaSemana;
    int horaInicio;
    int duracao;
    String situacao;

    void statusPalestra() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Data: " + this.diaDaSemana);
        System.out.println("Hora: " + this.horaInicio + "h");
        System.out.println("Tempo: " + this.duracao + " horas");
        System.out.println("Situação: " + this.situacao);
    }

    void comecarPalestra() {
        this.situacao = "Palestra iniciada";
    }

    void terminarPalestra() {
        this.situacao = "Palestra finalizada";
    }

    void cancelarPalestra() {
        this.situacao = "Palestra cancelada";
    }
}
