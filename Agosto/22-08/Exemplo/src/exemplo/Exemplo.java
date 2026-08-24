package exemplo;

public class Exemplo {
    /*
        length()
        charAt()
        equals()
        equalsIgnoreCase()

        substring()

        contains()
        indexOf()

        startsWith()
        endsWith()

        toUpperCase()
        toLowerCase()

        trim()
        strip()
        isEmpty()
        isBlank()

        replace()

        split()
        String.join()

        String.valueOf()
        Integer.parseInt()

        StringBuilder
    */
 
    public static void main(String[] args) {
        System.out.println("");
        
        String s = "fadfadsf";
        int a = 1;
        int b = a; 
        b = 3;
        
        int[][] matriz = new int[4][4];
        
        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0; j < matriz.length ; j++){
                matriz[i][j] = 0;
            }
        }
        int[] v1 = new int[2];
        int[] v2 = metodoInversorDeVetor(v1);
        
        
        // v1 - permanece o mesmo
        // v2 - v1 ao contrário
        
        
        
        for(int i = 0; i < matriz.length ; i++){
            for(int j = 0; j < matriz.length ; j++){
                System.out.println(matriz[i][j]);
            }
        }
        
    }
    
    public static int[] metodoInversorDeVetor (int[] v1) { // v1 = [0, 3, 5] // v2 = [5, 3, 0]
        int[] v2 = new int[2];
        int ultimoIndiceV1 = v1.length-1;       // 2
        for(int i = ultimoIndiceV1; i >= 0 ; i--){  // i = 2, i = 1, i = 0;
            v2[ultimoIndiceV1-i] = v1[i];
        }
        return v2;
    }
    
    /*Exercício 1: Controle de Estoque
        Vamos modelar um Produto de uma loja. Crie a Classe: Crie um arquivo chamado Produto.java. Defina os Atributos:
         String nome;
         double preco;
         int quantidadeEstoque;
    
        Crie os Métodos:
         Um método adicionarEstoque(int quantidade) que recebe um número como parâmetro e o adiciona à quantidadeEstoque. 
     Um método removerEstoque(int quantidade) que recebe um número e o subtrai da quantidadeEstoque. 
     Um método verificarEstoque() que imprime o nome do produto e a quantidadeatual em estoque. 
    Em um arquivo Loja.java, crie um objeto Produto. Defina seus atributos iniciais. 
    Chame o método verificarEstoque(). Depois, adicione 10 unidades, verifique de novo. 
    Remova 5 unidades e verifique pela últimavez.*/
}
