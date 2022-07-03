package Loja;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Produto.Produto;

public class Loja {
    private static Loja ecommerce;

    private Set<Produto> catalogo = new HashSet<>();
    private Map <String, Integer> inventario = new HashMap<String, Integer>();

    private Loja() {

    }

    public static Loja getInstance() {
        if (ecommerce == null) {
            ecommerce = new Loja();
        }
        return ecommerce;
    }

    public Set<Produto> getCatalogo() {
        return this.catalogo;
    }

    public Map <String, Integer> getInventario() {
        return this.inventario;
    }

}
