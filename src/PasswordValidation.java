import java.util.Scanner;

public class PasswordValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = scanner.nextLine();

        scanner.close();

        // TODO: Verifique se a senha é válida e imprime o resultado:


    }

    public static boolean validarSenha(String senha) {
        // TODO: Verifique se a senha tem pelo menos 8 caracteres. Se não tiver, retornar false.

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        // TODO: Percorra cada caractere da senha e verifique se há pelo menos uma letra maiúscula e um número:
        // DICA: Use um loop para analisar cada caractere e marcar se é maiúscula ou número.

        var senhaQuebrada = senha.split(" ");



        // Se já encontramos uma letra maiúscula e um número, podemos parar a verificação
        if (temMaiuscula && temMinuscula && temNumero) {
            return true;
        }
        return false;
    }
}
