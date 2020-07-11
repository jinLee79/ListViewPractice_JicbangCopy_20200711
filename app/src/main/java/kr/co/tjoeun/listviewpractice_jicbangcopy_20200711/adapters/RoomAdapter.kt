package kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.R
import kr.co.tjoeun.listviewpractice_jicbangcopy_20200711.datas.Room
import org.w3c.dom.Text

class RoomAdapter(val mContext:Context, val resId:Int, val mList:List<Room>) : ArrayAdapter<Room>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
//        재사용성 높이기
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = inf.inflate(R.layout.rooms_list_item, null)
        }

        val row = tempRow!!

        val priceTxt = row.findViewById<TextView>(R.id.priceTxt)
        val addressAndFloorTxt = row.findViewById<TextView>(R.id.addressTxt)
        val descTxt = row.findViewById<TextView>(R.id.descTxt)

        val data = mList[position]

        priceTxt.text = data.getFormattedPrice()
        addressAndFloorTxt.text = "${data.address}, ${data.getFormattedFloor()}"
        descTxt.text = data.description

        return row
    }
}