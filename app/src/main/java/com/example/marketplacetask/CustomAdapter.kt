package com.example.marketplacetask

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class CustomAdapter(
    var applicationContext: Context,
    var locations: Array<String>
) :
    BaseAdapter() {

    var layoutInflater = LayoutInflater.from(applicationContext)

    override fun getCount(): Int {
        return locations.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = layoutInflater.inflate(R.layout.item_spinner, parent, false)
        val textLocation = view.findViewById(R.id.textLocation) as TextView
        textLocation.text = locations[position]
        return view
    }


    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup): View {
        val view: View
        if (position == 0) {
            view = getView(position, convertView, parent)
            val iconArrow = view.findViewById(R.id.imageArrow) as ImageView
            iconArrow.setImageResource(R.drawable.ic_baseline_keyboard_arrow_up_24)

        } else {
            view = getView(position, convertView, parent)
            val iconArrow = view.findViewById(R.id.imageArrow) as ImageView
            iconArrow.setImageResource(R.color.white)
        }
        return view
    }

}

