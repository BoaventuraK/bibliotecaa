package bibliotecaa.obras;

public class Filme extends Publicacao{
    private String diretor, atorPrincipal, sinopse, tempoDuracao;
    
    public Filme(String titulo, String autor, String genero, String editora, int anoPubli, int qtdDisponivel, String diretor, String atorPrincipal, String sinopse, String tempoDuracao){
        super(titulo, autor, genero, editora, anoPubli, qtdDisponivel);
        this.diretor=diretor;
        this.atorPrincipal=atorPrincipal;
        this.sinopse=sinopse;
        this.tempoDuracao=tempoDuracao;
    }
    
    @Override
    public void imprimirDados(){
        super.imprimirDados();
        
        System.out.println(String.format("Diretor: %s",this.diretor));
        System.out.println(String.format("Ator Principal: %s",this.atorPrincipal));
        System.out.println(String.format("Sinopse: %s",this.sinopse));
        System.out.println(String.format("Tempo de duracao: %s",this.tempoDuracao));
    }
}
