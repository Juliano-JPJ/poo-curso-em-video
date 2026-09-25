package aula02.exercicio;

public class Exercicio {
    public static void main(String[] args) {
        Relogio relogio = new Relogio();
        relogio.marca = "G-Shock";
        relogio.tipo = "Digital";
        relogio.funcionando = false;
        relogio.hora = 15;

        relogio.statusRelogio();
        relogio.mostrarHora();

        relogio.consertar();
        relogio.mostrarHora();

        System.out.println("-----------------------------");

        Palestra palestra = new Palestra();
        palestra.titulo = "Psicologia Clinica para Crianças";
        palestra.diaDaSemana = "Quinta-feira";
        palestra.horaInicio = 9;
        palestra.duracao = 2;

        palestra.cancelarPalestra();
        palestra.statusPalestra();

    }
}
