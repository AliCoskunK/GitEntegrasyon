package com.example.nesnetabnliprogramlama

import androidx.compose.ui.graphics.vector.rememberVectorPainter

class Odev_3 {

    //3 =3*2*1

    fun faktoriyelHesaplama(sayi:Int):Int{

       var sonuc=1 //var dedim çünkü veri alacak ve 1 le başladım çünkü çarpma işlemi

        for (i in 1..sayi){
            sonuc = sonuc * i
        }
        return sonuc
    }


}