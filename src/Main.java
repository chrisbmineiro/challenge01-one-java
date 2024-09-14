import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declarando dados iniciais do usuario
        String nome = "Christopher Barros";
        String tipoConta = "Corrente";
        double saldo = 2500.00;

        // Instanciando um Scanner para leitura de dados do usuario e valor
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
        double valor = 0;

        // Mostrando dados iniciais e menu
        System.out.println("Dados iniciais do cliente:\n" +
                "-----------------------------\n" +
                "Nome: " + nome + "\n" +
                "Tipo de Conta: " + tipoConta + "\n" +
                "Saldo Inicial: R$ " + saldo + "\n" +
                "-----------------------------");
        String menu = """
                
                -----Operações-----
                1 - Consultar saldos
                2 - Receber valor
                3 - Transferir valor
                4 - Sair

                Escolha uma opção: """;

        /* Fazendo a logica do programa, para as escolhas disponiveis no menu
         1 para mostrar saldo
         2 para informar um valor a receber
         3 para informar um valor a tranferir
         4 para fechar o programa */
        while (escolha != 4) {
            System.out.println(menu);
            escolha = scanner.nextInt();

            if (escolha == 1) {
                System.out.println("\nO saldo atual é R$ " + saldo);
            }
            else if (escolha == 2) {
                System.out.println("\nInforme o valor a receber: ");
                valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("\nSaldo atualizado R$ " + saldo);
            }
            else if (escolha == 3) {
                System.out.println("\ninforme o valor a ser tranferido: ");
                valor = scanner.nextDouble();
                // validação de valor a tranferir
                if (valor > saldo) {
                    System.out.println("\nSaldo insuficiente");
                }
                else {
                    saldo -= valor;
                    System.out.println("\nSaldo atualizado R$" + saldo);
                }
            }
            else if (escolha == 4) {
                System.out.println("Obrigado, tenha um otimo dia");
            }
            else {
                System.out.println("Opção inválida");
            }
        }
    }
}