public class Album {
    String nome_album, nome_artista, data_lancamento, qnt_faixas;
    
    void getInfoAlbum() {
        System.out.println("Álbum: " + this.nome_album);
        System.out.println("Artista: " + this.nome_artista);
        System.out.println("Data de lançamento: " + this.data_lancamento);
        System.out.println("Número de faixas: " + this.qnt_faixas);
    }
    
    
    public static void main(String[] args) {
        Album a1 = new Album();
        a1.nome_album = "SOS";
        a1.nome_artista = "SZA";
        a1.data_lancamento = "09/12/2022";
        a1.qnt_faixas = "23";
        
        a1.getInfoAlbum();
    }
    
}
