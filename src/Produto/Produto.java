package Produto;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

import Loja.Loja;

public abstract class Produto {
    int id;
    static int idControle = 0; 
    String nome;
    String descricao;
    BigDecimal preco;

    Loja ecommerce = Loja.getInstance();

    public Produto(String nome, String descricao, Double preco) {
        Produto.idControle += 1;
        this.id = Integer.valueOf(idControle);
        this.nome = nome;
        this.descricao = descricao;
        this.preco = new BigDecimal(preco);
    }

    public int getId() {
        return id;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        String precoFormatado = NumberFormat
            .getCurrencyInstance(new Locale("pt", "br"))
            .format(preco);
        return String.format("[ID: %d\tNOME: %s\tDESCRICAO: %s\tPRECO: %s]",
                id, nome, descricao, precoFormatado);
    }
}
