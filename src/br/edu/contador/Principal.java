package br.edu.contador;

public class Principal {
    public static void main(String[] args) {
        System.out.println("--- Laço FOR ---");
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                System.out.println("pin");
            } else {
                System.out.println(i);
            }
        }

        System.out.println("--- Laço WHILE ---");
        int j = 1;
        while (j <= 30) {
            if (j % 3 == 0) {
                System.out.println("pin");
            } else {
                System.out.println(j);
            }
            j++;
        }

        System.out.println("--- Laço DO-WHILE ---");
        int k = 1;
        do {
            if (k % 3 == 0) {
                System.out.println("pin");
            } else {
                System.out.println(k);
            }
            k++;
        } while (k <= 30);
    }
}