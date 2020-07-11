package kr.co.tjoeun.listviewpractice_jicbangcopy_20200711

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.datas.Room

class MainActivity : BaseActivity() {

    val roomList = ArrayList<Room>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

    }


}