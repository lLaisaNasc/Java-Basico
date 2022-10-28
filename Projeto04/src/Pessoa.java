public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public Pessoa(String no, int id, String s){
        this.nome = no;
        this.idade = id;
        this.sexo = s;
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

    public void fazerAniver(){
        setIdade(this.getIdade() + 1);
    }
}
