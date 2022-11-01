public class Reptil extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Insetos");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }
}
