import java.io.FileWriter;
// Classe usada para criar ou escrever arquivos de texto

import java.io.IOException;
// Classe usada para tratar erros relacionados a arquivos

import java.io.PrintWriter;
// Facilita a escrita de texto dentro do arquivo

import java.util.ArrayList;
// Estrutura usada para guardar vários produtos em uma lista

public class ListaDeComprasService {

    private ArrayList<Produto> lista = new ArrayList<>();
    // Lista que armazena todos os produtos adicionados

    public void adicionarProduto(Produto produto) {
        // Adiciona um produto na lista
        lista.add(produto);
    }

    public void listarProdutos() {
        // Mostra os produtos cadastrados

        if (lista.isEmpty()) {
            // Verifica se a lista está vazia
            System.out.println("Lista vazia.");
            return;
        }

        for (Produto p : lista) {
            // Passa por todos os produtos da lista e exibe as informações

            System.out.printf(
                    "Produto: %s | Qtd: %d | Valor: R$ %.2f | Total: R$ %.2f%n",
                    p.getNome(),
                    p.getQuantidade(),
                    p.getValorUnitario(),
                    p.getValorTotal()
            );
        }
    }

    public double calcularTotal() {
        // Soma o valor total de todos os produtos da lista

        double total = 0;

        for (Produto p : lista) {
            total += p.getValorTotal();
        }

        return total;
    }

    public boolean removerProduto(String nome) {
        // Remove um produto da lista pelo nome (sem diferenciar maiúsculas ou minúsculas)

        return lista.removeIf(p ->
                p.getNome().equalsIgnoreCase(nome)
        );
    }

    public void exportarParaTxt(String nomeArquivo) throws IOException {
        // Salva a lista de compras em um arquivo de texto

        try (PrintWriter pw = new PrintWriter(new FileWriter(nomeArquivo))) {
            // Abre o arquivo e garante que ele será fechado ao final

            pw.println("=== LISTA DE COMPRAS ===");
            // Título do arquivo

            for (Produto p : lista) {
                // Escreve cada produto no arquivo

                pw.printf(
                        "Produto: %s | Qtd: %d | Valor: R$ %.2f | Total: R$ %.2f%n",
                        p.getNome(),
                        p.getQuantidade(),
                        p.getValorUnitario(),
                        p.getValorTotal()
                );
            }

            pw.printf(
                    "%nTotal gasto: R$ %.2f%n",
                    calcularTotal()
            );
            // Escreve o valor total da compra no final do arquivo
        }
    }
}

/*
    Esta classe é responsável por controlar a lista de compras.
    Ela permite adicionar, remover, listar produtos,
    calcular o valor total e salvar a lista em um arquivo de texto.
*/
