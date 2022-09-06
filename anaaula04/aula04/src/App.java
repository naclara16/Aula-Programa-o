import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // criar um objeto do tipo conta poupança em banco

       ContaPoupanca conta = new ContaPoupanca();
       Scanner leia = new Scanner(System.in);

       System.out.print("Digite sua agencia:");
       conta.agencia = leia.nextLine();

       System.out.print("Digite sua conta:");
       conta.numero = leia.nextLine();

       System.out.print("Digite seu saldo:");
       conta.saldo = leia.nextFloat();

       System.out.print("Digite sua taxa:");
       conta.taxa = leia.nextFloat();

       conta.imprimeDados();

       System.out.print("Digite o valor a ser depositado");
       float valor = leia.nextFloat();
       conta.depositar(valor);
       
       conta.imprimeDados();

       valor = conta.calculaRendimento();
       System.out.println("rendimento:"+valor);

       conta.depositar(valor);

       conta.imprimeDados();

       leia.close();





    }
}
