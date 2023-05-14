import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Cleyson Soares";
        String tipoConta = "corrente";
        double saldo = 1500;
        int opcao = 0;
        double valor = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("******************************************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo da conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldo );
        System.out.println("******************************************************");

        String menu = """
                ** Digite sua opção **
                1 - Consultar
                2 - Transferir
                3 - Receber
                4 - Sair
                """;

        while (opcao != 4){
            System.out.println(menu);
            opcao = scan.nextInt();

            if( opcao == 1){

                System.out.println("******************************************************");
                System.out.println("Nome do cliente: " + nome);
                System.out.println("Tipo da conta: " + tipoConta);
                System.out.println("Saldo Atual: " + saldo );
                System.out.println("******************************************************");

            } else if (opcao == 2) {
                System.out.println("Digite o valor a transferir: ");
                valor = scan.nextDouble();

                if (valor < saldo){
                    saldo -= valor;
                    System.out.println("Saldo atual: " + saldo + "\n");
                } else {
                    System.out.println("Saldo insuficiente\n");
                }

            } else if (opcao == 3) {
                System.out.println("Digite o valor a receber: ");
                valor = scan.nextDouble();

                if (valor > 0){
                    saldo += valor;
                    System.out.println("Saldo atual: " + saldo + "\n");
                } else {
                    System.out.println("Valor tem que ser maior que 0\n");
                }
            } else {
                System.out.println("***** Opção invalida! *****\n ");
            }
        }

    }
}
