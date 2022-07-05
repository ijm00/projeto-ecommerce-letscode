package Compra;

public enum MeiosDePagamennto {
    CARTAO_A_VISTA (1),
    CARTAO_PARCELADO (3),
    PAYPAL (1),
    BOLETO (1);

    final int qtdMaxParcelas;

    private MeiosDePagamennto(int qtdMaxParcelas){
        this.qtdMaxParcelas = qtdMaxParcelas;
    }
}
