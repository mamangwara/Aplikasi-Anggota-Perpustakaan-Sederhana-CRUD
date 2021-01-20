<?php

	if($_SERVER['REQUEST_METHOD']=='POST'){

		//Mendapatkan Nilai Variable
		$name = $_POST['name'];
		$nik = $_POST['nik'];
		$alamat = $_POST['alamat'];

		//Pembuatan Syntax SQL
		$sql = "INSERT INTO anggota (name,nik,alamat) VALUES ('$name','$nik','$alamat')";

		//Import File Koneksi database
		require_once('koneksi.php');

		//Eksekusi Query database
		if(mysqli_query($con,$sql)){
			echo 'Berhasil Menambahkan Anggota';
		}else{
			echo 'Gagal Menambahkan Anggota';
		}

		mysqli_close($con);
	}
?>