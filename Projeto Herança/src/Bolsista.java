public class Bolsista extends Alunoo {
    private float bolsa;

    public void renovarBolsa(){
        System.out.println("Bolsa renovada!");
    }

    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento Facilitado!");
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public float getBolsa() {
        return bolsa;
    }

    
    
}
