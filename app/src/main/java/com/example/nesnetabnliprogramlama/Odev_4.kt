package com.example.nesnetabnliprogramlama

class Odev_4 {

    fun kelimeadeti(kelime:String,harf:Char){//Ankara , A

        var sonuc=0

        for (k in kelime){//Hocanın videosundan izleyerek yaptım kendim bu sistemi oluşturamadım
            if (k==harf)
                sonuc=sonuc+1

        }

       println("Harf adeti: $sonuc")

    }



}