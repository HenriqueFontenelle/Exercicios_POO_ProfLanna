public class ContaBancaria {
    static double saldo;

    public double deposita(double deposito) {
        this.saldo = this.saldo + deposito;
        return this.saldo;
    }

}
