package Compra;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Locale;

import Loja.Inventario;
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

        try {//valida qtde de parcelas
            if (qtdParcelas <= pagamento.getQtdMaxParcelas()  && qtdParcelas > 0){
                this.qtdParcelas = qtdParcelas;
            } else {
                throw new InputMismatchException("Quantidade de parcelas inválida.");
            }
        } catch (InputMismatchException ime) {
            System.err.println(ime.getMessage());
            throw new RuntimeException("Compra não efetuada. Tente novamente.");
        } catch (RuntimeException rte) {
            System.err.println(rte.getLocalizedMessage());
        }   
        for (Produto produto : this.carrinho.getCarrinho().keySet()) { // retira produto do estoque
            Inventario
                .retirarItensDeProduto(produto.getId(), this.carrinho.getCarrinho().get(produto));
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
    public BigDecimal calcularValorTotal( ) {
        BigDecimal soma = BigDecimal.valueOf(0.0);
        for (Produto produto : this.carrinho.getCarrinho().keySet()){
            soma = soma.add(produto.getPreco()
                .multiply(BigDecimal.valueOf(this.carrinho.getCarrinho().get(produto))));
        }
        this.valorTotal = soma;
        return this.valorTotal;
    }

    @Override
    public BigDecimal calcularValorParcela() {
        return this.getValorTotal()
            .multiply(BigDecimal.valueOf(1.0/this.qtdParcelas)); // não foi possivel aplicar o metodo .divide 
    }

    private void saida(){
        System.out.println("-".repeat(20));
        System.out.println("Produtos Adquiridos");
        System.out.println("-".repeat(20) + "\n");
        for (Produto produto : carrinho.getCarrinho().keySet()){
            System.out.println(produto + 
                                "\n" + "Quantidade: " + carrinho.getCarrinho().get(produto) +
                                "\n");
        }
    }

    @Override
    public String toString() {
        this.saida();
        String precoFormatado = NumberFormat
            .getCurrencyInstance(new Locale("pt", "br"))
            .format(this.calcularValorTotal());
        String parcelaFormatada = NumberFormat
            .getCurrencyInstance(new Locale("pt", "br"))
            .format(this.calcularValorParcela());
        return  "-".repeat(20) + "\n" +
                "Dados da compra" + "\n" +
                "-".repeat(20) + "\n" +
                "Valor Total = " + precoFormatado + "\n" + 
                "Meio de Pagamento = " + this.pagamento + "\n" +
                "Quantidade de Parcelas = " + this.getQtdParcelas() + "\n" +
                "Valor da parcela = " + parcelaFormatada + "\n" +
                "x".repeat(50);  
    }
}