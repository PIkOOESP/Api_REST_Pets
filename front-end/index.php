<?php

$url = 'http://localhost:8080/pets/list';
$data = file_get_contents($url);

$pets = json_decode($data, true);
$contador = 0;
echo'<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>';
echo '<table class="table table-striped"><tr><td>Nombre</td><td>Chip</td><td>Especie</td><td>Año de nacimiento</td></tr>';
while (count($pets) > $contador) {
    echo '<tr><td>'.$pets[$contador]['name'].'</td><td>'.$pets[$contador]['chip'].'</td><td>'.$pets[$contador]['category'].'</td><td>'.$pets[$contador]['born'].'</td></tr>';
    $contador++;
}   

echo '</table>';    
?>