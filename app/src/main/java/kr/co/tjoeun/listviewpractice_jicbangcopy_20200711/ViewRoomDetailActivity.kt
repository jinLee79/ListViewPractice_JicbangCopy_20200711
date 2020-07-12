package kr.co.tjoeun.listviewpractice_jicbangcopy_20200711


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_view_room_detail.*
import kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.datas.Room

class ViewRoomDetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_room_detail)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        dialBtn.setOnClickListener {
//            폰번은 010-1111-2222 인걸로 가정
            val myUri = Uri.parse("tel: 010-1111-2222")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)

        }

    }

    override fun setValues() {
        val roomData = intent.getSerializableExtra("room") as Room  //Casting

        priceTxt.text = roomData.getFormattedPrice()
        descTxt.text = roomData.description

        addressTxt.text = roomData.address
        floorTxt.text = roomData.getFormattedFloor()

    }

}