<?php

include_once './ItensIterator.php';
include_once './Iterator.php';
include_once './Itens.php';

/**
 * Acrescentando conteúdo a quaisItens.
 */
$quaisItens[] = new Itens("Item de número 1");
$quaisItens[] = new Itens("Item de número 2");
$quaisItens[] = new Itens("Item de número 3");
$quaisItens[] = new Itens("Item de número 4");
$quaisItens[] = new Itens("Item de número 5");

/**
 * Utilizando o padrão Iterator.
 */
$listaIterator = new ItensIterator($quaisItens);

/**
 * Percorrendo os itens através do padrão Iterator.
 */
while ($listaIterator->isDone()) {
    $qualItem = $listaIterator->next();
    
    echo "Item = ". $qualItem->nome . PHP_EOL;
}

