public class Alunoo extends Pessoaa{
    private int mat;
    private String curso;

    public void cancelarMat(){
        System.out.println("Matrícula Cancelada!");
    }

    public void pagarMensalidade(){
        System.out.println("Pagando Mensalidade do Aluno: " + this.getNome());
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getMat() {
        return mat;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return curso;
    }
    
}
