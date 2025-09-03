package principal;

import calculaprimo.CalculaPrimo;

public class Principal {

    public static void main(String[] args) {
        int inicio = 5;
        int fim = 150;

        System.out.println("Números primos do intervalo " + inicio + " e " + ((int) fim / 3) + ":");

        System.out.println("Sub-intervalo 1 entre " + inicio + " e " + ((int) fim / 3) + ":");
        CalculaPrimo cp1 = new CalculaPrimo(inicio, ((int) fim / 3));

        System.out.println("Sub-intervalo 2 entre " + ((int) (fim / 3) + 1) + " e " + ((int) fim - 50) + ":");
        CalculaPrimo cp2 = new CalculaPrimo(((int)(fim/3) + 1), ((int) fim - 50));

        System.out.println("Sub-intervalo 3 entre " + ((int) (fim - 49)) + " e " + fim + ":");
        CalculaPrimo cp3 = new CalculaPrimo(((int) (fim - 49)), fim);

        Thread t1 = new Thread(cp1);
        Thread t2 = new Thread(cp2);
        Thread t3 = new Thread(cp3);

        t1.start();
        t2.start();
        t3.start();
    }
}
