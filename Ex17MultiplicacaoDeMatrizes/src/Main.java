import javax.swing.*;
import java.util.Arrays;

/*
Exercício 17: Multiplicação de Matrizes

Desenvolva um programa que realiza a multiplicação de duas matrizes.
A primeira matriz deve ter o número de colunas igual ao número de linhas da segunda matriz.
As matrizes devem ser fornecidas pelo usuário.

Exemplo:

Digite o número de linhas da primeira matriz: 2
Digite o número de colunas da primeira matriz: 3

Digite os elementos da primeira matriz:
1 2 3
4 5 6

Digite o número de linhas da segunda matriz: 3
Digite o número de colunas da segunda matriz: 2

Digite os elementos da segunda matriz:
7 8
9 10
11 12

A multiplicação das matrizes é:
58 64
139 154
 */


public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este algoritmo Multiplica Duas Matrizes. É necessário que o número de " +
                "colunas da primeira Matriz seja igual ao número de linhas da segunda. " +
                "Vamos começar!");

        int linhasMatriz1 = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de linhas para a " +
                " Primeira Matrizes: "));
        int colunasMatri1 = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de colunas para a " +
                "Primeira Matriz: "));

        JOptionPane.showMessageDialog(null, "A quantidade de Linhas da Segunda Matriz será igual à" +
                "quantidade de Colunas da Primeira Matriz, ou seja, " + colunasMatri1 + "colunas.");

        int linhasMatriz2 = colunasMatri1;

        int colunasMatriz2 = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de colunas para a " +
                " Segunda Matriz: "));


        int[][] primeiraMatriz = new int[linhasMatriz1][colunasMatri1];
        int[][] segundaMatriz = new int[linhasMatriz2][colunasMatriz2];
        int[][] multiplicacaoDeMatrizes = new int[linhasMatriz1][colunasMatriz2];

        JOptionPane.showMessageDialog(null, "Vamos preencher a Primeira matriz: ");

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatri1; j++) {
                primeiraMatriz[i][j] =
                        Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " +
                                +i + j + " da " + "Primeira" + " Matriz: "));
            }
        }

        JOptionPane.showMessageDialog(null, "Vamos preencher a Segunda matriz: ");

        for (int i = 0; i < linhasMatriz2; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                segundaMatriz[i][j] =
                        Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " +
                                +i + j + " da " + "Segunda " + " Matriz: "));
            }
        }

        for(int i = 0; i < linhasMatriz1; i++){
            for(int j = 0; j < colunasMatriz2; j++) {
                for (int k = 0; k < linhasMatriz2; k++) {
                    multiplicacaoDeMatrizes[i][j] += primeiraMatriz[i][k] * segundaMatriz[k][j];
                    //System.out.println(multiplicacaoDeMatrizes[i][j]);
                }
            }
        }

        // printMatrizes.printMatrix(primeiraMatriz);
        //System.out.println("\n");
        //printMatrizes.printMatrix(segundaMatriz);
        //System.out.println("\n");
        //printMatrizes.printMatrix(multiplicacaoDeMatrizes);

        String convertPrimeiraMatriz = Arrays.deepToString(primeiraMatriz);
        JOptionPane.showMessageDialog(null, "Esta foi a primeira Matriz que vc inseriu: \n" +
                convertPrimeiraMatriz);

        String convertSegundaMatriz = Arrays.deepToString(segundaMatriz);
        JOptionPane.showMessageDialog(null, "Esta foi a segunda Matriz que vc inseriu: \n" +
                convertSegundaMatriz);

        String convertMultiplicaMatriz = Arrays.deepToString(multiplicacaoDeMatrizes);
        JOptionPane.showMessageDialog(null,
                "E este é o resultado da multiplicação das duas Matrizes que vc inseriu: \n" + convertMultiplicaMatriz);

    }
}

