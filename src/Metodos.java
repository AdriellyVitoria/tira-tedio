public class Metodos {
    public double somar;
    public double numero;
    public String sinal;
    
    public double resultado(String sinal){

        double total = somar + numero;
        System.out.println(total);
        return total;
    }
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getSomar() {
        return somar;
    }

    public void setSomar(double somar) {
        this.somar = somar;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }
}
