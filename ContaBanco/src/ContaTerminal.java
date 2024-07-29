import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nomeClienteCadastrado = "MARIO ANDRADE";
        String agenciaCadastrada = "067-8";
        int numeroCadastrado = 1021;
        double saldoCadastrado = 237.48;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência!");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu Nome!");
        String nomeCliente = scanner.nextLine();

        if (agencia.equals(agenciaCadastrada) && numero == numeroCadastrado
                && nomeCliente.equalsIgnoreCase(nomeClienteCadastrado)) {
            System.out.println("Olá " + nomeCliente + ", obrigado por retornar ao nosso banco. Sua agência é "
                    + agencia + ", conta " + numero + " e seu saldo é R$ " + saldoCadastrado + ".");
        } else {
            System.out.println("Os dados inseridos não correspondem aos dados cadastrados.");
        }

        scanner.close();
    }
}