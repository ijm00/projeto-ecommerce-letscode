package Compra;

import java.math.BigDecimal;

public interface Checkout {
    BigDecimal calcularValorTotal();
    BigDecimal calcularValorParcela();
}
