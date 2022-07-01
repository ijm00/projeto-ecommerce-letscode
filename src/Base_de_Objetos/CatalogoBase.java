package Base_de_Objetos;

import java.util.HashSet;
import java.util.Set;

import Models.Produto.Produto;

public class CatalogoBase {

    private Set<? extends Produto<?>> Catalogo = new HashSet<>();
    
    public Set<? extends Produto<?>> getCatalogo() {
        return Catalogo;
    }
}
