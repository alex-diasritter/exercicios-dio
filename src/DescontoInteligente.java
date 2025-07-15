import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class DescontoInteligente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        double valor_original = scanner.nextDouble();

        double desconto = scanner.nextDouble();

        if (desconto < 0 || desconto > 100) {
            System.out.println("Desconto invalido");
        } else {
            // TODO: Calcule o valor final do produto:
            double fator_multiplicador = (100 - desconto) / 100;
            double valorFinal = valor_original * fator_multiplicador;

            // Formata e exibe o valor com duas casas decimais
            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println(df.format(valorFinal));
        }

        scanner.close();
    }
}
