package Factories;

import Loja.Inventario;
import Produto.InstrumentoMusical;
import Servicos.CadastrarProdutoNaLoja;

public abstract class InstrumentoMusicaFactory {

    public static void ProdutoFactory() {

        //Produtos são instanciados
        InstrumentoMusical inst1 = new InstrumentoMusical("Guitarra", "Fender Stratocaster 2008", 5000.00);
        InstrumentoMusical inst2 = new InstrumentoMusical("Baixo", "Fender Precision Bass 2006", 1850.00);
        
        //Produtos são cadastrados no catálogo e no inventário
        CadastrarProdutoNaLoja.novoRegistro(inst1);
        CadastrarProdutoNaLoja.novoRegistro(inst2);
    

        //Cadastro de quantidades no inventário
        Inventario.incluirItensDeProduto(inst1.getId(), 5);
        Inventario.incluirItensDeProduto(inst2.getId(), 3);
        
    }

}
