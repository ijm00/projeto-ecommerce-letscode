package Models.MeiosPagamento;

public enum MeiosDePagamento {
    CARTAO_A_VISTA(1),
    CARTAO_PARCELADO(3),
    BOLETO(1),
    PAYPAL(1);

    private final int qdteParcelasPermitidas;

    MeiosDePagamento(int qdteParcelasPermitidas) {
        this.qdteParcelasPermitidas = qdteParcelasPermitidas;
    }

    public int getQdteParcelasPermitidas() {
        return qdteParcelasPermitidas;
    }

}
