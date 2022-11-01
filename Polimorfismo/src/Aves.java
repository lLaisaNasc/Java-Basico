public class Aves extends Animal {

    private String corPena;

    @Override
    public void locomover() {
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo Sementes");
    }

    @Override
    public void emitirSom() {
        System.out.println("Cantando..");
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void fazerNinho(){
        System.out.println("Construindo ninho...");
    }
}
