public class Mamifero extends Animall {

    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de Mamífero");
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }
    
}
