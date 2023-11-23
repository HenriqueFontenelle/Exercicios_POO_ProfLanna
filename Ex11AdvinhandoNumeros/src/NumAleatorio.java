import java.util.Random;

public class NumAleatorio {

    public static int numeroAleatorio(int min, int max){

        Random rand = new Random();
        int numAleatorio = rand.nextInt((max - min) + 1) + min;

        return numAleatorio;
    }
}
