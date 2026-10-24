
package ex_08_formas_geometricas;

public class Forma {
    protected String nome;
    
    public Forma (){
        
    }
    
    public Forma (String nome){
        this.nome = nome;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public double area(){
        return 0;
    }

    @Override
    public String toString() {
        return "Area do " + nome + ": " + this.area();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Forma) return this.nome.equals(((Forma)obj).nome);
        return false;
    }
    
    

}
