package com.cnon.zodiac

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.single_row.view.*


class zodiacArrayAdapter (var getContext: Context, resource: Int, textViewResourceId: Int, var zodiac: Array<String>,
                          var zodiacDate: Array<String>, var zodiacImage: Array<Int>)
    : ArrayAdapter<String>(getContext,resource, textViewResourceId, zodiac)

{

  //  private lateinit var binding:ActivityHomeBinding

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {


    //    binding = ActivityHomeBinding.inflate(layoutInflater)
     //   setContentView(binding.root)


        val inflater = LayoutInflater.from(getContext)
        val single_row_view = inflater.inflate(R.layout.single_row,parent,false)

        var zodiacImageView = single_row_view.imgZodiacSymbol
        var zodiacName = single_row_view.tvZodiacName
        var zodiacDate2 = single_row_view.tvZodiacDate


        zodiacImageView.setImageResource(zodiacImage[position])
        zodiacName.setText(zodiac[position])
        zodiacDate2.setText(zodiacDate[position])


        return single_row_view
    }



}