package reajuste;

public class Calculos {

    public double saldo;
    public double saldoReajustado;
    
    public void calcularReajuste() {
        double taxaDeReajuste = 0.01;
        this.saldoReajustado = this.saldo * (1 + taxaDeReajuste);
    }
}
