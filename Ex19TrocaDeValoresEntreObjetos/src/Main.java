import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Ponto ponto1 = new Ponto();
        ponto1.x = Integer.parseInt(JOptionPane.showInputDialog("Atribua um valor a x do Ponto 1: "));
        ponto1.y = Integer.parseInt(JOptionPane.showInputDialog("Atribua um valor a y do Ponto 1: "));

        Ponto ponto2 = new Ponto();
        ponto2.x = Integer.parseInt(JOptionPane.showInputDialog("Atribua um valor a x do Ponto 2: "));
        ponto2.y = Integer.parseInt(JOptionPane.showInputDialog("Atribua um valor a y do Ponto 2: "));

        System.out.println("Valores do Ponto 1 antes da troca: ");
        System.out.println("O valor do x é " + ponto1.x + " e do y é " + ponto1.y + "\n");
        System.out.println("Valores do Ponto 2 antes da troca: ");
        System.out.println("O valor do x é " + ponto2.x + " e do y é " + ponto2.y+ "\n");

        System.out.println("depois da troca: ");

        Ponto.interchange(ponto1, ponto2);

    }

}








