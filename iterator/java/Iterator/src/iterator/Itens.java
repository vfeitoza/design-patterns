
package iterator;

/**
 * Classe base de utilização do Padrão Iterator.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
public class Itens {
    /**
     * Nome do item a ser armazenado.
     */
    String nome;
    
    /**
     * Contrutor da classe.
     * 
     * @param nome Item a ser inserido.
     */
    public Itens(String nome) {
        this.nome = nome;
    }
}
