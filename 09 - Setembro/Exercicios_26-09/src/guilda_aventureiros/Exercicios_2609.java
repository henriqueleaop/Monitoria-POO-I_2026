
package guilda_aventureiros;

import torneio_games.Jogador;

public class Exercicios_2609 {

    public static void main(String[] args) {
        Personagem p = new Personagem("JLKASLKÇdlçkasd", 10000);
        Mago m = new Mago(20, "Mago", 100);
        Guerreiro g = new Guerreiro(25, "Gurreiro", 160);
        
        Personagem[] listaPersonagens = new Personagem[3];
        listaPersonagens[0] = p;
        listaPersonagens[1] = m;
        listaPersonagens[2] = g;
        
        
        Object[] listaTodosOsTipos = new Object[3];
        Jogador j = new Jogador("Jogador");
        
        listaTodosOsTipos[0] = p;
        listaTodosOsTipos[1] = j;
        listaTodosOsTipos[2] = m;
        
        System.out.println(listaTodosOsTipos[0].toString());
        System.out.println(listaTodosOsTipos[1].toString());
        
        
        
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
