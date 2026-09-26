package biblioteca;


public class Livro {

    //Atributos do objeto (instâncias do objeto)
    private String titulo;
    private int anoP;
    private Autor autor;
    private final int codigo;

    // Váriaveis da Classe    
    private static int contCod = 0;
    private static final int CAP_VET = 100;
    private static Livro vetLivros[] = new Livro[CAP_VET];

    public static int getContCod() {
        return contCod;
    }

    public static void setContCod(int contCod) {
        Livro.contCod = contCod;
    }

    public Livro(String titulo, int ano, Autor a) {
       /* if (contCod >= CAP_VET) {
            System.out.println("Arcevo cheio!");
            return;
        }*/
        this.titulo = titulo;
        this.anoP = ano;
        this.autor = a;
        this.codigo = contCod;
        vetLivros[contCod] = this;
        contCod++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnoP() {
        return anoP;
    }

    public void setAnoP(int anoP) {
        this.anoP = anoP;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public static int qtdeLivrosCadastrados() {
        return (contCod);
    }

    @Override
    public String toString() {
        return "Livro{" + "titulo=" + titulo + ", anoP=" + anoP + ", autor=" + autor + ", codigo=" + codigo + '}';
    }
    
    
}