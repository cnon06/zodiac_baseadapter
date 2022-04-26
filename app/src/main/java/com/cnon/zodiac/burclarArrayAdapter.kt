package com.cnon.zodiac

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.single_row.view.*


class zodiacArrayAdapter (var getContext: Context, resource: Int, textViewResourceId: Int, var zodiac: Array<String>,
                          var zodiacDate: Array<String>, var zodiacImage: Array<Int>)
    : ArrayAdapter<String>(getContext,resource, textViewResourceId, zodiac)

{

  //  private lateinit var binding:ActivityHomeBinding

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var single_row_view = convertView
        var viewHolder:viewHolder

        if(single_row_view==null)
        {
            val inflater = LayoutInflater.from(getContext)
            single_row_view = inflater.inflate(R.layout.single_row,parent,false)

            viewHolder = viewHolder(single_row_view)
            single_row_view.tag=viewHolder

        }

        else
        {
            viewHolder = single_row_view.getTag() as viewHolder


        }

        viewHolder.zodiacImageView.setImageResource(zodiacImage[position]);
        viewHolder.zodiacName.setText(zodiac[position])
        viewHolder.zodiacDate.setText(zodiacDate[position])

        Log.e("Inflater",zodiacDate[position])

        return single_row_view!!
    }


    class viewHolder(single_row_view: View)
    {
            var zodiacImageView : ImageView
            var zodiacName : TextView
            var zodiacDate : TextView

            init {
                this.zodiacImageView = single_row_view.imgZodiacSymbol
                this.zodiacName = single_row_view.tvZodiacName
                this.zodiacDate = single_row_view.tvZodiacDate
            }


    }


}