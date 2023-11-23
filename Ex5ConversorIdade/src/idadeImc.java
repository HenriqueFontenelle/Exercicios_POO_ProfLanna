import javax.swing.*;
import java.util.Calendar;

public class idadeImc {
    public static void converteIdade(int idade) {

        int ano = 365;
        int mes = 12;
        int meses = idade * 12;
        int dias = idade * ano;
        int horas = idade * 24 * 365;
        int minutos = idade * 60 * 24 * 365;
        int segundos = (int) (idade * Math.pow(60,2) * 24 * 365);
        System.out.println("Meu amigo, o que você tem feito da sua vida? \n" +
                        "É melhor se preocupar, pois você já viveu o equivalente a: \n" +
                idade + " anos; \n" +
                meses + " meses; \n" +
                dias + " dias; \n" +
                horas + " horas; \n" +
                minutos + " minutos; \n" +
                segundos + " segundos. \n" +
                "******************************* \n" +
                        "O TEMPO É AGORA!\n" +
                        "*******************************" );
    }

    public static void imc(double peso, double altura){
        double imc = peso / Math.pow(altura,2);
        double pesoIdeal = 27 * Math.pow(altura,2);
        System.out.printf("O seu peso é de %.2f kg; a sua altura é de %.2f metros e o seu IMC é de %.2f.\n" +
                        "Tente manter o seu peso por volta de %.2f kg\n", peso, altura,
                imc, pesoIdeal);
        if (imc >= 18.5 && imc <= 24.9){
            System.out.println("Você está com o peso normal. Mantenha-se assim.");
            return;
        }
        else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Você está com Sobrepeso. Ainda é fácil de perder. É só começar.");
            return;
        }
        else if (imc >= 30.0 && imc <= 39.9){
            System.out.println("Você está classificado com Obesidade. Procure um médico.");
            return;
        } else {
            System.out.println("Você está com sério problema de Obesidade Grave.");
            return;
        }

    }
}
