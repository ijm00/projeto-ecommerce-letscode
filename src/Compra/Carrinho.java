package Compra;

import Produto.Produto;
import java.util.HashSet;
import java.util.Set;


public abstract class Carrinho {
    
    private static Set<Produto> listaDeProdutos = new HashSet<>();

    public static <T extends Produto> void adicionarAoCarrinho(T produto) {
        getListaDeProdutos().add(produto);
    }

    public Carrinho() {

    }

    public static Set<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }






}
