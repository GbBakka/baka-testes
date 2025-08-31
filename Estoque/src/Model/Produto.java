package Model;

import Exceptions.NomeException;
import Exceptions.PrecoException;
import Exceptions.QuantidadeException;

public class Produto {
    private String name;
    private int quantidade;
    private double preco;

    public Produto(String name, int quantidade, double preco)
        throws NomeException, QuantidadeException, PrecoException {
        setName(name);
        setQuantidade(quantidade);
        setPreco(preco);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) throws NomeException {
                if (name == null || name.trim().isEmpty()){
            throw new NomeException("O nome do produto não pode estar em branco");
        }
        this.name = name;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) throws QuantidadeException {
        if (quantidade < 0){
            throw new QuantidadeException("Quantida deve ser maior que zero");
        }
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) throws PrecoException {
        if (preco < 0){
            throw new PrecoException("Preço deve ser maior que zero");
        }
        this.preco = preco;
    }
    @Override
    public String toString() {
        return "Model.Produto{" + "nome='" + name + "'"
                + ", quantidade=" + quantidade
                + ", preco=" + preco + '}';
    }
}
