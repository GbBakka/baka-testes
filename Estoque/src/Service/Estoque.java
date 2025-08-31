package Service;

import Model.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Estoque {
    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(String nome, int quantidade, double preco){
        try {
            Produto produto = new Produto(nome, quantidade, preco);
            produtos.add(produto);
            Logger.getGlobal().info("Model.Produto: " + produto +  " adicionado com sucesso!");
        } catch (Exception e) {
            LoggerEstoque.registrar("Falha ao adicionar produto " + e.getMessage());
        }
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
}
