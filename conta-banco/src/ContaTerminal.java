import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite seu nome");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite sua agencia");
        int agencia = scanner.nextInt();

        System.out.println("digite o numero da sua conta");
        String numero = scanner.next();

        System.out.println("digite seu saldo atual");
        double saldo = scanner.nextDouble();

        
        System.out.println("Olá "+nomeCliente+" obrigado por criar uma conta em nosso banco, sua agencia é "+agencia+", conta "+numero+" e seu saldo é "+ saldo+" já está disponivel.");
        
    }
}
