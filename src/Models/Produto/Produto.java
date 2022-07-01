package Models.Produto;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public abstract class Produto<T> {
    String id;
    String nome;
    String descricao;
    BigDecimal preco;

    public Produto(String nome, String descricao, Double preco) {
        this.id = gerarId();
        this.nome = nome ;
        this.descricao = descricao;
        this.preco = new BigDecimal(preco);
    }

    private String gerarId() {//TODO verificar existencia de id igual
        return Double.toString(Math.random()).substring(2, 6);
    }

    public String getId() {
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
        String precoFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "br")).format(preco);
        return String.format("[ID: %s\tNOME: %s\tDESCRICAO: %s\tPRECO: %s] ", 
                                        id, nome, descricao, precoFormatado);
    }
}
