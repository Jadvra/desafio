package salario;

public class Calculos {

    public double salarioUsuario;
    public double salarioMinimo = 788.00;
    public double quantidadeSalariosMinimos;

    public void calcularQuantidadeSalariosMinimos() {
        this.quantidadeSalariosMinimos = this.salarioUsuario / this.salarioMinimo;
    }
}
