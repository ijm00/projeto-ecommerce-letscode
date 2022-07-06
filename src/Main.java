
/* Crie uma aplicação que simule um e-commerce simples. A aplicação deverá manter pelo menos quatro 
categorias de produtos diferentes, mas nem todas as categorias obrigatoriamente precisam ter produtos 
cadastrados. Quando um cliente faz um pedido de compra, o(s)item(s)são carregados em um carrinho virtual. 
Pode-se pedir mais de um item para cada produto.

O cliente tem as opções de pagamento: BOLETO, CARTÃO PARCELADO, CARTÃO A VISTA E PAYPAL.
Parcelamentos são permitidos apenas na opção cartão parcelado, e no máximo em 3 vezes.
Na classe principal da aplicação, simule a entrada de pelo menos dois produtos, em modalidades de compra diferentes,
e mostre os itens adquiridos na saída de tela.

Utilizar todos os recursos apresentados até agora, principalmente as Collections (List,Map,Linked,etc), 
Interfaces e Generics, além de pelo menos um princípio SOLID.
 */


import Compra.Carrinho;
import Compra.Comprar;
import Compra.MeiosDePagamento;
import Loja.Loja;

public class Main {
    public static void main(String[] args) throws Exception {
    
        //Inicialização da loja
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

        //ecommerce.getInventario().keySet().forEach(key -> {System.out.println(key +" - " + ecommerce.getInventario().get(key));});
        //ecommerce.getCatalogo().forEach((Produto produto) -> {System.out.println(produto);});

        //System.out.println("Carrinho de compra");
        
        //carrinho.getCarrinho().keySet().forEach(key -> {System.out.println(key);});

        //ecommerce.getCatalogo();


        

        // Ação1: Cliente (seleciona categorias e), escolhe quantidade e adiciona produtos em um carrinho virtual
        // Possivel repetição da ação 1 para outros produtos

        // Encerramento do carrinho/checkout

        // Sistema mostra valor total (lista?) e pergunta qual a forma de pagamento




        // Ação1: Cliente (seleciona categorias e), escolhe quantidade e adiciona produtos em um carrinho virtual
        // Possivel repetição da ação 1 para outros produtos

        // Encerramento do carrinho/checkout

        // Sistema mostra valor total (lista?) e pergunta qual a forma de pagamento


    }
}
