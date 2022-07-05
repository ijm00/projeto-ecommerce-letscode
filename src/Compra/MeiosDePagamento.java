package Compra;

public enum MeiosDePagamento {
    CARTAO_A_VISTA (1),
    CARTAO_PARCELADO (3),
    PAYPAL (1),
    BOLETO (1);

    final int qtdMaxParcelas;

    private MeiosDePagamento(int qtdMaxParcelas){
        this.qtdMaxParcelas = qtdMaxParcelas;
    }

    public int getQtdMaxParcelas() {
        return qtdMaxParcelas;
    }
}
