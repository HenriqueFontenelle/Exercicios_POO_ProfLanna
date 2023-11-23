import javax.swing.*;

//Exercício 4: Calculadora de Média Ponderada
//Peça ao usuário para inserir as notas de três disciplinas (cada nota de 0 a 10) e os pesos correspondentes de cada
// disciplina. Em seguida, calcule e exiba a média ponderada das notas. Certifique-se de que as notas e pesos sejam
// armazenados como números decimais.
public class Main {
    public static void main(String[] args) {
        double[] notas = new double[3];
        int[] pesos = new int[3];

        int cont = 0;

        int peso = 10;
        for(cont = 0; cont < notas.length; cont ++) {
            double pegaNota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota de 0,0 a 10,0 da "
                    + (cont + 1) + "ª prova:"));
                    notas[cont] = pegaNota;

            if (cont < 2) {
                int pegaPeso = Integer.parseInt(JOptionPane.showInputDialog("Atribua o peso de 0 a "+ peso +" à " + (cont + 1) + "ª nota:"));
                    pesos[cont] = pegaPeso;
                    peso = peso - pegaPeso;
                //System.out.println(peso);
            } else {
                    pesos[notas.length - 1] = 10 - (pesos[0] + pesos[1]);

            }
        }

        int i = 0;
        double calculonotasePesos;
        double notasePesos = 0;
        int somaPesos = 0;
        double notaFinal;

        for(i = 0; i < notas.length; i ++) {
            calculonotasePesos = notas[i] * pesos[i];
            notasePesos = notasePesos + calculonotasePesos;
            somaPesos = somaPesos + pesos[i];
        }
        notaFinal = notasePesos/somaPesos;


        for(cont = 0; cont < notas.length; cont++) {
            System.out.println(" A nota da " + (cont+1) + "ª prova foi " + notas[cont] + "; e tem peso " + pesos[cont] + ".");
        }
        System.out.println(" A média ponderada é " + notaFinal);
    }
}