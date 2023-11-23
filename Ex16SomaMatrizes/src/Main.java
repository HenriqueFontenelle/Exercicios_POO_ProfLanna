/*
Exercício 16: Soma de Matrizes

Crie um programa que realiza a soma de duas matrizes.
As matrizes devem ter o mesmo número de linhas e colunas e serem fornecidas pelo usuário. O programa deve calcular a soma elemento a elemento e exibir a matriz resultante.

Exemplo:

Digite o número de linhas: 2
Digite o número de colunas: 3

Digite os elementos da primeira matriz:
1 2 3
4 5 6

Digite os elementos da segunda matriz:
7 8 9
10 11 12

A soma das matrizes é:
8 10 12
14 16 18
 */

import javax.swing.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este algoritmo soma matrizes que tenham os mesmos números " +
                "de linhas e colunas. Vamos começar!");

        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de linhas para as matrizes: "));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de colunas para as matrizes: "));

        int[][] primeiraMatriz = new int[linhas][colunas];
        int[][] segundaMatriz = new int[linhas][colunas];
        int[][] somaDeMatrizes = new int[linhas][colunas];

        JOptionPane.showMessageDialog(null, "Vamos preencher a Primeira matriz: ");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                primeiraMatriz[i][j] =
                        Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " +
                                +i + j + " da " + "Primeira" + " Matriz: "));
            }
        }

        JOptionPane.showMessageDialog(null, "Vamos preencher a Segunda matriz: ");

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                segundaMatriz[i][j] =
                        Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " +
                                +i + j + " da " + "Segunda " + " Matriz: "));
            }
        }

        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                somaDeMatrizes[i][j] = primeiraMatriz[i][j] + segundaMatriz[i][j];
            }
        }

        printMatrizes.printMatrix(primeiraMatriz);
        System.out.println("\n");
        printMatrizes.printMatrix(segundaMatriz);
        System.out.println("\n");
        printMatrizes.printMatrix(somaDeMatrizes);

        String convertPrimeiraMatriz = Arrays.deepToString(primeiraMatriz);
        JOptionPane.showMessageDialog(null, "Esta foi a primeira Matriz que vc inseriu: \n" +
                convertPrimeiraMatriz);

        String convertSegundaMatriz = Arrays.deepToString(segundaMatriz);
        JOptionPane.showMessageDialog(null, "Esta foi a segunda Matriz que vc inseriu: \n" +
                convertSegundaMatriz);

        String convertSomaMatriz = Arrays.deepToString(somaDeMatrizes);
        JOptionPane.showMessageDialog(null,
                "E este é o resultado da soma das duas Matrizes que vc inseriu: \n" + convertSomaMatriz);

    }
}