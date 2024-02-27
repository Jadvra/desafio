package program;

import salario.Calculos;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculos calc = new Calculos();

        System.out.print("Digite o valor do salário do usuário: ");
        calc.salarioUsuario = sc.nextDouble();

        calc.calcularQuantidadeSalariosMinimos();

        System.out.printf("O usuário ganha %.2f salários mínimos%n", calc.quantidadeSalariosMinimos);

        sc.close();
    }
}
