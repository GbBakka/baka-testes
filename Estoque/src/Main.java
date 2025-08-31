import Model.Produto;
import Service.Estoque;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        // Casos de teste
        estoque.adicionarProduto("Arroz", 50, 4.5);
        estoque.adicionarProduto("", 10, 3.0); // nome inválido
        estoque.adicionarProduto("Feijão", -5, 6.0); // quantidade inválida
        estoque.adicionarProduto("Óleo", 20, 0); // preço inválido

        System.out.println("Produtos cadastrados com sucesso:");
        for (Produto p : estoque.getProdutos()) {
            System.out.println(p);
        }
    }
}