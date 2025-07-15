import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double peso = scanner.nextDouble();

        double frete = 0.00;

        if (peso <= 1.0) {
            frete = 5.00;
        } else if (peso > 1.0 || peso <= 5.0) {
            frete = 10.00;
        } else if (peso > 5.0) {
            frete = 20.00;
        }

        System.out.printf("R$%.2f%n", frete);
        scanner.close();
    }
}