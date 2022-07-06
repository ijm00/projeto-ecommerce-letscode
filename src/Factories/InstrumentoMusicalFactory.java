package Factories;

import Loja.Inventario;
import Produto.InstrumentoMusical;
import Servicos.CadastrarProdutoNaLoja;

public abstract class InstrumentoMusicalFactory {

    public static void ProdutoFactory() {

        //Produtos são instanciados
        InstrumentoMusical instrumento1 = new InstrumentoMusical("Guitarra", "Fender Stratocaster 2008", 5000.00);
        InstrumentoMusical instrumento2 = new InstrumentoMusical("Baixo", "Fender Precision Bass 2006", 1850.00);
        
        //Produtos são cadastrados no catálogo e no inventário
        CadastrarProdutoNaLoja.novoRegistro(instrumento1);
        CadastrarProdutoNaLoja.novoRegistro(instrumento2);
    

        //Cadastro de quantidades no inventário
        Inventario.incluirItensDeProduto(instrumento1.getId(), 5);
        Inventario.incluirItensDeProduto(instrumento2.getId(), 3);
        
    }

}
