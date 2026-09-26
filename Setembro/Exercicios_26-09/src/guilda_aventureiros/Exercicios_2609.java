
package guilda_aventureiros;

public class Exercicios_2609 {

    public static void main(String[] args) {
        Mago m = new Mago(20, "Mago", 100);
        Guerreiro g = new Guerreiro(25, "Gurreiro", 160);
        
        while(m.lancarFeitico(10)){
            System.out.println("Bola de Fogo lancada!");
        }
        
        System.out.println("Acabou a mana!");
        
        while(m.estaVivo()){
            System.out.println(m.getHP());
            m.receberDano(g.golpearComEspada());
        }
       
        System.out.println("Mago morreu");
    }
    
}
