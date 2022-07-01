package Models.Inventario;

import Models.Produto.Produto;

//import Models.Catalogo.Catalogo;

public interface Inventario {
    //TODO planeja operações de gerenciamento do estoque;
    <T extends Produto<T>> void adicionarProdutoAoInventario();
    <T extends Produto<T>> void removerProdutoDoInventario();
}
