package com.example.suksesdidikan

data class Rekomen (
    val avatar: Int, // URL avatar (gambar)
    val matapelajaran: String, // Nama
    val kelas: String
)

// Contoh data dummy
val dummyList: List<Rekomen> = listOf(
    Rekomen(R.drawable.agama, "Agama", "IX"),
    Rekomen(R.drawable.bing, "Bahasa Inggris", "VII"),
    Rekomen(R.drawable.ppkn,"PPKN","VIII")
)