import java.util.Arrays;

public class printMatrizes {
    public static void printMatrix(int mat[][])
    {
        //imprime todas as colunas
        for (int[] row : mat)

            System.out.println(Arrays.toString(row));
    }
}

