<?php

	if($_SERVER['REQUEST_METHOD']=='POST'){
		//MEndapatkan Nilai Dari Variable
		$id = $_POST['id'];
		$name = $_POST['name'];
		$nik = $_POST['nik'];
		$alamat = $_POST['alamat'];

		//import file koneksi database
		require_once('koneksi.php');

		//Membuat SQL Query
		$sql = "UPDATE anggota SET name = '$name', nik = '$nik', alamat = '$alamat' WHERE id = $id;";

		//Meng-update Database
		if(mysqli_query($con,$sql)){
			echo 'Berhasil Update Data Anggota';
		}else{
			echo 'Gagal Update Data Anggota';
		}

		mysqli_close($con);
	}
?>