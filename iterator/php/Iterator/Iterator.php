<?php

namespace Projeto;

/**
 * Interface de utilização do Padrão Iterator.
 * 
 * @author Victor Feitoza <vfeitoza@gmail.com>
 */
interface Iterator {
    /**
     * Verifica se existira um próximo item.
     * 
     * @return Verdadeiro em caso afirmativo.
     */
    public function isDone();
    
    /**
     * Retorna o próximo item.
     * 
     * @return Objeto do próximo item.
     */
    public function next();
}
