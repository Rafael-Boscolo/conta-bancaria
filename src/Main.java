import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Rafael";
        String tipoConta = "Corrente";
        double saldo = 2500;
        int opcao = 0;

        System.out.println("**********************************");
        System.out.println("Dados do cliente:\n");
        System.out.println("Nome:            " + nome);
        System.out.println("Tipo da Conta:   " + tipoConta);
        System.out.printf("Saldo Inicial:   %.2f\n",saldo);
        System.out.println("**********************************\n");


        while (opcao != 4){
            System.out.println("\n1Operações:\n");

            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada:");

            opcao = leitura.nextInt();
            switch (opcao){
                case 1:
                    System.out.printf("Saldo atual é R$ %.2f\n",saldo);
                    break;

                case 2 :
                    double valorRecebido;
                    System.out.println("Informe o valor a receber: ");
                    valorRecebido = leitura.nextDouble();
                    saldo += valorRecebido;
                    System.out.printf("Saldo atualizado para R$ %.2f\n",saldo);
                    break;

                case 3 :
                    double valorTransferido;
                    System.out.println("Informe o valor a ser transferido:");
                    valorTransferido = leitura.nextDouble();
                    saldo += valorTransferido;
                    System.out.printf("Saldo atualizado para R$ %.2f\n",saldo);
                    break;

                default:
                    System.out.println("Digite um numero válido!\n");
                    break;
            }
        }

    }

}