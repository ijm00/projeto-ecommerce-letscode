package Loja;

public abstract class Inventario {
    
    static Loja ecommerce = Loja.getInstance();

    public static void cadastrarProdutoEmInventario(int idProduto, Integer quantidade) {
        ecommerce.getInventario().putIfAbsent(idProduto, quantidade); //TODO fazer dentro de um try
    }

    public static void incluirItensDeProduto (int i, Integer qtdeAcrescentar) {// contabilmente, significa debitar no estoque
        Integer oldValue = ecommerce.getInventario().get(i); // TODO dentre de um try
        ecommerce.getInventario().replace(i, oldValue, oldValue + qtdeAcrescentar);
    }

    public static void retirarItensDeProduto (Integer idProduto, Integer qtdeAcrescentar) {//contabilmente, significa creditar do estoque
        Integer oldValue = ecommerce.getInventario().get(idProduto); // TODO dentre de um try
        ecommerce.getInventario().replace(idProduto, oldValue, oldValue - qtdeAcrescentar); //TODO novo valor nao pode ser menor que zero!
    }

}
