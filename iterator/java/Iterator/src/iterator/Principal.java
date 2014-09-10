
package iterator;

/**
 * Classe Principal na qual mostra a utilização do Padrão Iterator.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Instanciando a classe Itens com suporte a 5 itens.
         */
        Itens[] quaisItens = new Itens[5];
        
        /**
         * Acrescentando conteúdo a quaisItens.
         */
        quaisItens[0] = new Itens("Item de número 1");
        quaisItens[1] = new Itens("Item de número 2");
        quaisItens[2] = new Itens("Item de número 3");
        quaisItens[3] = new Itens("Item de número 4");
        quaisItens[4] = new Itens("Item de número 5");
        
        /**
         * Percorrendo os itens através de um laço comum.
         */
        for (int i = 0; i < quaisItens.length; i++) {
            System.out.println("Item = "+ quaisItens[i].nome);
        }
        
        /**
         * Imprimindo linhas em branco.
         */
        System.out.println("\n\n");
        
        /**
         * Utilizando o padrão Iterator.
         */
        Iterator listaIterator = new ItensIterator(quaisItens);
        
        /**
         * Percorrendo os itens através do padrão Iterator.
         */
        while (listaIterator.isDone()) {
            /**
             * Pegando o próximo elemento.
             */
            Itens qualItem = (Itens) listaIterator.next();
            
            /**
             * Exibindo os itens salvos.
             */
            System.out.println("Item = "+ qualItem.nome);
        }
    }    
}
