package guilda_aventureiros;

public class Personagem {
    private String nome;
    private int nivel;
    private int HP;

    public Personagem() {
    }

    public Personagem(String nome, int HP) {
        this.nome = nome;
        this.nivel = 1;
        this.HP = HP;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
    
    public void receberDano(int dano){
        this.HP = (dano > this.HP) ? 0 : this.HP - dano;
    }
    
    public boolean estaVivo(){
        return (this.HP > 0);
    }
    
   
    
    
    
    
}
