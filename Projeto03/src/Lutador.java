public class Lutador {

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int i, float al, float pes, int vi, int der, int emp) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = i;
        this.altura = al;
        setPeso(pes);
        this.vitorias = vi;
        this.derrotas = der;
        this.empates = emp;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    private String getNacionalidade() {
        return nacionalidade;
    }

    public  void setIdade(int idade) {
        this.idade = idade;
    }

    private int getIdade() {
        return idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    private float getAltura() {
        return altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria(categoria);
    }

    private float getPeso() {
        return peso;
    }

    private void setCategoria(String categoria) {

        if (this.peso > 52.2 && this.peso <= 70.3) {
            this.categoria = "Leve";
        } else if (this.peso > 70.3 && this.peso <= 83.9) {
            this.categoria = "Médio";
        } else if (this.peso > 83.9 && this.peso <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    public String getCategoria() {
        return categoria;
    }

    private void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    private int getVitorias() {
        return vitorias;
    }

    private void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    private int getDerrotas() {
        return derrotas;
    }

    private void setEmpates(int empates) {
        this.empates = empates;
    }

    private int getEmpates() {
        return empates;
    }

    public void apresentar() {
        System.out.println("Lutador: " + getNome());
        System.out.println("Nacionalidade: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println(getPeso() + "kg");
        System.out.println("Categoria: " + getCategoria());
        System.out.println(getVitorias() + " Vitórias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
        System.out.println("\n");
    }

    public void ganharLuta() {
        setVitorias(this.getVitorias() + 1);
        // this.vitorias++;
    }

    public void perderLuta() {
        setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(this.getEmpates() + 1);
    }
}
