import java.util.Scanner;

class ContaTerminal {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    int conta;
    String nome, agencia;
    double saldo;

    System.out.println("Por favor, digite seu nome! ");
    nome = scanner.nextLine();

    System.out.println("Por favor, digite sua conta! ");
    conta = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Por favor, digite sua agência! ");
    agencia = scanner.nextLine();

    System.out.println("Por favor, digite seu saldo! ");
    saldo = scanner.nextDouble();

    System.out.println("Olá " + nome.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque!");

  }
}