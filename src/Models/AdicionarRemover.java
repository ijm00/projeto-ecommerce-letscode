package Models;

public interface AdicionarRemover {
    
    <T> void remover(T elemento);
    <T> void adicionar(T elemento);

}
