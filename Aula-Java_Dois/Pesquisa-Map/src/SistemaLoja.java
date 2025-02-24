public class SistemaLoja {
    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

    estoque.adicionarProduto(1L, "A", 45.0, 10);
    estoque.adicionarProduto(2L, "B", 5.50, 15);
    estoque.adicionarProduto(3L, "C", 20, 40);

    estoque.exibirProdutos();

    System.out.println("O Valor otoal do estoque: R$" + estoque.calcularValorTotalEstoque());
    System.out.println("Produto Mais Caro: R$" + estoque.obterProdutoMaisCaro());
    }
}
