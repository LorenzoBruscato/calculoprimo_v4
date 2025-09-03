package calculaprimo;

public class CalculaPrimo implements Runnable {

    int inicio;
    int fim;

    public CalculaPrimo(int inicio, int fim) {
        this.inicio = inicio;
        this.fim = fim;
    }

    public void run() {
        for (int i = inicio; i <= fim; i++) {
            int conta = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    conta++;
                }
            }
            if (conta == 2) {
                System.out.println(i + " é primo");
            }
        }
    }
}
