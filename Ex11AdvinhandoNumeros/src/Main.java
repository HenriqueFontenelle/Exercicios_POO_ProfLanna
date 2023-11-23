import javax.swing.*;

/*
 Exercício 11: Advinhando Números com do...while

Desenvolva um jogo simples em que o computador escolhe um número aleatório entre 1 e 10, e o
jogador deve adivinhar o número. Use uma estrutura de repetição do...while para permitir que o jogador
continue adivinhando até acertar. Forneça feedback sobre se a tentativa está correta ou se o jogador deve
tentar novamente.
 */

public class Main {
    public static void main(String[] args) {
        int pegaChute = 0;
        int numeroAleatorio = NumAleatorio.numeroAleatorio(1, 10);
        System.out.println(numeroAleatorio);

        int tentativa = 1;
        while (pegaChute != numeroAleatorio) {

            pegaChute = Integer.parseInt(JOptionPane.showInputDialog("Tente a adivinhar o número entre 0 e 10: "));

            System.out.println("Tentativa " + tentativa + ": " + pegaChute);
            if(numeroAleatorio > pegaChute){
                System.out.println("Tente novamente. Dica: o número é maior.");
                JOptionPane.showMessageDialog(null,"Tente novamente. Dica: o número é maior.");


            }
            if (numeroAleatorio < pegaChute) {
                System.out.println("Tente novamente. Dica: o número é maior.");
                JOptionPane.showMessageDialog(null, "Tente novamente. Dica: o número é maior.");

            }
            tentativa++;
        }
        System.out.println("Parabéns! Você acertou. O número é " + pegaChute);
        JOptionPane.showMessageDialog(null, "Parabéns! Você acertou. O número é " + pegaChute);
    }
}