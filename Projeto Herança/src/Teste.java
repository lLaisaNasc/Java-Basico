public class Teste {

    public static void main(String[] args) throws Exception {
        
        Alunoo p2 = new Alunoo();
        Prof p3 = new Prof();
        Visitante p4 = new Visitante();
        Bolsista p1 = new Bolsista();

        p2.setNome("Maria");
        p3.setNome("Cláudio");
        p4.setNome("Fabiana");
        p1.setNome("Pedro");

        p4.setSexo("F");
        p2.setIdade(18);
        p1.setIdade(16);

        p2.setCurso("ADS");
        p3.setSalario(1500.50f);
        p2.pagarMensalidade();
        p1.pagarMensalidade();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
