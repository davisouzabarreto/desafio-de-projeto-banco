import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
            // Criando um objeto Scanner para receber entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Variáveis para armazenar os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

         // Coletando os dados da conta via terminal
         System.out.println("Por favor, digite o número da conta:");
         numero = scanner.nextInt();
 
         System.out.println("Por favor, digite o número da agência:");
         agencia = scanner.next();
 
         System.out.println("Por favor, digite o nome do cliente:");
         nomeCliente = scanner.next();
 
         System.out.println("Por favor, digite o saldo inicial:");
         saldo = scanner.nextDouble();
 
         // Exibindo as informações da conta
         System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
         System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + " já está disponível para saque.");
         
         // Fechar o scanner após o uso
         scanner.close();


    }
}
