public class Banco {
    private double saldo;
    public Banco() {
        this.saldo = 100;
    }
    public double depositaNaConta(double depositar){
       double conta = saldo += depositar;
       return conta;
    }
    public double sacarDinheiro(double sacar) {
        if (sacar > saldo) {
            System.out.println("Saldo indiponivel " + getSaldo());
        } else {
            double conta = saldo -= sacar;
            System.out.println("Saque de " + sacar + " Saldo disponivel " + getSaldo());
        }
        return getSaldo();
    }
    public double getSaldo() {
        return saldo;
    }
}
