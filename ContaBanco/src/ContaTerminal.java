package src;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o Nome do Cliente: ");
        String nomeCliente = input.nextLine();

        System.out.print("Digite o Numero da Conta: ");
        int numConta = input.nextInt();
        
        input.nextLine(); //Limpar o Buffer do Teclado

        System.out.print("Digite a Agencia: ");
        String numAgencia = input.nextLine();

        System.out.print("Digite o Saldo: ");
        double saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco," + 
                           " sua agência é " + numAgencia + ", conta " + numConta +
                           " e seu saldo " + saldo + " já está disponível para saque!");

        input.close();
    }
}
