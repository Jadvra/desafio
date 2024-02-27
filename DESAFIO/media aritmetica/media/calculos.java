package media;

public class calculos {

    public double[] numeros1 = {8, 9, 7};
    public double[] numeros2 = {4, 5, 6};

    public double media1;
    public double media2;

    public double somaDasMedias;
    public double mediaDasMedias;

    public static double calcularMediaAritmetica(double... numeros) {
        double soma = 0;

        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.length;
    }
}
