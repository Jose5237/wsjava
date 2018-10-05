<?php
//include("connect_db.php");

//$miconexion = new connect_db;


session_start();
	require("connect_db.php");

	$username=$_POST['nombre'];
	$pass=$_POST['pass'];


	//la variable  $mysqli viene de connect_db que lo traigo con el require("connect_db.php");
	


	$sql=mysqli_query($mysqli,"SELECT * FROM empleados WHERE nombre='$username'");
	if($f=mysqli_fetch_assoc($sql)){
		if($pass==$f['contrasena']){
			$_SESSION['id_empleado']=$f['id_empleado'];
			$_SESSION['nombre']=$f['nombre'];
			

			header("Location: index.php");
		}else{
			echo '<script>alert("CONTRASEÑA INCORRECTA")</script> ';
		
			echo "<script>location.href='login.php'</script>";
		}
	}else{
		
		echo '<script>alert("ESTE USUARIO NO EXISTE, PORFAVOR REGISTRESE PARA PODER INGRESAR")</script> ';
		
		echo "<script>location.href='login.php'</script>";	

	}



	$sql2=mysqli_query($mysqli,"SELECT * FROM empleados WHERE nombre='$username'");
	if($f=mysqli_fetch_assoc($sql2)){
		if($pass==$f['contrasena']){
			$_SESSION['id_empleado']=$f['id_empleado'];
			$_SESSION['nombre']=$f['nombre'];
			

			header("Location: index.php");
		}else{
			echo '<script>alert("CONTRASEÑA INCORRECTA")</script> ';
		
			echo "<script>location.href='login.php'</script>";
		}
	}else{
		
		echo '<script>alert("ESTE USUARIO NO EXISTE, PORFAVOR REGISTRESE PARA PODER INGRESAR")</script> ';
		
		echo "<script>location.href='login.php'</script>";	

	}

?>