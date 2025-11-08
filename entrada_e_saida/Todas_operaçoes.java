
import java.util.Scanner;

public class Exercicio_02 {
    public static void main(String[] args) {
        Scanner calculo = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        double n1 = calculo.nextDouble();

        System.out.println("Digite outro numero: ");
        double n2 = calculo.nextDouble();

        System.out.println("Soma: "+ (n1 + n2));
        System.out.println("Subtração: "+ (n1 - n2));
        System.out.println("multiplicação: "+ (n1 * n2));
        System.out.println("divisão: "+ (n1 / n2));

    }
}
