import javax.swing.*;

// Ex. 7 verifica par ou impar
public class Main {
    public static void main(String[] args) {
        int pegaNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero inteiro: "));

        if (pegaNumero % 2 == 0) {
            System.out.printf("\nVocê digitou o número %d. Ele é par.", pegaNumero);

        }else {
            System.out.printf("\nVocê digitou o número %d. Ele é impar.", pegaNumero);
            
        }
    }
}
