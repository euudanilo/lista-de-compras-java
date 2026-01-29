import java.util.Scanner;
// Classe usada para ler dados digitados pelo usuário

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Responsável por receber as informações digitadas no teclado

        ListaDeComprasService service = new ListaDeComprasService();
        // Classe que cuida da lista de compras e das operações do sistema

        int opcao;
        // Guarda a opção escolhida no menu

        do {
            // Exibe o menu enquanto o usuário não escolher sair

            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Remover produto");
            System.out.println("4 - Exportar lista");
            System.out.println("5 - Ver total");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");

            opcao = sc.nextInt();
            // Lê a opção escolhida

            sc.nextLine();
            // Limpa a entrada para evitar erro na leitura do texto

            switch (opcao) {

                case 1 -> {
                    // Adiciona um novo produto à lista

                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    // Nome do produto

                    System.out.print("Valor: ");
                    double valor = sc.nextDouble();
                    // Valor de uma unidade do produto

                    System.out.print("Quantidade: ");
                    int qtd = sc.nextInt();
                    // Quantidade desejada

                    sc.nextLine();
                    // Limpa a entrada novamente

                    service.adicionarProduto(
                            new Produto(nome, valor, qtd)
                    );
                    // Cria o produto e adiciona à lista
                }

                case 2 -> service.listarProdutos();
                // Mostra todos os produtos cadastrados

                case 3 -> {
                    // Remove um produto da lista pelo nome

                    System.out.print("Produto para remover: ");
                    String nome = sc.nextLine();

                    if (!service.removerProduto(nome)) {
                        System.out.println("Produto não encontrado.");
                    }
                }

                case 4 -> {
                    // Salva a lista de compras em um arquivo de texto

                    try {
                        service.exportarParaTxt("lista_de_compras.txt");
                        System.out.println("Arquivo exportado com sucesso!");
                    } catch (Exception e) {
                        System.out.println("Erro ao salvar o arquivo.");
                    }
                }

                case 5 ->
                        System.out.printf(
                                "Valor total gasto: R$ %.2f%n",
                                service.calcularTotal()
                        );
                // Mostra o valor total da compra

                case 6 -> System.out.println("Encerrando o programa...");
                // Encerra o sistema

                default -> System.out.println("Opção inválida.");
                // Caso o usuário digite uma opção que não existe
            }

        } while (opcao != 6);
        // Repete o menu até o usuário escolher sair

        sc.close();
        // Encerra a leitura do teclado
    }
}

/*
    Este programa permite criar uma lista de compras simples.
    O usuário pode adicionar, visualizar, remover produtos,
    ver o valor total da compra e salvar a lista em um arquivo de texto.
*/
