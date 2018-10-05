<?php

	require("connect_db.php");

//la variable  $mysqli viene de connect_db que lo traigo con el require("connect_db.php");
	
				$sql= "SELECT * FROM menu";
				$ejecutar = mysql_query($sql);
				if(!$ejecutar){
					echo "Error, eres un estupido. No sabes progamar";
				}
				else{
					$lista_datos = mysql_fetch_array($ejecutar);
				}
?>