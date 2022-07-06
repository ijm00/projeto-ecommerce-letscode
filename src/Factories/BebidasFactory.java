package Factories;

import Loja.Inventario;
import Produto.Bebida;
import Servicos.CadastrarProdutoNaLoja;

public class BebidasFactory {

    public static void ProdutoFactory() {
    Bebida bebida1 = new Bebida("Vinho", "Tinto Seco - 750ml", 54.12);
    Bebida bebida2 = new Bebida("Cerveja", "IPA artesanal - 355ml",17.59 );
    Bebida bebida3 = new Bebida("Suco", "Uva Verde - 1,5L", 14.50);
    // instanciar novos produtos aqui!
        
    CadastrarProdutoNaLoja.novoRegistro(bebida1); // adiciona no catálogo e no inventário
    CadastrarProdutoNaLoja.novoRegistro(bebida2);
    CadastrarProdutoNaLoja.novoRegistro(bebida3);
    // Cadastrar no catalogo e incluir no inventario os novos produtos aqui!


    Inventario.incluirItensDeProduto(bebida1.getId(), 50);
    Inventario.incluirItensDeProduto(bebida2.getId(), 100);
    Inventario.incluirItensDeProduto(bebida2.getId(), 150);
    // incluir itens ao inventario aqui!!
    
    }
    
}
