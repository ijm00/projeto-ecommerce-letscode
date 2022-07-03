package Loja;

import Produto.Produto;

public abstract class Catalogo {
    
    public static <T extends Produto> void adicionarAoCatalogo(T produto) {
        Loja ecommerce = Loja.getInstance();
        ecommerce.getCatalogo().add(produto);
    }


    // TODO remover produto, desnecessario para os propositos do projeto

}
