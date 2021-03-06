package kr.co.tjoeun.listviewpractice_jicbangcopy_20200711

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {  //상속만을 위한 클래스. 화면에 등장할 일 없게 abstract 처리

    val mContext = this

    abstract fun setupEvents()
    abstract fun setValues()

}