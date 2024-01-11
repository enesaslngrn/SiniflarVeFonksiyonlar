package com.enesas.siniflarvefonksiyonlar

class Superkahraman(var isim: String, var yas: Int, var meslek: String) {

    private var sacininRengi = "Sarı"


    fun testFonksiyonu(){
        println("test fonksiyonu")
    }

    fun sacRengiAl(): String{

        return this.sacininRengi
    }

    //private(sadece yazdığım sınıf içinden ulaşılabilir) - protected(sadece Superkahraman.kt dosyasındaki classlardan ulaşılır)
    //internal(sadece kendi modulünden ulaşılır) - public(her yerden ulaşılabilir)

    /*
    var isim = ""
    var yas = 0
    var meslek = ""

    constructor(isim: String, yas: Int, meslek: String){

        this.isim = isim
        this.yas = yas
        this.meslek = meslek
        println("Constructor çağrıldı.")

    }
     */


}