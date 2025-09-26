public class Produto {
    private String nome;
    private double preco;
    private double precoMinimo = 2.99;
    
    Produto(String nome, double preco) {
        if (nome != "") {
            this.nome = nome;
            
            if (preco <= 0) {
                this.preco = precoMinimo;
            } else {
                this.preco = preco;
            }
            
        }
    }
    
    public double getPreco() {
        return this.preco;
    }
    
    
    public static void main(String[] args) {
        Produto p1 = new Produto("livro", 20);
        Produto p2 = new Produto("livro", 0);
       
       System.out.println(p1.getPreco()); 
       System.out.println(p2.getPreco()); 
}
}
