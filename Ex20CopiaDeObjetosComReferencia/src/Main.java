/*
Exercício 20: Cópia de Objetos com Referência

Crie uma classe Aluno com os atributos nome e nota.
Em seguida, crie um método na classe principal que aceita um objeto do tipo Aluno como
parâmetro e cria uma cópia desse objeto. Modifique a cópia e demonstre que a modificação
não afeta o objeto original.

 */

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Henrique", 10);
        Aluno a2 = null;
        try {
            a2 = (Aluno) a1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println("Nome original: " + a1.getNome());

        System.out.println("Nome clonado: " + a2.getNome());

        //Abaixo está a prova de que estão em lugares diferentes da memória.
        System.out.println(a1);
        System.out.println(a2);
        }

}