package Loja;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Factories.BebidasFactory;
import Factories.EletronicosFactory;
import Factories.InstrumentoMusicalFactory;
import Factories.TintasFactory;
import Produto.Produto;

public class Loja {
    private static Loja ecommerce;

    private Set<Produto> catalogo = new HashSet<>();
    private Map <Integer, Integer> inventario = new HashMap<Integer, Integer>();

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

    public Map <Integer, Integer> getInventario() {
        return this.inventario;
    }

    public void carregarProdutos() {
        EletronicosFactory.ProdutoFactory();
        InstrumentoMusicalFactory.ProdutoFactory();
        TintasFactory.ProdutoFactory();
        BebidasFactory.ProdutoFactory();
    }
}
