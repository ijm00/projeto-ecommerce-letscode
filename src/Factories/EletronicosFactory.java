package Factories;

import Loja.Inventario;
import Produto.Eletronico;
import Servicos.CadastrarProdutoNaLoja;

public abstract class EletronicosFactory{//Eletronicos

    public static void ProdutoFactory() {
        Eletronico eletronico1 = new Eletronico("Notebook", "Dell 3210", 4515.12);
        Eletronico eletronico2 = new Eletronico("Celular", "iPhone 13", 8541.25);
        // instanciar novos produtos aqui!
        
        CadastrarProdutoNaLoja.novoRegistro(eletronico1);
        CadastrarProdutoNaLoja.novoRegistro(eletronico2);
        // Cadastrar no catalogo e incluir no inventario os novos produtos aqui!

        Inventario.incluirItensDeProduto(eletronico1.getId(), 50);
        Inventario.incluirItensDeProduto(eletronico2.getId(), 200);
        // incluir itens ao inventario aqui!!
    }
    
}
