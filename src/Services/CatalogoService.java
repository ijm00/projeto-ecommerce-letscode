package Services;

import java.util.Set;

import Base_de_Objetos.CatalogoBase;
import Models.AdicionarRemover;
import Models.Produto.Produto;

public abstract class CatalogoService implements AdicionarRemover {

    private Set<? extends Produto<?>> catalogoBase = CatalogoBase.getCatalogo();
    Integer a = 3;

    @Override
    public <T> void remover(T elemento) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public <T> void adicionar(T produto) {
        
    }
    
}
