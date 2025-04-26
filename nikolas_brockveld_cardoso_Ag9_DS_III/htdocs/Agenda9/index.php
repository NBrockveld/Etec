<?php
require_once 'Paciente.php';

$p = new Paciente();
$p->setNome("Maria Souza");
$p->setCpf("123.456.789-00");
$p->setDataNascimento("1990-05-12");
$p->setTelefone("(11) 99999-9999");
$p->setEndereco("Rua das Flores, 123 - São Paulo/SP");

echo "<h3>Dados do Paciente:</h3>";
echo "Nome: " . $p->getNome() . "<br>";
echo "CPF: " . $p->getCpf() . "<br>";
echo "Data de Nascimento: " . $p->getDataNascimento() . "<br>";
echo "Telefone: " . $p->getTelefone() . "<br>";
echo "Endereço: " . $p->getEndereco() . "<br>";
?>