<?php

$url = 'http://localhost:8080/pets/list';
$data = file_get_contents($url);

$pets = json_decode($data, true);
$contador=0;   

var_dump($pets);
?>

<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
    </head>
    <body>
            <table class="table table-striped">
                <tr>
                    <td>ID</td>
                    <td>Nombre</td>
                    <td>Chip</td>
                    <td>Especie</td>
                    <td>Año de nacimiento</td>
                    <td>Adoptar</td>
                </tr>

                <?php
                while (count($pets) > $contador) {
                    
                    if($pets[$contador]['adopt'] == true ) {
                    
                    } else {
                        echo '<form action="http://localhost:8080/pets/adopt/'.$pets[$contador]['id'].'" method="post">';
                            
                        echo '<tr><td>'.$pets[$contador]['id'].'</td><td>'.$pets[$contador]['name'].'</td><td>'.$pets[$contador]['chip'].'</td><td>'.$pets[$contador]['category'].'</td><td>'.$pets[$contador]['born'].'</td><td><button type="submit"><img width="50px" src="https://docs.usebruno.com/bruno.png"></button></td></tr>';
                        echo '</form>';
                    }
                    $contador++;
                }
                ?>
            </table>
    </body>
</html>