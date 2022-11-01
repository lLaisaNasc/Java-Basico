public class Cachorros extends Lobo {

    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {
        if (frase == "Vamos Passear?") {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int h, int m) {
        if (h < 12) {
            System.out.println("Abanar");
        } else if (h >= 18) {
            System.out.println("Ignorar");
        } else {
            System.out.println("Latir");
            this.emitirSom();
        }
    }

    public void reagir(boolean dono) {
        if (dono = true) {
            System.out.println("Abanar e Lamber");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int idade, float peso) {
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            } else {
                System.out.println("Latir");
                this.emitirSom();
            }
        } else {
            if (peso < 10) {
                System.out.println("Rosnar");
            } else {
                System.out.println("ignorar");
            }
        }

    }

}
