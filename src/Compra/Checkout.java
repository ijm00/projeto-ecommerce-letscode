package Compra;

import java.math.BigDecimal;

public interface Checkout {

    String finalizar(); //retorna compra realizada, valor, m pegamento
    BigDecimal calcularValorTotal(Carrinho carrinho);
    void escolherMeioDePagamento(MeiosDePagamennto pagamento);
}
