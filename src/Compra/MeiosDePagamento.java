package Compra;

public enum MeiosDePagamento {
    CARTAO_A_VISTA (1),
    CARTAO_PARCELADO (3),
    PAYPAL (1),
    BOLETO (1);

    final Integer qtdMaxParcelas;

    private MeiosDePagamento(Integer qtdMaxParcelas){
        this.qtdMaxParcelas = qtdMaxParcelas;
    }

    public Integer getQtdMaxParcelas() {
        return qtdMaxParcelas;
    }
}
