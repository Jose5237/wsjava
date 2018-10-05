<!DOCTYPE html>
<html lang="en">


<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <title>Friida Cafe</title>
  <meta name="description" content="Free Bootstrap Theme by BootstrapMade.com">
  <meta name="keywords" content="free website templates, free bootstrap themes, free template, free bootstrap, free website template">

  <link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Satisfy|Bree+Serif|Candal|PT+Sans">
  <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
  <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
  <link rel="stylesheet" type="text/css" href="css/style.css">
  <!-- =======================================================
    Theme Name: Delicious
    Theme URL: https://bootstrapmade.com/delicious-free-restaurant-bootstrap-theme/
    Author: BootstrapMade.com
    Author URL: https://bootstrapmade.com
  ======================================================= -->
</head>

<body>
  <!--banner-->
  <section id="banner">
    <div class="bg-color">
      <header id="header">
        <div class="container">
          <div id="mySidenav" class="sidenav">
            <a href="javascript:void(0)" class="closebtn" onclick="closeNav()">&times;</a>
            <a href="#about">Acerca</a>
            <a href="#event">Eventos</a>
            <a href="#menu-list">Menu</a>
            <a href="#contact">Reserva tu mesa</a>
            <a href="login.php">Administrador</a>
          </div>
          <!-- Use any element to open the sidenav -->
          <span onclick="openNav()" class="pull-right menu-icon">☰</span>
        </div>
      </header>
      <div class="container">
        <div class="row">
          <div class="inner text-center">
            <h1 class="logo-name">Friida Cafe</h1>
            <h2>El mejor concepto con sabor a cafe</h2>
            <p>ven y conocenos</p>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!-- / banner -->
  <!--about-->
  <section id="about" class="section-padding">
    <div class="container">
      <div class="row">
        <div class="col-md-12 text-center marb-35">
          <h1 class="header-h">cafe de verando</h1>
          <p class="header-p">ven a disfrutar todo el sabor que tiene este verano </p>
        </div>
        <div class="col-md-1"></div>
        <div class="col-md-10">
          <div class="col-md-6 col-sm-6">
            <div class="about-info">
              <h2 class="heading">vel illum qui dolorem eum</h2>
              <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Libero impedit inventore culpa vero accusamus in nostrum dignissimos modi, molestiae. Autem iusto esse necessitatibus ex corporis earum quaerat voluptates quibusdam dicta!</p>
              <div class="details-list">
                <ul>
                  <li><i class="fa fa-check"></i>Lorem ipsum dolor sit amet, consectetur adipiscing elit</li>
                  <li><i class="fa fa-check"></i>Quisque finibus eu lorem quis elementum</li>
                  <li><i class="fa fa-check"></i>Vivamus accumsan porttitor justo sed </li>
                  <li><i class="fa fa-check"></i>Curabitur at massa id tortor fermentum luctus</li>
                </ul>
              </div>
            </div>
          </div>
          <div class="col-md-6 col-sm-6">
            <img src="img/res01.jpg" alt="" class="img-responsive">
          </div>
        </div>
        <div class="col-md-1"></div>
      </div>
    </div>
  </section>
  <!--/about-->
  <!-- event -->
  <section id="event">
    <div class="bg-color" class="section-padding">
      <div class="container">
        <div class="row">
          <div class="col-xs-12 text-center" style="padding:60px;">
            <h1 class="header-h">Up Coming events</h1>
            <p class="header-p">Decorations 100% complete here</p>
          </div>
          <div class="col-md-12" style="padding-bottom:60px;">
            <div class="item active left">
              <div class="col-md-6 col-sm-6 left-images">
                <img src="img/res02.jpg" class="img-responsive">
              </div>
              <div class="col-md-6 col-sm-6 details-text">
                <div class="content-holder">
                  <h2>Joyful party</h2>
                  <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Labore eos suscipit earum voluptas aliquam recusandae, quae iure adipisci, inventore quia, quos delectus quaerat praesentium id expedita nihil illo accusantium, tempora.</p>
                  <address>
                              <strong>Place: </strong>
                              1612 Collins Str, Victoria 8007
                              <br>
                              <strong>Time: </strong>
                              07:30pm
                            </address>
                  <a class="btn btn-imfo btn-read-more" href="#contact">Reservar mesa</a>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </section>
  <!--/ event -->
  <!-- menu -->
  <section id="menu-list" class="section-padding">
   
    <div class="container">
      <div class="row">
        <div class="col-md-12 text-center marb-35">
          <h1 class="header-h">Menú</h1>
          <p class="header-p">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy
            <br>nibh euismod tincidunt ut laoreet dolore magna aliquam. </p>
        </div>
        <div class="col-md-12  text-center" id="menu-flters">
          <ul>
            <li><a class="filter active" data-filter=".menu-restaurant">Mostrar todo</a></li>
            <li><a class="filter" data-filter=".1">Desayunos</a></li>
            <li><a class="filter" data-filter=".2">Comida</a></li>
            <li><a class="filter" data-filter=".3">Cena</a></li>
          </ul>
        </div>
         <?php
              require("connect_db.php");  
              $sql= "SELECT * FROM menu";
              $ejecutar = mysqli_query($mysqli,$sql);
              if(!$ejecutar){
                echo "Error, No se pudieron cargar los datos";
              }
              ?>
             <?php
             while ($lista_datos = mysqli_fetch_array($ejecutar)) {
                # code...
              ?>
               
        <div id="menu-wrapper">
          <div class="<?= $lista_datos[4] ?> menu-restaurant">
            <span class="clearfix">
              <a class="menu-title" href="#" data-meal-img="assets/img/restaurant/rib.jpg"><?= $lista_datos[1] ?></a>
              <span style="left: 166px; right: 44px;" class="menu-line"></span>
              <span class="menu-price"><?= $lista_datos[2] ?></span>
            </span>
            <span class="menu-subtitle"><?= $lista_datos[3] ?></span>
          </div>

          
         
        </div>
        <?php 
      }
      ?>

      </div>
      
    </div>
  
  </section>
  <!--/ menu -->
  <!-- contact -->
  <section id="contact" class="section-padding">
    <div class="container">
      <div class="row">
        <div class="col-md-12 text-center">
          <h1 class="header-h">¡Reserva tu Mesa!</h1>
          <p class="header-p"> </p>
        </div>
      </div>
      <div class="row msg-row">
        <div class="col-md-4 col-sm-4 mr-15">
          <div class="media-2">
            <div class="media-left">
              <div class="contact-phone bg-1 text-center"><span class="phone-in-talk fa fa-phone"></span></div>
            </div>
            <div class="media-body">
              <h4 class="dark-blue regular">numero de telefono</h4>
              <p class="light-blue regular alt-p">+440 875369208 - <span class="contacts-sp"></span></p>
            </div>
          </div>
          <div class="media-2">
            <div class="media-left">
              <div class="contact-email bg-14 text-center"><span class="hour-icon fa fa-clock-o"></span></div>
            </div>
            <div class="media-body">
              <h4 class="dark-blue regular">horas</h4>
              <p class="light-blue regular alt-p"> lunes a viernes 09.00 - 24:00</p>
              <p class="light-blue regular alt-p">
                viernes y sabado 08:00 - 03.00
              </p>
            </div>
          </div>
        </div>
        <div class="col-md-8 col-sm-8">
          
          <form action="" method="post" role="form"  >
           <fieldset>
            <div id="sendmessage">gracias</div>
            <div id="errormessage"></div>
            <div class="col-md-6 col-sm-6 contact-form pad-form">
              <div class="form-group label-floating is-empty">
                <input type="text" name="name" class="form-control" id="name" placeholder="nombre" required autofocus name="realname" data-rule="minlen:4" data-msg="Please enter at least 4 chars" />
                <div class="validation"></div>
              </div>

            </div>
            <div class="col-md-6 col-sm-6 contact-form">
              <div class="form-group">
                <input type="date" class="form-control" name="date" id="date" placeholder="fecha" required autofocus name="fecha" data-rule="required" data-msg="This field is required" />
                <div class="validation"></div>
              </div>
            </div>
            <div class="col-md-6 col-sm-6 contact-form pad-form">
              <div class="form-group">
                <input type="email" class="form-control label-floating is-empty" name="email" id="email" placeholder="correo" required autofocus name="email" data-rule="email" data-msg="Please enter a valid email" />
                <div class="validation"></div>
              </div>
            </div>
            <div class="col-md-6 col-sm-6 contact-form">
              <div class="form-group">
                <input type="time" class="form-control label-floating is-empty" name="time" id="time" placeholder="hora" required autofocus name="time" data-rule="required" data-msg="This field is required" />
                <div class="validation"></div>
              </div>
            </div>
            <div class="col-md-6 col-sm-6 contact-form">
              <div class="form-group">
                <input type="number" class="form-control label-floating is-empty" name="phone" id="phone" placeholder="telefono" required autofocus name="phone" data-rule="required" data-msg="This field is required" />
                <div class="validation"></div>
              </div>
            </div>
            <div class="col-md-6 col-sm-6 contact-form">
              <div class="form-group">
                <input type="numero" class="form-control label-floating is-empty" name="people" id="people" placeholder="personas" required autofocus name="people" data-rule="required" data-msg="This field is required" />
                <div class="validation"></div>
              </div>
            </div>
            <div class="col-md-12 contact-form">
              <div class="form-group label-floating is-empty">
                <textarea class="form-control" name="message" rows="5" rows="3" data-rule="required" data-msg="Please write something for us" placeholder="mensaje"></textarea>
                <div class="validation"></div>
              </div>

            </div>
            <div class="col-md-12 btnpad">
              <div class="contacts-btn-pad">

             <!-- / contact  <button class="contacts-btn">reservar mesa</button> -->   
                 <input  class="btn btn-danger" type="submit" name="submit" value="Reserva"/>
                 
                 <?php
               if(isset($_POST['submit'])){
      require("registro.php");
     }
     ?>



              </div>
            </div>
          </form>
   

        </div>
      </div>
    </div>
  </section>
  <!-- / contact -->
  <!-- footer -->

  <footer class="footer text-center">
    <div class="footer-top">
      <div class="row">
        <div class="col-md-offset-3 col-md-6 text-center">
          <div class="widget">
            <h4 class="widget-title">Frida Cafe </h4>
            <address>324 Ellte Road<br>Delhi, DL 110013</address>
            <div class="social-list">
              <a href="#"><i class="fa fa-twitter" aria-hidden="true"></i></a>
              <a href="#"><i class="fa fa-facebook" aria-hidden="true"></i></a>
            </div>
            <p class="copyright clear-float">
              © Delicious Theme. All Rights Reserved
              <div class="credits">
                <!--
                  All the links in the footer should remain intact.
                  You can delete the links only if you purchased the pro version.
                  Licensing information: https://bootstrapmade.com/license/
                  Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/buy/?theme=Delicious
                -->
                Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
              </div>
            </p>
          </div>
        </div>
      </div>
    </div>
  </footer>
  <!-- / footer -->

  <script src="js/jquery.min.js"></script>
  <script src="js/jquery.easing.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
  <script src="js/custom.js"></script>
  <script src="contactform/contactform.js"></script>


</body>

</html>
