package com.example.myapplication

import android.content.Context
import android.widget.Toast

class Car {
    var tirecnt = 4
    var name = "람보르기니"
    var engineName = "슈퍼카엔진"

    fun start(context: Context){

        Toast.makeText(context, name+"싫어", Toast.LENGTH_SHORT).show()
    }
}