package Factories;

import Loja.Inventario;
import Produto.ProdutoCategoria1;
import Servicos.CadastrarProdutoNaLoja;

public abstract class ProdutoCategoria1Factory{//Eletronicos

    public static void ProdutoFactory() {
        ProdutoCategoria1 prod1 = new ProdutoCategoria1("Notebook", "Dell 3210", 4515.12);
        ProdutoCategoria1 prod2 = new ProdutoCategoria1("Celular", "iPhone 13", 8541.25);
        //TODO instanciar novos produtos aqui!
        
        CadastrarProdutoNaLoja.novoRegistro(prod1);
        CadastrarProdutoNaLoja.novoRegistro(prod2);
        //TODO Cadastrar no catalogo e incluir no inventario os novos produtos aqui!


        Inventario.incluirItensDeProduto(prod1.getId(), 50);
        Inventario.incluirItensDeProduto(prod2.getId(), 200);
        //TODO incluir itens ao inventario aqui!!
    }
    
    

    
    
}
