package ipi;

public class Calculos {

    public double ipi;

    public double codigoPeca1;
    public double valorPeca1;
    public int quantidadePeca1;

    public double codigoPeca2;
    public double valorPeca2;
    public int quantidadePeca2;

    public double valorTotal;

    public void calcularValorTotal() {
        this.valorTotal = (this.valorPeca1 * this.quantidadePeca1 + this.valorPeca2 * this.quantidadePeca2) * (this.ipi / 100 + 1);
    }
}
