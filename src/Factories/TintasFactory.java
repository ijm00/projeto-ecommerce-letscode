package Factories;

import Loja.Inventario;
import Produto.Tinta;
import Servicos.CadastrarProdutoNaLoja;

public abstract class TintasFactory{//Eletronicos

    public static void ProdutoFactory() {
        Tinta tinta1 = new Tinta("Aquarela White Nights", "Full Pan 10 mL", 40.00);
        Tinta tinta2 = new Tinta("Aquarela Van Gogh", "Tubo 10 mL", 33.00);
        
        CadastrarProdutoNaLoja.novoRegistro(tinta1);
        CadastrarProdutoNaLoja.novoRegistro(tinta2);
        

        Inventario.incluirItensDeProduto(tinta1.getId(), 100);
        Inventario.incluirItensDeProduto(tinta2.getId(), 300);
    
    }
}
