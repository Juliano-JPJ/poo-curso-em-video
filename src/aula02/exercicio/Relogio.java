package aula02.exercicio;

public class Relogio {
    String marca;
    String tipo;
    boolean funcionando;
    int hora;

    void statusRelogio() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Está funcionando? " + this.funcionando);
    }

    void consertar() {
        System.out.println("Consertando relógio...");
        this.funcionando = true;
    }

    void mostrarHora() {
        if (funcionando == true) {
            System.out.println("Hora: " + this.hora + " horas.");
        } else {
            System.out.println("Relógio precisa de conserto");
        }
    }
}
