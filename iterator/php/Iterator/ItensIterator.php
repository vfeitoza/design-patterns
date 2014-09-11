<?php

include_once './Iterator.php';
include_once './Itens.php';

use Projeto\Iterator;

/**
 * Classe base de utilização do Padrão Iterator com os métodos implementados.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
class ItensIterator implements Iterator {
    /**
     * Itens a serem salvos
     */
    private $itens = array();
    /**
     * Posição dos itens salvos.
     */
    private $posicao = 0;
    
    public function __construct($itens) {
        $this->itens = $itens;
    }
    
    /**
     * Verificamos se existe mais algum item a ser exibido.
     * 
     * @return Verdadeiro em caso afirmativo.
     */
    public function isDone() {
        if ($this->posicao >= count($this->itens) || is_null($this->itens[$this->posicao])) {
            return false;
        } else {
            return true;
        }
    }
    
    /**
     * Pegamos o próximo registro para expor.
     * 
     * @return Objeto com os dados do item.
     */
    public function next() {
        $qualItem = $this->itens[$this->posicao];
        $this->posicao++;
        
        return $qualItem;
    }
}
