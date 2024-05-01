import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
       Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //criando as entradas de dados
        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência (coloque o hífen):");
        String agencia = scanner.next();

        System.out.println("Digite o nome:");
        String nome = scanner.next();

        System.out.println("Digite o sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite o seu saldo:");
        double saldo = scanner.nextDouble();

        //imprimindo os dados obtidos pelo usuario

        System.out.println("Olá " + nome + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

       scanner.close();
    }
}