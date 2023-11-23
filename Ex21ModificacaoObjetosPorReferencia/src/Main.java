/*
Exercício 21: Modificação de Objetos através de Referências

Crie uma classe ContaBancaria com o atributo saldo. Em seguida, crie um método na classe principal que
aceita um objeto do tipo ContaBancaria como parâmetro e realiza uma operação de depósito nessa conta.
Demonstre a modificação do saldo no programa principal.
 */

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.saldo = 300.0;

        double deposito = 300.0;
        conta.saldo(deposito);

        System.out.println(conta.saldo);
    }
}