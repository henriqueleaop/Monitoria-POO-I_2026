package biblioteca;

import java.util.ArrayList;


public class Autor {

    private String nome;
    private String nacionalidade;
    private ArrayList<Livro> livros;
    

    public Autor(String nome, String nacion) {
        this.nome = nome;
        this.nacionalidade = nacion;
        this.livros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void addLivro(Livro livro) {
        this.livros.add(livro);
    }
    

    @Override
    public String toString() {
        return "Autor => " + "nome:" + nome + ", nacionalidade:" + nacionalidade;
    }
    
    

}
