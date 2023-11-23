import java.util.Arrays;

public class printMatrizes {
    public static void printMatrix(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            System.out.println(Arrays.toString(row));
    }
}
