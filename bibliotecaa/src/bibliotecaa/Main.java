package bibliotecaa;
import bibliotecaa.obras.*;

public class Main {

    public static void main(String[] args) {
        Livro livro = new Livro("Uma volta ao mundo", "J.J.Jemison", "Curiosidades", "Clarin diario", 2001, 50, 3, 1234);
        Filme filme = new Filme("Uma aventura na cidade perdida de atlantida", "Valdisnei", "Animacao", "Disnilson", 1998, 21, "Mikey Rato", "Donald Duck", "Oscara se perdeu no oceano", "1h20");
        
        Publicacao pub[] = new Publicacao[2];
        
        pub[0] = livro;
        pub[1] = filme;
        
        for(int i=0; i<2; i++){
            pub[i].imprimirDados();
            System.out.println("");
        }   
        
    }
    
}
