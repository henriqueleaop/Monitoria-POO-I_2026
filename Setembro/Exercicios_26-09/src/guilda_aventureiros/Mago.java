package guilda_aventureiros;

public class Mago extends Personagem {
    private int mana;

    public Mago() {
    }

    public Mago(int mana, String nome, int HP) {
        super(nome, HP);
        this.mana = mana;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    public boolean lancarFeitico(int custoEmMana){
        if (this.mana - custoEmMana >= 0){
            this.mana -= custoEmMana;
            return true;
        }
        return false;
    }
    
    
    
    
}
