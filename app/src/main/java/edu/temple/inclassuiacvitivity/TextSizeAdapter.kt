package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Spinner
import android.widget.TextView

class TextSizeAdapter(private val _context: Context, private val _numbers: Array<Int>) : BaseAdapter() {

    override fun getCount(): Int {
        return _numbers.size
    }

    override fun getItem(position: Int): Any {
        return _numbers[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        if(convertView == null){
            textView = TextView(_context)
        } else {
            textView = convertView as TextView

        }
        textView.text = _numbers[position].toString()


        return textView

    }

    override fun getDropDownView(position: Int, convertView: View?, parent: ViewGroup?): View  =
        getView(position, convertView, parent).apply {
            (this as TextView).textSize = _numbers[position].toFloat()

        }
    }

