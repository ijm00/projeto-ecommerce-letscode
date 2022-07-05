package Compra;

import Loja.Loja;

public class Comprar {

    public Carrinho carrinho;

    public Comprar(){
      carrinho = new Carrinho();
    }

    public void comprar(Loja ecommerce, int id, int qtd){
        carrinho.adicionarAoCarrinho(ecommerce, id, qtd);
    }
    
}
