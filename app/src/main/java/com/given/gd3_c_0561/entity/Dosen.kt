package com.given.gd3_c_0561.entity

class Dosen(var name:String, var pengajar:String) {

    companion object{
        @JvmField
        var listofDosen= arrayOf(
            Dosen("Fedelis Brian","Pengajar Kelas A, B, dan D"),
            Dosen("Thomas Adi","Pengajar Kelas C"),
        )
    }
}