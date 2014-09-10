
package iterator;

/**
 * Classe base de utilização do Padrão Iterator com os métodos implementados.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
public class ItensIterator implements Iterator {
    /**
     * Itens a serem salvos
     */
    Itens[] itens;
    /**
     * Posição dos itens salvos.
     */
    int posicao = 0;
    
    /**
     * Contrutor padrão com os itens a serem trabalhados.
     * 
     * @param itens Objeto com os itens a serem trabalhados.
     */
    public ItensIterator(Itens[] itens) {
        this.itens = itens;
    }
    
    /**
     * Pegamos o próximo registro para expor.
     * 
     * @return Objeto com os dados do item.
     */
    public Object next() {
        Itens qualItem = itens[posicao];
        posicao++;
        
        return qualItem;
    }
    
    /**
     * Verificamos se existe mais algum item a ser exibido.
     * 
     * @return Verdadeiro em caso afirmativo.
     */
    public boolean isDone() {
        if (posicao >= itens.length || itens[posicao] == null) {
            return false;
        } else {
            return true;
        }
    }
}
