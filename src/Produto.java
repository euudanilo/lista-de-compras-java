public class Produto {
    // Representa um produto da lista de compras

    private String nome;
    // Nome do produto

    private double valorUnitario;
    // Valor de uma unidade do produto

    private int quantidade;
    // Quantidade comprada do produto

    public Produto(String nome, double valorUnitario, int quantidade) {
        // Cria um novo produto com nome, valor e quantidade

        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.quantidade = quantidade;
    }

    public String getNome() {
        // Retorna o nome do produto
        return nome;
    }

    public int getQuantidade() {
        // Retorna a quantidade do produto
        return quantidade;
    }

    public double getValorUnitario() {
        // Retorna o valor de uma unidade do produto
        return valorUnitario;
    }

    public double getValorTotal() {
        // Calcula e retorna o valor total do produto
        return valorUnitario * quantidade;
    }
}


/*
    Esta classe representa um produto da lista de compras.
    Ela guarda as informações básicas do produto e calcula
    o valor total com base na quantidade e no valor unitário.
*/
