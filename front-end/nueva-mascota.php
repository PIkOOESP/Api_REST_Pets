<?php
$url = 'http://localhost:8080/pets/list';
$data = file_get_contents($url);

$pets = json_decode($data, true);
?>

<html>
    <head>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
    </head>
    <body>
        <form action="http://localhost:8080/pets/nuevo" method="post">
            <div class="mb-3">
                <label for="name" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="name" name="name" required>
            </div>
            <div class="mb-3">
                <label for="category" class="form-label">Especie</label>
                <input type="text" class="form-control" id="category" name="category" required>
            </div>
            <div class="mb-3">
                <label for="chip" class="form-label">Chip</label>
                <input type="text" class="form-control" id="chip" name="chip" required>
            </div>
            <div class="mb-3">
                <label for="born" class="form-label">Año de nacimiento</label>
                <input type="date" class="form-control" id="born" name="born" required>
            </div>
            <button type="submit" class="btn btn-primary">Añadir mascota</button>
        </form>
    </body>
</html>