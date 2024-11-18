import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ApiService apiService = new ApiService();

        System.out.println("Bem-vindo ao Conversor de Moedas!");
        System.out.println("Escolha a conversão desejada:");
        System.out.println("1. USD para BRL");
        System.out.println("2. EUR para BRL");
        System.out.println("3. BRL para USD");
        System.out.println("4. BRL para EUR");
        System.out.println("5. USD para EUR");
        System.out.println("6. EUR para USD");

        int opcao = scanner.nextInt();
        System.out.print("Digite o valor para conversão: ");
        double valor = scanner.nextDouble();

        String moedaOrigem = "", moedaDestino = "";
        switch (opcao) {
            case 1 -> { moedaOrigem = "USD"; moedaDestino = "BRL"; }
            case 2 -> { moedaOrigem = "EUR"; moedaDestino = "BRL"; }
            case 3 -> { moedaOrigem = "BRL"; moedaDestino = "USD"; }
            case 4 -> { moedaOrigem = "BRL"; moedaDestino = "EUR"; }
            case 5 -> { moedaOrigem = "USD"; moedaDestino = "EUR"; }
            case 6 -> { moedaOrigem = "EUR"; moedaDestino = "USD"; }
            default -> {
                System.out.println("Opção inválida!");
                return;
            }
        }

        double taxa = apiService.getTaxaDeConversao(moedaOrigem, moedaDestino);
        if (taxa != -1) {
            double valorConvertido = valor * taxa;
            System.out.printf("Taxa atual: %.2f\n", taxa);
            System.out.printf("Valor convertido: %.2f %s\n", valorConvertido, moedaDestino);
        } else {
            System.out.println("Erro ao obter a taxa de conversão. Tente novamente.");
        }
    }
}
