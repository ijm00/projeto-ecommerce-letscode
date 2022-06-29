

import Models.ProdutoCategoria1;

public class Main {
    public static void main(String[] args) throws Exception {
        ProdutoCategoria1 prod1 = new ProdutoCategoria1("Notebook", "Notebook Dell", 7547.78);
        ProdutoCategoria1 prod2 = new ProdutoCategoria1("Celular", "Galaxy A21", 3451.78);
        System.out.println(prod1 + "\n" + prod2);
        
    }
}
