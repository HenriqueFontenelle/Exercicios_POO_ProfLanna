import javax.swing.*;
import java.text.DecimalFormat;

/*
Exercício 8: Calculadora Simples com Switch-Case

Desenvolva um programa que realiza operações básicas de uma calculadora (adição, subtração, multiplicação e divisão).
Peça ao usuário para inserir dois números e escolher a operação desejada usando uma estrutura switch-case.
Execute a operação escolhida e imprima o resultado.

Digite o primeiro número: 10
Digite o segundo número: 5
Escolha a operação:
1. Adição
2. Subtração
3. Multiplicação
4. Divisão
Opção: 3
Resultado: 50
 */
public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Esta é uma Calculadora Simples. \n" +
                "Primeiramente, quando lhe for perguntado, \n" +
                "você entrará com o primeiro número, \n" +
                "depois com o segundo número e \n" +
                "então escolherá a operação matemática a ser realizada entre eles. \n" +
                "Vamos lá!");

        double primeiroNumero, segundoNumero, resultado;
        int operacao;


        primeiroNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro número da Operação Matemática: "));
        segundoNumero = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo número da Operação Matemática: "));
        operacao = Integer.parseInt(JOptionPane.showInputDialog(null, "Esolha um número referente à Operação a ser realizada entre os dois " +
                "números: \n" +
                "1. Adição;\n" +
                "2. Subtração;\n" +
                "3. Multiplicação;\n" +
                "4. Divisão"));

        switch (operacao) {
            case 1:
                resultado = primeiroNumero + segundoNumero;
                break;
            case 2:
                resultado = primeiroNumero - segundoNumero;
                break;
            case 3:
                resultado = primeiroNumero * segundoNumero;
                break;
            case 4:
                resultado = primeiroNumero / segundoNumero;
                break;
            default:
                resultado = Double.parseDouble((String)"Entrada Inválida.");
                break;
        }
        DecimalFormat df = new DecimalFormat("#.##");
        String resultadoFormatted = df.format(resultado);
        JOptionPane.showMessageDialog(null, "O resultado é "+ resultadoFormatted);

    }
}