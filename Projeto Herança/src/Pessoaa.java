abstract class Pessoaa {
    private String nome;
    private int idade;
    private String sexo;

    public void fazerAniver() {
        this.idade++;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    @Override
    public String toString() {
        return "Pessoa: "+ "Nome: " + nome +", Idade: " + idade + ", Sexo: " + sexo;
    }
}
