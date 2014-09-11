<?php

/**
 * Classe base de utilização do Padrão Iterator.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
class Itens {
    /**
     * Nome do item a ser armazenado.
     */
    public $nome;
    
    /**
     * Contrutor da classe.
     * 
     * @param nome Item a ser inserido.
     */
    public function __construct($nome) {
        $this->nome = $nome;
    }
}
