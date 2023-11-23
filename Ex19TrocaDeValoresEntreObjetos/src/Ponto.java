public class Ponto {
    int x;
    int y;



    public static void interchange(Ponto ponto1, Ponto ponto2) {
        Ponto temp = new Ponto();
        temp.x = ponto1.x;
        temp.y = ponto1.y;

        ponto1.x = ponto2.x;
        ponto1.y = ponto2.y;

        ponto2.x = temp.x;
        ponto2.y = temp.y;

        System.out.println("Valores do Ponto 1 depois da troca: ");
        System.out.println("O valor do x é " + ponto1.x + " e do y é " + ponto1.y + "\n");
        System.out.println("Valores do Ponto 2 depois da troca: ");
        System.out.println("O valor do x é " + ponto2.x + " e do y é " + ponto2.y + "\n");

        return;
    }
}



