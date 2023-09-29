package com.example.nesnetabnliprogramlama

class Odev_6 {

    fun maasHesaplama(gunSayisi:Int):Int{
      val calismaSaati = gunSayisi*8
        var maas=0
      if (calismaSaati>160){
          val mesaiFazlasi=calismaSaati-160
          maas =(160*10)+(mesaiFazlasi*20)


      } else{
          maas=calismaSaati*10
      }
    return maas
    }

    }



