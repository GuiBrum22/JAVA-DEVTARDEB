package Formativa;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Formativa{
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();

    public void exercicio1(){
        int linhasMatriz;
        int colunasMatriz;

        System.out.println("Fale uma quantidade de linhas da matriz");
        linhasMatriz = sc.nextInt();
        System.out.println("Fale uma quantidade de colunas da matriz");
        colunasMatriz = sc.nextInt();
        int matriz[][] = new int[linhasMatriz][colunasMatriz];

        for (int i = 0; i < linhasMatriz; i++) {
            for (int j = 0; j < colunasMatriz; j++) {
                matriz[i][j] = rd.nextInt(9);
            }
        }

        for (int i = 0; i < linhasMatriz; i++) {
            System.out.print(" | ");
            for (int j = 0; j < colunasMatriz; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" | ");
        }

        for (int i = 0; i < linhasMatriz; i++) {
            System.out.print(" | ");
            for (int j = 0; j < colunasMatriz; j++) {
                if (i > j) {
                    System.out.print("1 ");
                } else if (i == j) {
                    System.out.print("0 ");
                } else {
                    System.out.print("2 ");
                }
            }
            System.out.println(" | ");
        }
    }

    public void exercicio2() {
        Random rd = new Random();
        int valorSorteado = rd.nextInt(0, 1000) + 1;
        boolean tenteNovamente = true;
        double numeroDigitado;
        int tentativas = 0;
        while (tenteNovamente) {
            System.out.println("Digite um número");
            numeroDigitado = sc.nextInt();
            if (numeroDigitado == valorSorteado) {
                tentativas++;
                System.out.println("Você acertou!Precisou de " + tentativas + " tentativas!");
                tenteNovamente = false;
            } else if (numeroDigitado > valorSorteado) {
                tentativas++;
                System.out.println("O número que você digitou é maior");
            } else if (numeroDigitado < valorSorteado) {
                tentativas++;
                System.out.println("O número que você digitou é menor");
            }
        }
    }

    public void exercicio3() {
        int tamanhoVetor = rd.nextInt(100, 1000);
        int vetor[] = new int[tamanhoVetor];
        int cPar = 0;
        int cImpar = 0;

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rd.nextInt(1, 100);
        }

        System.out.println("Os pares do vetor são:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                System.out.print(vetor[i] + ", ");
            }
            if ((i + 1) % 2 == 0) {
                cImpar++; 
            } else {
                cPar++;
            }

        }

        System.out.println("Os ímpares do vetor são:");
        for (int j = 0; j < vetor.length; j++) {
            if (vetor[j] % 2 != 0) {
                System.out.print(vetor[j] + " ");
            }
        }
        System.out.println("Números em posições pares é de: " + cPar);
        System.out.println("Números em posições ímpares é de: " + cImpar);
    }
}