package Compra;

import Produto.Produto;
import java.util.HashMap;
import java.util.Map;


public abstract class Carrinho {
    
    private static Map<Produto, Integer> listaDeProdutos = new HashMap<>();

    public static <T extends Produto> void adicionarAoCarrinho(T produto, Integer qtdeAcrescentar) {
        getCarrinho().put(produto, qtdeAcrescentar);
    }

    public Carrinho() {

    }

    public static Map<Produto, Integer> getCarrinho() {
        return listaDeProdutos;
    }






}
