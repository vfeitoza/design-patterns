<?php

/**
 * Inclusão da classe Singleton
 */
include './Singleton.php';

/**
 * Instanciando nossa classe Singleton
 */
$modo1 = Singleton::getInstance();

/**
 * Expondo o valor padrão para flagConteudo
 */
echo "Valor para flagConteudo: ". $modo1->getFlagConteudo() . PHP_EOL;

/**
 * Setando um novo valor para flagConteudo
 */
$modo1->setFlagConteudo(30);

/**
 * Expondo o valor padrão para flagConteudo
 */
echo "Valor para flagConteudo após alteração: ". $modo1->getFlagConteudo() . PHP_EOL;

/**
 * Obtendo outra instancia da classe Singleton
 */
$modo2 = Singleton::getInstance();

/**
 * Expondo o valor para flagConteudo
 */
echo "Valor para flagConteudo: ". $modo2->getFlagConteudo() . PHP_EOL;