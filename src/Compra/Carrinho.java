package Compra;

import Produto.Produto;

import java.util.HashMap;
import java.util.Map;

import Loja.Catalogo;
import Loja.Loja;


public class Carrinho {
    
    private Map<Produto, Integer> carrinho = new HashMap<>();

    public void adicionarAoCarrinho(Loja ecommerce, Integer idProduto, Integer qtde) {
        Produto produto = Catalogo.procurarProdutoPorId(ecommerce, idProduto);
        this.carrinho.putIfAbsent(produto, qtde);
    }

    public Carrinho() {

    }

    public Map<Produto, Integer> getCarrinho() {
        return carrinho;
    }

}
