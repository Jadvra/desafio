package program;
import idade.calculos;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        calculos calc = new calculos();

        System.out.print("Digite a idade em anos: ");
        calc.anos = sc.nextInt();

        System.out.print("Digite a idade em meses: ");
        calc.meses = sc.nextInt();

        System.out.print("Digite a idade em dias: ");
        calc.dias = sc.nextInt();

        calc.calcularIdadeEmDias();

        System.out.println("A idade em dias é: " + calc.idadeEmDias + " dias");

        sc.close();
    }
}
