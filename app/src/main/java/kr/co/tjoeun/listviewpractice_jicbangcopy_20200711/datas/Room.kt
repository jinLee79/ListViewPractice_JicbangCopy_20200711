package kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.datas

import java.text.NumberFormat
import kotlin.math.round

class Room (
    val price:Int,
    val address:String,
    val floor:Int,
    val description:String ){

    fun getFormattedFloor() : String {
        if (floor > 0) {
            return "${this.floor}층"
        }
        else if (floor == 0) {
            return "반지하"
        }
        else {
            return "지하 ${-this.floor}층"
        }

    }


    fun getFormattedPrice(): String {
        var priceTxt = NumberFormat.getInstance().format(price)
//        12000 -> 1억 2000  | 132000 -> 13억 2000
        if (price >= 10000) {
            val eok = round((price/10000).toDouble())

            priceTxt = eok.toString()
        }
        return priceTxt
    }

}