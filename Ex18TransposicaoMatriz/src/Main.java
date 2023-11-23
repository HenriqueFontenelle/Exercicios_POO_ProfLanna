import javax.swing.*;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Este algoritmo recebe uma matriz e faz a sua transposição." );

        int linhasMatriz = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de linhas para a " +
                "Matriz: "));
        int colunasMatriz = Integer.parseInt(JOptionPane.showInputDialog("Defina a quantidade de colunas para a " +
                "Matriz: "));



        int[][] matriz = new int[linhasMatriz][colunasMatriz];
        int[][] matrizTransposta = new int[colunasMatriz][linhasMatriz];


        JOptionPane.showMessageDialog(null, "Vamos preencher a Matriz: ");

        for (int i = 0; i < linhasMatriz; i++) {
            for (int j = 0; j < colunasMatriz; j++) {
                matriz[i][j] =
                        Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para a posição " +
                                +i + j + " da Matriz: "));
            }
        }



        for(int i = 0; i < colunasMatriz; i++){
            for(int j = 0; j < linhasMatriz; j++) {
                matrizTransposta[i][j] = matriz[j][i];
                //System.out.println(multiplicacaoDeMatrizes[i][j]);
            }
        }

        printMatrizes.printMatrix(matriz);
        System.out.println("\n");
        printMatrizes.printMatrix(matrizTransposta);
        System.out.println("\n");


        String convertMatriz = Arrays.deepToString(matriz);
        JOptionPane.showMessageDialog(null, "Esta foi a Matriz que vc inseriu: \n" +
                convertMatriz);

        String convertTransposta = Arrays.deepToString(matrizTransposta);
        JOptionPane.showMessageDialog(null, "Esta é a Matriz Transposta: \n" +
                convertTransposta);


    }
}
