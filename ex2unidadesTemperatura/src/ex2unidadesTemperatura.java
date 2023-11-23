/*
Exercício 2: Conversor de Unidades de Temperatura

        Crie um programa que permita ao usuário converter uma temperatura de graus Celsius para graus Fahrenheit ou vice-versa.
        O programa deve perguntar ao usuário qual tipo de conversão deseja realizar, solicitar a temperatura e,
        em seguida, mostrar o resultado. Use as fórmulas de conversão apropriadas.

        Exemplo de saída:

        Escolha o tipo de conversão:
        1. Celsius para Fahrenheit
        2. Fahrenheit para Celsius
        Opção: 1

        Digite a temperatura em graus Celsius: 25
        Resultado em graus Fahrenheit: 77.0
*/


import javax.swing.*;

import java.text.DecimalFormat;

import static javax.swing.JOptionPane.showMessageDialog;

public class ex2unidadesTemperatura {
    static double celsiusToFahrenheit() {
        double celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em Celsius a ser convertido para Fahrenheit: "));

        double fahrenheit = (celsius * 1.8) + 32;

        DecimalFormat df = new DecimalFormat("#,###.0");
        String fahrenheitFormatada = df.format(fahrenheit);

        JOptionPane.showMessageDialog(null, "O valor referente em fahrenheit é: "+ fahrenheitFormatada + "°F.");

        return fahrenheit;

    }

    static double fahrenheitToCelsius() {
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em fahrenheit a ser convertido para Celsius: "));

        double celsius = (fahrenheit - 32) / 1.8;
        DecimalFormat df = new DecimalFormat("#,###.0");
        String celsiusFormatada = df.format(celsius);

        JOptionPane.showMessageDialog(null, "O valor referente em Celsius é: "+ celsiusFormatada + "°C.");

        return celsius;
    }


    public static void main(String[] args) {
        int tipoConversao;

        double celsius;
        double fahrenheit;


        tipoConversao = Integer.parseInt(JOptionPane.showInputDialog("Qual o tipo de conversão desejada: \n" +
                "1. Celsius para Fahrenheit; \n" +
                "2. Fahrenheit para Celsius. \n" +
                "Obs.: Qualquer número / caracter diferente de '1' ou '2' será inválido."));



        if (tipoConversao == 1) {
            celsiusToFahrenheit();

        } else if (tipoConversao == 2){
            fahrenheitToCelsius();
        } else {
            JOptionPane.showMessageDialog(null, "DADOS DE ENTRADA INVÁLIDOS.\n" +
                    "Você precisa digitar '1' para Celsius ou '2' - para Fahreinheit");
        }

    }

}
