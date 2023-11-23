import javax.annotation.processing.Filer;
import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Main {


    public static <StatefulBeanToCsv> void main(String[] args) throws IOException {



            ArrayList<String> list = new ArrayList<String>();
            BufferedReader br = new BufferedReader(new FileReader("tarefas.txt"));
            StringBuilder sb = new StringBuilder();
            String line = "";

            JOptionPane.showMessageDialog(null, "Escolha uma Tarefa que deseja alterar ou deletar: ");

            CsvTarefas.listaTarefas();

            String escolheTarefa = JOptionPane.showInputDialog("Digite abaixo o ID da tarefa Escolhida: ");

            while ((line = br.readLine()) != null) {

                if (line.startsWith(escolheTarefa)) {
                    list.add(line);

                }
            }
            String alterarOuDeletar = JOptionPane.showInputDialog("A tarefa escolhida foi: \n\n" +
                    list.get(0) + "\n\nO que deseja fazer com esta tarefa: \n" +
                    "escreva 'alterar' para alterar o percentual;\n"+
                    "ou 'deletar' para deletar a tarefa'?");

            if (Objects.equals(alterarOuDeletar, "deletar")) {
                String text = Files.readString(Paths.get("tarefas.txt"));

                text = text.replaceAll(escolheTarefa + ".*", "");
                FileWriter tarefaRecord = new FileWriter("tarefas.txt", true);

                // Creates a BufferedWriter
                BufferedWriter output = new BufferedWriter(tarefaRecord);

                output.write(text);
                output.newLine();

                System.out.println(text);

                try (PrintStream out = new PrintStream(new FileOutputStream("tarefas.txt"))) {
                    out.print(text.replaceAll("(?m)^[ \t]*\r?\n", ""));
                }
            } else if (Objects.equals(alterarOuDeletar, "alterar")){


                String text = Files.readString(Paths.get("tarefas.txt"));

                String newDesc = JOptionPane.showInputDialog("Qual é a descrição da Tarefa? ");

                int percentualNovoDeRealizacaoTarefa = Integer.parseInt(JOptionPane.showInputDialog("Qual o novo percentual de Realização da Tarefa de ID " + escolheTarefa));

                System.out.println(text);
                System.out.println(escolheTarefa);



                //String pegaIdTarefa = String.valueOf(text.startsWith(escolheTarefa + ));
                //System.out.println(pegaIdTarefa);
                //text = text.replaceAll(^(escolheTarefa.*", "");

                //String encontrarParte = String.valueOf(text.startsWith(escolheTarefa));
                //System.out.println(encontrarParte);

                /*

                encontrarParte = encontrarParte.replaceAll("[^,]*.%", String.valueOf(" " + percentualNovoDeRealizacaoTarefa +"%"));
                System.out.println(encontrarParte);

                //text = text.replaceAll(escolheTarefa + ".*", escolheTarefa + ", ");
                FileWriter tarefaRecord = new FileWriter("tarefas.txt", true);

                // Creates a BufferedWriter
                BufferedWriter output = new BufferedWriter(tarefaRecord);

                output.write(text);
                output.newLine();

                System.out.println(text);

                //try (PrintStream out = new PrintStream(new FileOutputStream("tarefas.txt"))) {
                  //  out.print(text.replaceAll("(?m)^[ \t]*\r?\n", ""));
                }

                 */

                String filepath = "tarefas.txt";
                String newID = escolheTarefa;
                String newDescricao = newDesc;
                String newRealizacao = String.valueOf(percentualNovoDeRealizacaoTarefa);

                CsvTarefas.editRecord(filepath, newID, newDescricao, newRealizacao);



            }


        CsvTarefas.listaTarefas();
        CsvTarefas.listaTarefas();
        CsvTarefas.cadastraTarefa();
        CsvTarefas.limpaLista();

    }


}





