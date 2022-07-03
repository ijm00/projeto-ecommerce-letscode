package Servicos;

import Loja.Catalogo;
import Loja.Inventario;
import Produto.Produto;

public abstract class CadastrarProdutoNaLoja {
    public static <T extends Produto> void novoRegistro(T produto) {
        Catalogo.adicionarAoCatalogo(produto);
        Inventario.cadastrarProdutoEmInventario(produto.getId(), 0);
    }
}
