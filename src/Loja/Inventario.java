package Loja;

public abstract class Inventario {
    
    static Loja ecommerce = Loja.getInstance();

    public static void cadastrarProdutoEmInventario(int idProduto, Integer quantidade) {
        try {
            ecommerce.getInventario().putIfAbsent(idProduto, quantidade);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
    }

    public static void incluirItensDeProduto (Integer idProduto, Integer qtdeAcrescentar) {// contabilmente, significa debitar no estoque
        try {
            Integer oldValue = ecommerce.getInventario().get(idProduto);
            ecommerce.getInventario().replace(idProduto, oldValue, oldValue + qtdeAcrescentar);
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
            e.printStackTrace();
        }

    }

    public static void retirarItensDeProduto (Integer idProduto, Integer qtdeRemover) {//contabilmente, significa creditar do estoque
        Integer oldValue = ecommerce.getInventario().get(idProduto);
        if (qtdeRemover > oldValue) {
            throw new RuntimeException(String.format("Estoque insuficiente para a compra do produto código %s.", idProduto));
        }
        ecommerce.getInventario().replace(idProduto, oldValue, oldValue - qtdeRemover);
    }

}
