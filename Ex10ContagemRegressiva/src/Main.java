import javax.swing.*;

/* Crie um programa que use uma estrutura de repetição while para realizar uma contagem regressiva apartir de um número
fornecido pelo usuário até 1. Imprima cada número durante a contagem.
 */
public class Main {
    public static void main(String[] args) {
        int pegaNumero  = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        while (pegaNumero > 0) {
            System.out.println(pegaNumero);
            pegaNumero--;
        }
    }
}