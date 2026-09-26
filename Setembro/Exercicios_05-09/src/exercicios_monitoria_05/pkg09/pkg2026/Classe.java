package exercicios_monitoria_05.pkg09.pkg2026;

public class Classe {
    public String atributo1;
    private int atributo2;
    private Exception atributo3;
    
    public Classe (String atributo1){
        this.atributo1 = atributo1;
    }
    
    public Classe (String atributo1, int atributo2, Exception atributo3){
        this.atributo1 = atributo1;
        this.atributo2 = atributo2;
        this.atributo3 = atributo3;
    }
    
    public String getAtributo1 (){
        return this.atributo1;
    }
    
    public void setAtributo1 (String atributo1){
        this.atributo1 = atributo1;
    }
    
    public int getAtributo2 (){
        return this.atributo2;
    }
    
    
    
    
}
