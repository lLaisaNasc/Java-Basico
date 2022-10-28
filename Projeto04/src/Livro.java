public class Livro implements Publicação {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String t, String aut, int tp, Pessoa p) {
        this.titulo = t;
        this.autor = aut;
        this.totPaginas = tp;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = p;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public String detalhes() {
        System.out.println("--- LIVRO ---");
        System.out.println("Título: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Número de Páginas: " + this.getTotPaginas());
        System.out.println("Página Atual: " + this.getPagAtual());
        System.out.println("Aberto? " + this.getAberto());
        return "Leitor: " + leitor.getNome() + "\nIdade: " + leitor.getIdade() + "\nSexo: " + leitor.getSexo();
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear (int p) {
        if (this.totPaginas < p) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }

    @Override
    public void avançarPag() {
        setPagAtual(this.getPagAtual() + 1);
    }

    @Override
    public void voltarPag() {
        setPagAtual(this.getPagAtual() - 1);
    }

}
