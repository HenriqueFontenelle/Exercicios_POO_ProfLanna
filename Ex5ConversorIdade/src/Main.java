import javax.swing.*;

/*
Exercício 5: Conversor de Idade

Peça ao usuário para inserir sua idade em anos. Em seguida, converta essa idade para meses, dias, horas e minutos. Mostre o resultado formatado de maneira clara. Considere um ano com 365 dias.

Exercício 6: Calculadora de IMC (Índice de Massa Corporal)

Peça ao usuário para inserir seu peso em quilogramas e sua altura em metros. Em seguida, calcule o Índice de Massa Corporal (IMC) utilizando a fórmula: IMC = peso / (altura * altura). Exiba o resultado e classifique o usuário de acordo com a tabela de classificação de IMC.

Lembre-se de realizar as conversões de tipos necessárias para garantir que as operações matemáticas sejam feitas corretamente.

Digite seu peso em kg: 70
Digite sua altura em metros: 1.75

Seu IMC é: 22.86
Classificação de IMC: Normal
Instruções condicionais (if, if...else, switch...case())


 */
public class Main {
    public static void main(String[] args) {
        int pegaIdade = Integer.parseInt(JOptionPane.showInputDialog("Informe sua idade: "));

        double pegaPeso = Double.parseDouble(JOptionPane.showInputDialog("Informe seu peso: "));
        double pegaAltura = Double.parseDouble(JOptionPane.showInputDialog("Informe sua altura: "));

        idadeImc.converteIdade(pegaIdade);
        idadeImc.imc(pegaPeso, pegaAltura);
        }
}
