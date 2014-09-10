
package singleton;

/**
 * Classe Principal na qual mostra a utilização do Padrão Singleton.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Referenciando nossa classe Singleton
         */
        Singleton modo1 = Singleton.getInstance();
        /**
         * Expondo o valor padrão para flagConteudo
         */
        System.out.println("Valor para flagConteudo: "+ modo1.getFlagConteudo());
        
        /**
         * Setando um novo valor para flagConteudo
         */
        modo1.setFlagConteudo(30);
        /**
         * Expondo o novo valor de flagConteudo
         */
        System.out.println("Valor para flagConteudo após alteração: "+ modo1.getFlagConteudo());
        
        /**
         * Obtendo outra instancia da classe Singleton
         */
        Singleton modo2 = Singleton.getInstance();
        /**
         * Expondo o valor para flagConteudo
         */
        System.out.println("Valor para flagConteudo em nova instância: "+ modo2.getFlagConteudo());
    }
    
}
