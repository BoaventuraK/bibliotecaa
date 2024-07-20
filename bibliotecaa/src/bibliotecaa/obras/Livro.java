package bibliotecaa.obras;

public class Livro extends Publicacao{
    private int edicao, isbn;
    
    public Livro(String titulo, String autor, String genero, String editora, int anoPubli, int qtdDisponivel, int edicao, int isbn){
        super(titulo, autor, genero, editora, anoPubli, qtdDisponivel);
        this.edicao=edicao;
        this.isbn=isbn;
    }
    
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        
        System.out.println(String.format("Edicao: %d", this.edicao));
        System.out.println(String.format("ISBN: %d", this.isbn));
    }
    
}
