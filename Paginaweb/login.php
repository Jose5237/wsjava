<!DOCTYPE html>
<html lang="es">

<head>
    <title>friida cafe| Iniciar Sesión</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="fonts/font-awesome.min.css">
    <link rel="stylesheet" href="css/font-awesome.min.css">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/logincss.css">



</head>

<body>
    <div id="sesion">
        <form action="validar.php" method="POST">
            <div id="inicio_sesion">
                <br>

                <h1>¿trabajas con nosotros?<h4>
                <br><br><br><br>
                <h4>Iniciar Sesión<h4>
            </div>
            <input type="text" name="nombre" value="" placeholder="Usuario" class="campo form-control  col-12">
            <input type="password" name="pass" value="" placeholder="Contraseña" class="campo form-control  col-12">
            <input type="submit" value="Acceder" name="submit" class="btn-campo btn btn-primary form-control  col-12">
        </form>
    </div>

    <div class="servicios container">
    <div class="row">
        <div class="item col-md-4">
            <div class="item-img"><i class="fa fa-check-circle-o" aria-hidden="true"></i></div>
            <p>Conoce nuestros deliciosos plaillos</p>
        </div>
        <div class="item col-md-4">
        <div class="item-img"><i class="fa fa-check-circle-o" aria-hidden="true"></i></div>
        <p>Para toda la familia</p>
        </div>
        <div class="item col-md-4">
        <div class="item-img"><i class="fa fa-check-circle-o" aria-hidden="true"></i></div>
        <p>ven y conocenos en este verano</p>
        </div>
    </div>
    </div>

    <footer id="creditos">
        <p id="sistema">friida cafe</p>
        <a href="#"><i class="fa fa-facebook-official" aria-hidden="true"></i></a>
        <a href="#"><i class="fa fa-twitter-square" aria-hidden="true"></i></a>
    </footer>

</body>

</html>