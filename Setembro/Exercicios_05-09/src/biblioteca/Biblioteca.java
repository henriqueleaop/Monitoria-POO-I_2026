package biblioteca;

public class Biblioteca {

    public static void main(String[] args) {
        Autor machadoDeAssis = new Autor("Machado de Assis", "Brasileiro");
        Autor stephenKing = new Autor("Stephen King", "Estadunidense");
        
        Livro domCasmurro = new Livro("Dom Casmurro", 1850, machadoDeAssis);
        Livro memoriasPostumas = new Livro("Memórias Póstumas de Brás Cubas", 1855, machadoDeAssis);
        
        Livro oIluminado = new Livro("O Iluminado", 1980, stephenKing);
        Livro carrieAEstranha = new Livro("Carrie: A Estranha", 1970, stephenKing);
        
        
        machadoDeAssis.addLivro(domCasmurro);
        machadoDeAssis.addLivro(memoriasPostumas);
        System.out.println(machadoDeAssis);
        System.out.println(machadoDeAssis.getLivros());
    }
    
}
