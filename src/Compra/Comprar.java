package Compra;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

//import Loja.Loja;
import Produto.Produto;

public class Comprar implements Checkout {

    private BigDecimal valorTotal;
    private MeiosDePagamento pagamento;
    private Carrinho carrinho;
    private Integer qtdParcelas;

    public Comprar (Carrinho carrinho, MeiosDePagamento pagamento, Integer qtdParcelas){
        this.carrinho = carrinho;
        this.pagamento = pagamento;

        try{

            if (qtdParcelas <= pagamento.getQtdMaxParcelas() || qtdParcelas != 0){
                this.qtdParcelas = qtdParcelas;
            } else {
                throw new RuntimeException("Quantidade de parcelas inválida.");
            }
        } catch (RuntimeException ex){
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
        
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public MeiosDePagamento getPagamento() {
        return pagamento;
    }

    public Carrinho getCarrinho() {
        return carrinho;
    }

    public Integer getQtdParcelas() {
        return qtdParcelas;
    }
    
    @Override
    public Comprar calcularValorTotal( ) {
        BigDecimal soma = BigDecimal.valueOf(0.0);

        for (Produto produto : this.carrinho.getCarrinho().keySet()){
            
            soma = soma.add(produto.getPreco().multiply(BigDecimal.valueOf(this.carrinho.getCarrinho().get(produto))));
        }

        this.valorTotal = soma;
        
        return this;
    }

    private void saida(){
        System.out.println("Produtos Adquiridos");
        for (Produto produto : carrinho.getCarrinho().keySet()){
            System.out.println(produto + " - " + carrinho.getCarrinho().get(produto));
        }
    }

    @Override
    public String toString() {
        this.saida();
        String precoFormatado = NumberFormat.getCurrencyInstance(new Locale("pt", "br")).format(this.valorTotal);
        return "Valor Total = " + precoFormatado + "\n" + 
                "Meio de Pagamento = " + this.pagamento + "\n" +
                "Quantidade de Parcelas = " + this.getQtdParcelas();
    }

}
