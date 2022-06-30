package Models.Carrinho;

import Models.Produto.Produto;

public interface CarrinhoDeCompras {
    <T extends Produto<T>> void adicionaAoCarrinho();
    <T extends Produto<T>> void removeDoCarrinho();
}
