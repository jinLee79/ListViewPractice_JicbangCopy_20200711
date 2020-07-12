package kr.co.tjoeun.listviewpractice_jicbangcopy_20200711

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.adapters.RoomAdapter
import kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.datas.Room

class MainActivity : BaseActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mAdapter : RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

        roomListView.setOnItemClickListener { parent, view, position, id ->
//            어떤 방을 선택했는지
            val clickedRoom = mRoomList[position]

//            상세 화면으로 진입
            val myIntent = Intent(mContext, ViewRoomDetailActivity::class.java)
            myIntent.putExtra("room", clickedRoom)  // Serializable 사용
            startActivity(myIntent)

        }
    }

    override fun setValues() {
        mRoomList.add(Room(26700, "서울시 은평구", 4, "서울시 은평구의 4층 방입니다."))
        mRoomList.add(Room(7600, "서울시 동작구", -1, "지하에 살래?"))
        mRoomList.add(Room(335550, "서울시 강남구", 13, "서울시 강남구의 펜트하우스입니다."))
        mRoomList.add(Room(266600, "서울시 강서구", 0, "서울시 강서구의 반지하 방입니다."))
        mRoomList.add(Room(800, "서울시 강동구", 1, "서울시 강동구 1층 방입니다."))
        mRoomList.add(Room(129900, "서울시 금천구", -1, "서울시 금천구 지하1층 방입니다."))
        mRoomList.add(Room(11111, "서울시 마포구", 3, "서울시 마포구 3층 방입니다."))
        mRoomList.add(Room(36200, "서울시 서대문구", 8, "서울시 서대문구 8층 방입니다."))
        mRoomList.add(Room(6160, "서울시 노원구", 6, "서울시 노원구 6층 방입니다."))
        mRoomList.add(Room(166700, "서울시 중구", 2, "서울시 중구 2층 방입니다."))
        mRoomList.add(Room(2670, "서울시 용산구", 1, "서울시 용산구 1층 방입니다."))
        mRoomList.add(Room(9678, "서울시 도봉구", -2, "서울시 도봉구 지하2층 방입니다."))
        mRoomList.add(Room(76800, "서울시 서초구", 5, "서울시 서초구 5층 방입니다."))

        mAdapter = RoomAdapter(mContext, R.layout.rooms_list_item, mRoomList)

        roomListView.adapter = mAdapter


    }


}