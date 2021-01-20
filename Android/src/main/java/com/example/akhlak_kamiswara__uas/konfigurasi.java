package com.example.akhlak_kamiswara__uas;

public class konfigurasi {

    //Dibawah ini merupakan Pengalamatan dimana Lokasi Skrip CRUD PHP disimpan
    //Pada tutorial Kali ini, karena kita membuat localhost maka alamatnya tertuju ke IP komputer
    //dimana File PHP tersebut berada
    //PENTING! JANGAN LUPA GANTI IP SESUAI DENGAN IP KOMPUTER DIMANA DATA PHP BERADA
    public static final String URL_ADD="http://192.168.43.243/perpustakaan_uas/tambahAnggota.php";
    public static final String URL_GET_ALL = "http://192.168.43.243/perpustakaan_uas/tampilSemuaAnggota.php";
    public static final String URL_GET_EMP = "http://192.168.43.243/perpustakaan_uas/tampilAnggota.php?id=";
    public static final String URL_UPDATE_EMP = "http://192.168.43.243/perpustakaan_uas/updateAnggota.php";
    public static final String URL_DELETE_EMP = "http://192.168.43.243/perpustakaan_uas/hapusAnggota.php?id=";

    //Dibawah ini merupakan Kunci yang akan digunakan untuk mengirim permintaan ke Skrip PHP
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "name";
    public static final String KEY_EMP_NIK = "nik";
    public static final String KEY_EMP_ALAMAT = "alamat";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAMA = "name";
    public static final String TAG_NIK = "nik";
    public static final String TAG_ALAMAT = "alamat";

    public static final String EMP_ID = "emp_id";
}