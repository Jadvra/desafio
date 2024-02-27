package program;

import ipi.Calculos;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculos calc = new Calculos();

        System.out.print("Digite a porcentagem do IPI a ser acrescido: ");
        calc.ipi = sc.nextDouble();

        System.out.print("Digite o código da peça 1: ");
        calc.codigoPeca1 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 1: ");
        calc.valorPeca1 = sc.nextDouble();
        System.out.print("Digite a quantidade de peças 1: ");
        calc.quantidadePeca1 = sc.nextInt();

        System.out.print("Digite o código da peça 2: ");
        calc.codigoPeca2 = sc.nextInt();
        System.out.print("Digite o valor unitário da peça 2: ");
        calc.valorPeca2 = sc.nextDouble();
        System.out.print("Digite a quantidade de peças 2: ");
        calc.quantidadePeca2 = sc.nextInt();

        calc.calcularValorTotal();

        System.out.println("O valor total a ser pago é: " + calc.valorTotal);

        sc.close();
    }
}
