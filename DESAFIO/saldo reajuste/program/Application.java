package program;

import reajuste.Calculos;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Calculos calc = new Calculos();

        System.out.print("Digite o saldo atual: ");
        calc.saldo = sc.nextDouble();

        calc.calcularReajuste();
        
        System.out.println("Saldo com reajuste de 1%: " + calc.saldoReajustado);

        sc.close();
    }
}
