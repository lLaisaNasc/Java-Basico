public class Peixes extends Animal {

    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Nadando");
    }

    @Override
    public void alimentar() {
        System.out.println("Algas..");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de peixe");
    }

    public void soltarBolha(){
        System.out.println("Blubb");
    }
    
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }
}
