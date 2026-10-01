
package exercicios_01.pkg10;


public class Classe {
    int valor;
    
    public Classe (int valor){
        this.valor = valor;
        int zero = 0;
        zero = zero;
    }

    
    public String toString() {
        return "Classe{" + "valor=" + valor + '}';
    }
    
    
    
    
    
    
    public void alterar(int valor){
        valor = valor + 5;
    }
    
   
    
    public void alterar2(int valor){
        this.valor = valor + 5;
    }
    
    
}
