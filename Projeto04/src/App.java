public class App {
   
    public static void main(String[] args) throws Exception {

        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[2];

        p[0] = new Pessoa("Laisa", 18, "F");

        p[1] = new Pessoa("Maher", 20, "M");

        l[0] = new Livro("Senhor dos Anéis", "Robert", 200, p[1]);

        l[1] = new Livro("Harry Potter", "Sarah", 209, p[0]);

        l[0].abrir();
        l[0].avançarPag();
        l[0].avançarPag();
        l[0].folhear(204);
        System.out.println(l[0].detalhes());


    }
}
