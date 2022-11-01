public class Teste {
    public static void main(String[] args) throws Exception {
       
        Mamiferos m = new Mamiferos();
        Reptil r = new Reptil();
        Peixes p = new Peixes();
        Aves a = new Aves();
        Tartaruga t  = new Tartaruga();
        Cachorro c = new Cachorro();

        m.setPeso(35.3f);
        m.setCorPelo("Marrom");
        m.alimentar();
        m.locomover();
        m.emitirSom();

        r.setCorEscama("Verde Acizentado");
        r.alimentar();
        r.locomover();

        p.setPeso(0.89f);
        p.alimentar();
        p.soltarBolha();

        a.setIdade(5);
        a.emitirSom();
        a.locomover();

        t.locomover();

        c.emitirSom();

    }
}
