package program;

import antecessor_sucessor.Calculos;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculos calc = new Calculos();

        System.out.print("Digite um número inteiro: ");
        calc.setNumero(sc.nextInt());

        System.out.println("O antecessor de " + calc.getNumero() + " é: " + calc.calcularAntecessor());
        System.out.println("O sucessor de " + calc.getNumero() + " é: " + calc.calcularSucessor());

        sc.close();
    }
}
