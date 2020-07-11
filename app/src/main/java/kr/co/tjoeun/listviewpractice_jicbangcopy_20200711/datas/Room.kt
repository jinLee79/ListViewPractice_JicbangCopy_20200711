package kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.datas

import java.text.NumberFormat
import kotlin.math.round

class Room (
    val price:Int,
    val address:String,
    val floor:Int,
    val description:String ){

    fun getPriceTxt(): String{
        var priceTxt = NumberFormat.getInstance().format(price)
//        12000 -> 1억 2000  | 132000 -> 13억 2000
        if (price >= 10000) {
            var eok = round((price/10000).toDouble())

        }
        return priceTxt
    }
    fun getAddressAndFloorTxt() : String{
        return address + ", " + floor + "층"
    }

}