import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class TestaAleatorio {
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> iD = new ArrayList<>();
        ArrayList<String> desc = new ArrayList<>();
        ArrayList<Integer> realiza = new ArrayList<>();

        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader("tarefas.txt"));
            String line = reader.readLine();

            while (line != null && !line.isEmpty()) {


                String[] lineParts = line.split("\\$");
                iD.add(Integer.valueOf(lineParts[0]));

                desc.add(lineParts[1]);

                realiza.add(Integer.valueOf(String.valueOf(Integer.valueOf(lineParts[2]))));

                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(iD);
        System.out.println(desc);
        System.out.println(realiza);


        //System.out.println(inicioAte);



        }
    }



