import javax.swing.*;

/*
Exercício 9: Classificação de Média Ponderada

Solicite ao usuário para inserir as três notas e seus respectivos pesos.
Utilize uma estrutura if-else para atribuir uma classificação com base na seguinte escala:

Média ponderada de 9.0 a 10.0: A
Média ponderada de 8.0 a 8.9: B
Média ponderada de 7.0 a 7.9: C
Média ponderada de 6.0 a 6.9: D
Média ponderada abaixo de 6.0: F
Imprima a classificação correspondente.

 */
public class Main {
    public static void main(String[] args) {

        int i = 0;
        double calculonotasePesos;
        double notasePesos = 0;
        int somaPesos = 0;
        double notaFinal;

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

        for(i = 0; i < notas.length; i ++) {
            calculonotasePesos = notas[i] * pesos[i];
            notasePesos = notasePesos + calculonotasePesos;
            somaPesos = somaPesos + pesos[i];
        }
        notaFinal = notasePesos/somaPesos;


        for(cont = 0; cont < notas.length; cont++) {
            System.out.println(" A nota da " + (cont+1) + "ª prova foi " + notas[cont] + "; e tem peso " + pesos[cont] + ".");
        }



        if(notaFinal >= 9.0 && notaFinal <= 10.0){
            System.out.println(" A média ponderada é " + notaFinal +", que corresponde à classificação A.");
            JOptionPane.showMessageDialog(null," A média ponderada é " + notaFinal +", " +
                    "que corresponde à classificação A.");
            return;

        }
        else if(notaFinal >= 8.0 && notaFinal <= 8.9){
            System.out.println(" A média ponderada é " + notaFinal +", que corresponde à classificação B.");
            JOptionPane.showMessageDialog(null," A média ponderada é " + notaFinal +", " +
                    "que corresponde à classificação B.");
            return;
        }
        else if(notaFinal >= 7.0 && notaFinal <= 7.9){
            System.out.println(" A média ponderada é " + notaFinal +", que corresponde à classificação C.");
            JOptionPane.showMessageDialog(null," A média ponderada é " + notaFinal +", " +
                    "que corresponde à classificação C.");
            return;
        }
        else if(notaFinal >= 6.0 && notaFinal <= 6.9){
            System.out.println(" A média ponderada é " + notaFinal +", que corresponde à classificação D.");
            JOptionPane.showMessageDialog(null," A média ponderada é " + notaFinal +", " +
                    "que corresponde à classificação D.");
            return;
        }
        else if(notaFinal < 6.0) {
            System.out.println(" A média ponderada é " + notaFinal + ", que corresponde à classificação E.");
            JOptionPane.showMessageDialog(null," A média ponderada é " + notaFinal +", " +
                    "que corresponde à classificação E.");
            return;
        }

    }
}