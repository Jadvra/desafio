package program;
import media.calculos;

public class application {
    public static void main(String[] args) {
        
        calculos calc = new calculos();

        calc.media1 = calculos.calcularMediaAritmetica(calc.numeros1);
        calc.media2 = calculos.calcularMediaAritmetica(calc.numeros2);

        calc.somaDasMedias = calc.media1 + calc.media2;
        calc.mediaDasMedias = calculos.calcularMediaAritmetica(calc.media1, calc.media2);

        System.out.println("Média dos números 8, 9 e 7: " + calc.media1);
        System.out.println("Média dos números 4, 5 e 6: " + calc.media2);
        System.out.println("Soma das duas médias: " + calc.somaDasMedias);
        System.out.println("Média das médias: " + calc.mediaDasMedias);
    }
}
