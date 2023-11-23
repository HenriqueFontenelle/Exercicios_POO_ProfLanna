import javax.swing.*;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.*;

//FGA - Faculdade do Gama
        /*
        FGA0158 - Orientação por Objetos
        Exercícios de fixação:
        Entrada e saída
        Resolva os seguintes exercícios utilizando entrada e saída gráfica em Java (uso das classes JOptionPane).
        Exercício 1: Calculadora de Gorjeta
        Crie um programa que solicite ao usuário o valor total de uma conta de restaurante e a porcentagem de gorjeta que deseja deixar. Em seguida, o programa deve calcular o valor da gorjeta e o valor total a ser pago (conta + gorjeta) e exibi-los na tela. Certifique-se de formatar a saída de forma adequada.

        Exemplo de saída:
        Digite o valor total da conta: 50.75
        Digite a porcentagem de gorjeta que deseja deixar (por exemplo, 15 para 15%): 15
        Valor da gorjeta: $7.61
        Total a ser pago: $58.36
        */

public class Main {
    public static void main(String[] args) {
        double conta;
        double gorjeta;
        double total;

        conta = Double.parseDouble(showInputDialog("Qual foi o valor da conta?"));
        System.out.println(conta);

        gorjeta = Double.parseDouble(showInputDialog("O valor da conta foi de R$" + conta +". Qual o percentual deste valor que vc gostaria de deixar a título de Gorjeta: "));
        System.out.println(gorjeta +"%");


        total = ((gorjeta / 100) * conta) + conta;

        DecimalFormat df = new DecimalFormat("#.##");
        String contaFormatada = df.format(conta);
        String gorjetaFormatada = df.format(gorjeta);
        String totalFormatada = df.format(total);

        JOptionPane.showMessageDialog(null, "O valor total da conta foi: R$ " + contaFormatada + "." +
                "\n" + "O percentual escolhido para a gorjeta foi de " + gorjetaFormatada + "%.\n" + "O valor total a ser pago é: R$ " + totalFormatada + ".");



    }


}