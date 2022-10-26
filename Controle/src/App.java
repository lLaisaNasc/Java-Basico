public class App {
    public static void main(String[] args) throws Exception {
        
        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.aumentarVolume();
        c.fecharMenu();
        c.play();
        c.desligar();
        c.abrirMenu();
        c.diminuirVolume();

    }
}
