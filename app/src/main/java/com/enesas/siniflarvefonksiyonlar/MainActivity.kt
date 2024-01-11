package com.enesas.siniflarvefonksiyonlar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.enesas.siniflarvefonksiyonlar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private  lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        binding.button2.setOnClickListener {
            var carpma = carpma(10,10)
            binding.textView4.text = "Cevap: ${carpma}"
        }




        sinifCalismasi()
        nullGuveligi()
    }

    fun cikarma(x: Int, y: Int){
        binding.textView.text = "Cevap: ${x-y}"

    }
    fun toplama(a: Int, b:Int) : Int {
        return a + b

    }

    fun carpma(t: Int,k:Int) : Int{
        return t * k
    }

    fun degistir(view: View){
        cikarma(10,5)
        val toplama = toplama(20,10)
        binding.textView3.text = "Cevap: ${toplama}"

    }


    fun sinifCalismasi(){

        var superman = Superkahraman("Superman",50,"Gazeteci")

        binding.textView.text = "İsim: ${superman.isim}"
        binding.textView3.text = "Yaş: ${superman.yas}"
        binding.textView4.text = "Meslek: ${superman.meslek}"


        superman.testFonksiyonu()
        println(superman.sacRengiAl())

    }

    fun nullGuveligi(){
        //Null, Nullability, Null Safety

        var benimString : String? = null

        benimString = "Enes"

        var benimYasim : Int? = null
        println(benimYasim)

        //null mı değil mi anlamanın ilk yöntem

        if (benimYasim != null){
            println(benimYasim * 2)
        }else{
            println("Null ile 2 yi çarpmamam.")
        }


        // !! --> null olmayacak, ? --> null olabilir
        println(benimYasim?.times(2))

        //yöntem 3 elvis operatörü

        val sonuc = benimYasim?.times(2) ?:10 // eğer sonuç null geliyorsa 10 değerini alcak. Gelmiyorsa direkt 2 ile çarpıp sonucu verecek.
        println(sonuc)

        //yöntem 4 let

        benimYasim?.let {
            println(it * 2)
        }

    }

}