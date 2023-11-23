import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String word = JOptionPane.showInputDialog("Digite uma palavra: ");

        char[] arr = new char[word.length()];
        char[] rev  = new char[word.length()];


        for (int i = 0; i < word.length(); i++){
            arr[i] = word.charAt(i);
        }

        for(int i = 0; i < arr.length; i++) {
            // Swapping the elements
            int j = arr[i];
            rev[i] = arr[arr.length - i - 1];
            rev[arr.length - i - 1] = (char) j;
        }
        for (char x : arr) {
            System.out.print(x);
        }
        System.out.println("\n");
        for (char x : rev) {
            System.out.print(x);
        }

        if(Arrays.equals(arr, rev)) {
            System.out.println("\n\nA palavra analisada é um Palíndromo.");
            JOptionPane.showMessageDialog(null,"A palavra analisada é um Palíndromo.");
        } else {
            System.out.println("\n\nA palavra analisada não é um Palíndromo.");
            JOptionPane.showMessageDialog(null,"A palavra analisada não é um Palíndromo.");
        }
    }
}