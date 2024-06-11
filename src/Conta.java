import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        String nome = "João da Silva";
        String tipoConta = "Corrente";
        double saldo = 2000.00;
        int opcao = 0;

        System.out.println("***************************************\n");
        System.out.println("Nome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo em Conta: " + saldo);
        System.out.println("\n***************************************");

        String menu = """
                
                Digite sua opção:
                1 - Consultar Saldo
                2 - Transferir Valor
                3 - Receber Valor
                4 - Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();
        }
    }
}