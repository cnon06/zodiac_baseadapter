package com.cnon.zodiac

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)




      setContentView(R.layout.activity_main)





     var zodiac = resources.getStringArray(R.array.zodiac)
        var zodiacDates = resources.getStringArray(R.array.zodiacDates)
        var zodiacImages = arrayOf(R.drawable.aries, R.drawable.taurus, R.drawable.gemini, R.drawable.cancer
                ,R.drawable.leo, R.drawable.virgo, R.drawable.libra, R.drawable.scorpio, R.drawable.sagittarius,
            R.drawable.capricorn,R.drawable.aquarius,R.drawable.pisces);

        var listView = findViewById<ListView>(R.id.listZodiac)


        //listView.adapter = zodiacArrayAdapter(this,R.layout.single_row,R.id.tvZodiacName,zodiac,zodiacDates,zodiacImages)
        listView.adapter = zodiacBaseAdapter(this)


        listView.setOnItemClickListener { adapterView, view, i, l ->
         //  val gecici = view as TextView
          //  Toast.makeText(this,gecici.text,Toast.LENGTH_SHORT).show()
           // println(gecici.text)
            println("fdfg")
        }



    }
    }







