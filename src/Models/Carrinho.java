package Models;

import Models.Produto.Produto;

public interface Carrinho {

    <T extends Produto<T>> void adiciona (T produto);
    <T extends Produto<T>> void remove (T produto);

    
}
