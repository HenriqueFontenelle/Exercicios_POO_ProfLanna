/*
Exercício 13: Soma de Vetores

Crie um programa que realiza a soma de dois vetores de inteiros.
Os vetores devem ter o mesmo tamanho e serem fornecidos pelo usuário.
O programa deve calcular a soma elemento a elemento e exibir o vetor resultante.

Exemplo:

Digite o tamanho dos vetores: 4
Digite os elementos do primeiro vetor:
1
3
5
7
Digite os elementos do segundo vetor:
2
4
6
8
A soma dos vetores é: [3, 7, 11, 15]
Exercício 14: Produto Escalar

Desenvolva um programa que calcula o produto escalar entre dois vetores de números reais. Os vetores devem ter o mesmo tamanho e serem inseridos pelo usuário. O produto escalar é obtido multiplicando elemento por elemento e somando os resultados.

Exemplo:

Digite o tamanho dos vetores: 3
Digite os elementos do primeiro vetor:
2.5
3.0
1.5
Digite os elementos do segundo vetor:
1.0
2.0
3.0
O produto escalar dos vetores é: 13
 */

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        int tamVetor;


        tamVetor = Integer.parseInt(JOptionPane.showInputDialog("Quantas posições terá os seus vetores: "));

        double[] vetor1 = new double[tamVetor];
        double[] vetor2 = new double[tamVetor];
        double[] somaVetores = new double[tamVetor];
        double produtoEscVetores = 0;

        for (int i = 0; i < tamVetor; i++) {
            double pegaValor = Double.parseDouble(JOptionPane.showInputDialog("Atribua um valor para a " +
                    (i + 1) + "ª posição do 1º vetor:"));
            vetor1[i] = pegaValor;
        }
        for (int i = 0; i < tamVetor; i++) {
            double pegaValor = Double.parseDouble(JOptionPane.showInputDialog("Atribua um valor para a " +
                    (i + 1) + "ª posição do 2º vetor:"));
            vetor2[i] = pegaValor;
        }
        for (int i = 0; i < tamVetor; i++) {
            System.out.println((i + 1) + " posição do primeiro vetor " + vetor1[i] + " || " +
                    (i + 1) + " posição do segundo vetor " + vetor2[i]);
        }
        for (int i = 0; i < tamVetor; i++) {
            somaVetores[i] = vetor1[i] + vetor2[i];
            produtoEscVetores = produtoEscVetores + (vetor1[i] * vetor2[i]);
        }

        System.out.print("A soma dos vetores é : ");

        for (int i = 0; i < tamVetor; i++) {
            if (i == 0) {
                System.out.print("[");
            }
            System.out.print(somaVetores[i]);
            if (i != (tamVetor - 1)) {
                System.out.print(", ");
            } else {
                System.out.print("]\n");
            }
        }
        System.out.printf("O produto escalar entre os dois vetores é: %.2f", produtoEscVetores);
    }
}