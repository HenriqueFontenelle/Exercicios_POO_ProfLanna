import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class CsvTarefas {
    public static int iD;
    public static String descricao;
    public static int realizacao;

    public static int aleatorio() {

            Random randomNumber = new Random();
            int number = randomNumber.nextInt(999);
            return number;
            //System.out.println(number);
    }


    public CsvTarefas(Writer writer) {
    }

    public static int getiD(int posicao) {

        return iD;
    }

    public void setiD(int iD) {
        this.iD = iD;
    }

    public static String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static int getRealizacao() {
        return realizacao;
    }

    public void setRealizacao(int realizacao) {
        this.realizacao = realizacao;
    }

    public CsvTarefas(int iD, String descricao, int realizacao){
        this.iD = Integer.parseInt(String.valueOf(iD));
        this.descricao = descricao;
        this.realizacao = realizacao;
    }

    public static void cadastraTarefa() throws IOException {
        String continua;
        do {

            //String identifier = JOptionPane.showInputDialog("Atribua um nome ou um número à sua nova tarefa: ");

            String descricao = JOptionPane.showInputDialog("Faça uma breve descrição da sua tarefa: ");

            int realizacao = Integer.parseInt(JOptionPane.showInputDialog("De 0 a 100, qual a porcentarem de realização da sua tarefa: (digite apenas o escolhido entre 0 a 100"));

            List<CsvTarefas> tarefas = new ArrayList<CsvTarefas>();

            tarefas.add(new CsvTarefas(CsvTarefas.aleatorio(), descricao, realizacao));

            String taskProc = (CsvTarefas.getiD(CsvTarefas.aleatorio()) + ", " +
                    CsvTarefas.getDescricao() + ", " +
                    CsvTarefas.getRealizacao() + "% realizado(s)");


            BufferedWriter br = new BufferedWriter(new FileWriter("tarefas", true));

            try {
                // Creates a FileWriter
                FileWriter tarefaRecord = new FileWriter("tarefas.txt", true);

                // Creates a BufferedWriter
                BufferedWriter output = new BufferedWriter(tarefaRecord);

                output.write(taskProc);
                output.newLine();

                output.flush();

                // Closes the writer
                output.close();


            } catch (Exception e) {
                e.getStackTrace();
            }
            continua = JOptionPane.showInputDialog("Gostaria de cadastrar mais alguma tarefa? sim ou nao?");
        } while (Objects.equals(continua, "sim"));
    }

    public static void listaTarefas() {
        try (BufferedReader br = new BufferedReader(new FileReader("tarefas.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void limpaLista() {
        PrintWriter writer = null;
        try {
            writer = new PrintWriter("tarefas.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        writer.print("");
        writer.close();
    }


    public static <exception> void editRecord(String filepath, String newID, String newDescricao, String newRealizacao){
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        String iD = ""; String descricao = ""; String realizacao = "";

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while(x.hasNext()){
                iD = x.next();
                descricao = x.next();
                realizacao = x.next();
                if(iD.equals(newID)){
                    pw.println(newID + ", " + newDescricao + ", " + newRealizacao);
                }
                else
                {
                    pw.println(iD + ", " + descricao + ", " + realizacao);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        }
        catch(Exception e) {
            System.out.println("Error");
        }

    }



}
