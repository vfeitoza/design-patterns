<?php

/**
 * Classe exemplo de utilização do Padrão Singleton.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
class Singleton {
    /**
     * Variável a ser modificado o conteúdo
     */
    private $flagConteudo = 0;
    /**
     * Variável a ser armazenado a instância do Singleton
     */
    private static $instance;
    
    /**
     * Construtor privado para chamada da classe
     */
    private function __construct() {
        $this->lagConteudo = -10;
    }
    
    /**
     * Verificamos se a classe já se encontra instânciada.
     * 
     * @return Objecto Singleton
     */
    public static function getInstance() {
        if (!isset(self::$instance) || is_null(self::$instance)) {
            self::$instance = new Singleton();
        }
        
        return self::$instance;
    }
    
    /**
     * Setamos um conteúdo para flagConteudo.
     * 
     * @param flagConteudo Número inteiro a ser inserido
     */
    public function setFlagConteudo($flagConteudo) {
        $this->flagConteudo = $flagConteudo;
    }
    
    /**
     * Retorna o conteudo de flagConteudo.
     * 
     * @return Número inteiro armazenado em flagConteudo
     */
    public function getFlagConteudo() {
        return $this->flagConteudo;
    }
}
