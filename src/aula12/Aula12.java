package aula12;

public class Aula12 {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra co = new Cobra();
        Tartaruga t = new Tartaruga();
        PeixeDourado g = new PeixeDourado();
        Arara e = new Arara();

        m.setPeso(35.3f);
        m.setCorDoPelo("Marrom");
        m.alimentar();

        m.emitirSom();
        k.emitirSom();

        m.locomover();
        c.locomover();
        a.locomover();
        p.locomover();
        r.locomover();


    }
}
