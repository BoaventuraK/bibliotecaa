package bibliotecaa.obras;

public class Publicacao {
   private String titulo, autor, genero, editora;
   private int anoPubli, qtdDisponivel;
   
   public Publicacao(String titulo, String autor, String genero, String editora, int anoPubli, int qtdDisponivel){
       this.titulo=titulo;
       this.autor=autor;
       this.genero=genero;
       this.editora=editora;
       this.anoPubli=anoPubli;
       this.qtdDisponivel=qtdDisponivel;
   }
   
   public void imprimirDados(){
       System.out.println(String.format("Titulo: %s",this.titulo));
       System.out.println(String.format("Autor: %s",this.autor));
       System.out.println(String.format("Genero: %s",this.genero));
       System.out.println(String.format("Editora: %s",this.editora));
       System.out.println(String.format("Ano de Publicacao: %d",this.anoPubli));
       System.out.println(String.format("Quantidade disponivel: %d",this.qtdDisponivel));
   }
   
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public String getEditora() {
        return editora;
    }

    /**
     * @return the anoPubli
     */
    public int getAnoPubli() {
        return anoPubli;
    }

    /**
     * @return the qtdDisponivel
     */
    public int getQtdDisponivel() {
        return qtdDisponivel;
    } 
}
