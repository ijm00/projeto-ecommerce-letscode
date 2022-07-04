package Factories;

import Loja.Inventario;
import Produto.Tinta;
import Servicos.CadastrarProdutoNaLoja;

public abstract class TintasFactory{//Eletronicos

    public static void TintaFactory() {
        Tinta prod1 = new Tinta("Aquarela White Nights", "Full Pan 10 mL", 40.00);
        Tinta prod2 = new Tinta("Aquarela Van Gogh", "Tubo 10 mL", 33.00);
        
        CadastrarProdutoNaLoja.novoRegistro(prod1);
        CadastrarProdutoNaLoja.novoRegistro(prod2);
        

        Inventario.incluirItensDeProduto(prod1.getId(), 100);
        Inventario.incluirItensDeProduto(prod2.getId(), 300);
    
    }
}
