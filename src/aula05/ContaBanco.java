package aula05;

public class ContaBanco {
    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //Métodos especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    //Métodos personalizados

    public void estadoAtual() {
        System.out.println("------------BANCO MASTER----------------");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " + this.getStatus());
        System.out.println("----------------------------------------");
    }

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC") {
            this.setSaldo(50);
        } else if(t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta criada com sucesso!");
    }

    public void fecharConta() {
        if(this.getSaldo() > 0) {
            System.out.println("A conta não pode ser encerrada. Saque o dinheiro para prosseguir com a operação.");
        } else if(this.getSaldo() < 0) {
            System.out.println("A conta não pode ser encerrada. Quite os débitos para prosseguir com a operação.");
        } else {
            this.setStatus(false);
            System.out.println("Conta encerrada com sucesso!");
        }
    }

    public void depositar(float v) {
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + this.getDono() + "!");
        } else {
            System.out.println("Impossível depositar em uma conta inexistente!");
        }
    }

    public void sacar(float v) {
        if(this.getStatus()) {
            if(getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta de " + this.getDono() + "!");
            } else {
                System.out.println("Saldo insuficiente para saque!");
            }
        } else {
            System.out.println("Impossível sacar de uma conta inexistente!");
        }
    }

    public void pagarMensal() {
        int v = 0;
        if(this.getTipo() == "CC") {
            v = 12;
        } else if(getTipo() == "CP") {
            v = 20;
        }
        if(this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso por " + this.getDono() + "!");
        } else {
            System.out.println("Impossível pagar mensalidade de uma conta inexistente!");
        }
    }
}
