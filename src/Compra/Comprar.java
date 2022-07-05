package Compra;

import java.math.BigDecimal;

import Loja.Loja;

public class Comprar implements Checkout {

    private Carrinho carrinho;

    public Comprar(){
      carrinho = new Carrinho();
    }

    public void comprar(Loja ecommerce, int id, int qtd){
        carrinho.adicionarAoCarrinho(ecommerce, id, qtd);
    }

    public Carrinho getCarrinho(){
        return this.carrinho;
    }

    @Override
    public String finalizar() {
        
        return null;
    }

    @Override
    public BigDecimal calcularValorTotal(Carrinho carrinho) {
        
        return null;
    }

    @Override
    public void escolherMeioDePagamento(MeiosDePagamennto pagamento) {
        
        
    }
    
}
