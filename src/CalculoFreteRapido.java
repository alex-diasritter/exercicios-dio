import java.util.Locale;
import java.util.Scanner;

public class CalculoFreteRapido {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // TODO: Leia o peso em quilos:
        System.out.println("Quantos quilos tem o produto? ");
        float kg;
        kg = scanner.nextFloat();

        // TODO: Leia o valor do frete por quilo:
        System.out.println("Qual o valor do frete por quilo? ");
        float preco;
        preco = scanner.nextFloat();

        // TODO: Calcule o valor total do frete:
        float total;
        total = kg * preco;
        System.out.printf("R$%.2f%n", total);



        scanner.close();
    }
}