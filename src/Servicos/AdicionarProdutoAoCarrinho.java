package Servicos;

import Compra.Carrinho;
import Produto.Produto;

public abstract class AdicionarProdutoAoCarrinho {
    public static <T extends Produto> void adicionarAoCarrinho(T produto, Integer quantidade) {
        Carrinho.adicionarAoCarrinho(produto, quantidade);
        
    }
}
