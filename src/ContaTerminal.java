import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero");
        numero = input.nextInt();
        input.nextLine();
        System.out.println("Digite  o número da Agência");
        agencia = input.nextLine();
        System.out.println("Digite seu nome");
        nomeCliente = input.nextLine();
        System.out.println("Digite o seu saldo");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, " +
                "sua agência é " + agencia  + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

    }
}