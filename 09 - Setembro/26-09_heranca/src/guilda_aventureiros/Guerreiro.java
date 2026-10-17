package guilda_aventureiros;

public class Guerreiro extends Personagem {
    private int forca;

    public Guerreiro() {
    }

    public Guerreiro(int forca, String nome, int HP) {
        super(nome, HP);
        this.forca = forca;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }
    
    public int golpearComEspada(){
        return (getNivel() + this.forca);
    }
    
}
