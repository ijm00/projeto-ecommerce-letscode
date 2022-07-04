package Factories;

import Loja.Inventario;
import Produto.ProdutoCategoria1;
import Servicos.CadastrarProdutoNaLoja;

public class BebidasFactory {

    public static void ProdutoFactory() {
        ProdutoCategoria1 prod1 = new ProdutoCategoria1("Vinho", "Tinto Seco - 750ml", 54.12);
        ProdutoCategoria1 prod2 = new ProdutoCategoria1("Cerveja", "IPA artesanal - 355ml",17.59 );
        ProdutoCategoria1 prod3 = new ProdutoCategoria1("Suco", "Uva Verde - 1,5L", 14.50);

        //TODO instanciar novos produtos aqui!
        
        CadastrarProdutoNaLoja.novoRegistro(prod1); // adiciona no catálogo e no inventário
        CadastrarProdutoNaLoja.novoRegistro(prod2);
        CadastrarProdutoNaLoja.novoRegistro(prod3);

        //TODO Cadastrar no catalogo e incluir no inventario os novos produtos aqui!


        Inventario.incluirItensDeProduto(prod1.getId(), 50);
        Inventario.incluirItensDeProduto(prod2.getId(), 100);
        Inventario.incluirItensDeProduto(prod2.getId(), 150);

        //TODO incluir itens ao inventario aqui!!
    }
    
}
