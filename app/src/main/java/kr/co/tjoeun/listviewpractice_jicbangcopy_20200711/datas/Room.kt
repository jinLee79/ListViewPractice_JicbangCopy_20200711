package kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.datas

import java.io.Serializable
import java.text.NumberFormat
import kotlin.math.round

class Room (
    val price:Int,
    val address:String,
    val floor:Int,
    val description:String ) : Serializable {    //Serializable interface implements 상태

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
        if (this.price >= 10000) {
//            28500 => 2억 8,500 형태로 가공.
//            2억 => 28500/10000 => 2
            val eok = this.price / 10000

//            8500 분리
//            28500 % 10000
            val rest = this.price % 10000

            return String.format("%d억 %,d", eok, rest)
        }
        else {
//            return NumberFormat.getInstance().format(price)
            return String.format("%,d", this.price)
        }

    }

}