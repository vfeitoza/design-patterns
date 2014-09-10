
package iterator;

/**
 * Interface de utilização do Padrão Iterator.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
public interface Iterator {
    /**
     * Verifica se existira um próximo item.
     * 
     * @return Verdadeiro em caso afirmativo.
     */
    boolean isDone();
    
    /**
     * Retorna o próximo item.
     * 
     * @return Objeto do próximo item.
     */
    Object next();
}
