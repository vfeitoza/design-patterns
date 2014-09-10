
package singleton;

/**
 * Classe exemplo de utilização do Padrão Singleton.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
public class Singleton {
    /**
     * Variável a ser modificado o conteúdo
     */
    int flagConteudo = 0;
    /**
     * Variável a ser armazenado a instância do Singleton
     */
    private static Singleton instance;
    
    /**
     * Construtor privado para chamada da classe
     */
    private Singleton() {
        this.flagConteudo = -10;
    }
    
    /**
     * Verificamos se a classe já se encontra instânciada.
     * 
     * @return Objecto Singleton
     */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
    
    /**
     * Sincronização/verificação da lasse já instânciada.
     * 
     * @return Objecto Singleton
     */
    public static synchronized Singleton getInstanceObject() {
        if (instance == null) {
            instance = new Singleton();
        }
        
        return instance;
    }
    
    /**
     * Proibe clones da classe.
     * 
     * @return Exceção
     * @throws CloneNotSupportedException 
     */
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
    
    /**
     * Setamos um conteúdo para flagConteudo.
     * 
     * @param flagConteudo Número inteiro a ser inserido
     */
    public void setFlagConteudo(int flagConteudo) {
        this.flagConteudo = flagConteudo;
    }
    
    /**
     * Retorna o conteudo de flagConteudo.
     * 
     * @return Número inteiro armazenado em flagConteudo
     */
    public int getFlagConteudo() {
        return this.flagConteudo;
    }
}
