package Loja;

import Produto.Produto;

public abstract class Catalogo {
    
    public static <T extends Produto> void adicionarAoCatalogo(T produto) {
        Loja ecommerce = Loja.getInstance();
        ecommerce.getCatalogo().add(produto);
    }

    public static Produto procurarProdutoPorId (Loja ecommerce, Integer idProduto) {
        for (Produto produto : ecommerce.getCatalogo()) {
            if (idProduto == produto.getId()) {
                return produto;
            }
        } 
        throw new NullPointerException("Produto não encontrado no catálogo!");
    }
       

    // TODO remover produto, desnecessario para os propositos do projeto

}
