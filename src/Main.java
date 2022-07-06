import Compra.Carrinho;
import Compra.Comprar;
import Compra.MeiosDePagamento;
import Loja.Loja;

public class Main {
    public static void main(String[] args) throws Exception {
    
        Loja ecommerce = Loja.getInstance();  
        ecommerce.carregarProdutos();

        Carrinho carrinho1 = new Carrinho();
        carrinho1.adicionarAoCarrinho(ecommerce, 3, 1);
        carrinho1.adicionarAoCarrinho(ecommerce, 6, 3);

        Comprar compra1 = new Comprar(carrinho1, MeiosDePagamento.BOLETO, 1);
        System.out.println(compra1);


        Carrinho carrinho2 = new Carrinho();
        carrinho2.adicionarAoCarrinho(ecommerce, 2, 1);
        carrinho2.adicionarAoCarrinho(ecommerce, 7, 6);

        Comprar compra2 = new Comprar(carrinho2, MeiosDePagamento.CARTAO_PARCELADO, 3);
        System.out.println(compra2);

    }
}
