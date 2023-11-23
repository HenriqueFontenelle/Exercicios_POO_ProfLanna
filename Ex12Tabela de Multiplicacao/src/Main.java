import javax.swing.*;

/*
Exercício 12: Tabela de Multiplicação com for

Crie um programa que utilize uma estrutura de repetição for para gerar a tabela de multiplicação
de um número fornecido pelo usuário. A tabela deve ser exibida de 1 a 10.

Exemplo:

Digite um número para a tabela de multiplicação: 7
Tabela de multiplicação para 7:
1 x 7 = 7
2 x 7 = 14
...
10 x 7 = 70
 */

public class Main {
    public static void main(String[] args) {

        int pegaNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação: "));

        for(int i = 1; i <= 10; i++) {
            int resultMultiplicacao = i * pegaNumero;
            System.out.printf(" %d x %d = %d \n", i, pegaNumero, resultMultiplicacao);
        }
    }
}