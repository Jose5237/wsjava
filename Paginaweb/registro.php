<?php

	$name=$_POST['name'];
	$date=$_POST['date'];
	$email= $_POST['email'];
	$time=$_POST['time'];
	$phone=$_POST['phone'];
	$people=$_POST['people'];
	$message=$_POST['message'];
	




	require("connect_db.php");
//la variable  $mysqli viene de connect_db que lo traigo con el require("connect_db.php");
	
				$checkemail=mysqli_query($mysqli,"SELECT * FROM reserva WHERE nombre='$name'");
	            $check_mail=mysqli_num_rows($checkemail);
				//require("connect_db.php");
//la variable  $mysqli viene de connect_db que lo traigo con el require("connect_db.php");
				mysqli_query($mysqli,"INSERT INTO reserva VALUES('','$name','$email','$phone','$message','$date','$time','$people')");
				//echo 'Se ha registrado con exito';
				echo ' <script language="javascript">alert("reserva realizada  con éxito");</script> ';
				
			

	
?>