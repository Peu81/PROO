public class Produto {
    private static int qntProdutos;
    private String nome;
    private double preco;
    private final double PRECO_MINIMO = 2.99;
    
    Produto(String nome, double preco) {
        //PRECO_MINIMO = 20; não se pode alterar o valor de uma constante.
        if (nome != "") {
            this.nome = nome;
            setPreco(preco);
            produto.qntProdutos++;
        }
    }

    public string getNome() {
        return this.nome;
    }
    
    public double getPreco() {
        return this.preco;
    }

    private void setPreco(double preco) {
        if (preco <= 0) {
            this.preco = PRECO_MINIMO;
        } else {
            this.preco = preco;
        }
    }
    
    public static void main(String[] args) {
        Produto p1 = new Produto("livro", 20);
        Produto p2 = new Produto("livro", 0);
       
       System.out.println(p1.getPreco()); 
       System.out.println(p2.getPreco()); 
}
}
