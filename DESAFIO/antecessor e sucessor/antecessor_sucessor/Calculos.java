package antecessor_sucessor;

public class Calculos {

    private int numero;
    private int antecessor;
    private int sucessor;

    public int calcularAntecessor() {
        return numero - 1;
    }

    public int calcularSucessor() {
        return numero + 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
