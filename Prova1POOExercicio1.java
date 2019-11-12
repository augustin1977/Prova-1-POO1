package prova1pooexercicio1;

import java.util.Scanner;

public class Prova1POOExercicio1 {

    public static int[] entradaDeDados(int n) {
        Scanner input = new Scanner(System.in);
        int i;
        int vetor[] = new int[10];
        for (i = 0; i < n; i++) {
            System.out.printf("Digite o %d° valor\n:", i + 1);
            vetor[i] = input.nextInt();

        }
        return vetor;
    }

    public static int maiormenor(int[] vetor, boolean ordem) {
        int i, maior = 0;
        for (i = 0; i < vetor.length; i++) {
            if (ordem) {
                if (vetor[i] > vetor[maior]) {
                    maior = i;
                }
            } else {
                if (vetor[i] < vetor[maior]) {
                    maior = i;
                }
            }
        }
        return vetor[maior];
    }

    public static int multiplosde(int n, int[] vetor) {
        int i;
        int multiplos = 0;
        for (i = 0; i < vetor.length; i++) {
            if (vetor[i] % n == 0) {
                multiplos++;
            }
        }
        return multiplos;
    }

    public static void imprime(int[] vetor) {
        int tamanho;
        int i;
        tamanho = vetor.length;
        for (i = 0; i < tamanho; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.printf("\nfim do vetor\n");
    }

    public static int[] ordenavetor(int[] vetor, boolean ordem) {
        int i, j, aux;
        int tamanho = vetor.length;
        for (i = 0; i < tamanho; i++) {
            for (j = i + 1; j < tamanho; j++) {
                if (ordem) {
                    if (vetor[i] > vetor[j]) {
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                    }
                } else {
                    if (vetor[i] < vetor[j]) {
                        aux = vetor[i];
                        vetor[i] = vetor[j];
                        vetor[j] = aux;
                    }
                }
            }
        }
        return vetor;
    }

    public static void main(String[] args) {
        int vetor[] = new int[10];
        vetor = entradaDeDados(10);
        int menor = maiormenor(vetor, false);
        System.out.println("O menor valor do vetor é:" + menor);
        int multiplos = multiplosde(7, vetor);
        System.out.println("O numero de multiplos de 7 é: " + multiplos);
        imprime(ordenavetor(vetor, false));
    }

}
