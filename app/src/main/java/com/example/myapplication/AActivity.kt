package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

/**
 * 공부할거
 * Class, ArrayList, Toast, Log
 * Class- Car클래스 만들어서 내부에 변수선언
 * 변수는 차주인(CarOwner), 바퀴갯수(TireCnt), 창문갯수(WindowCnt), 최대속도 (MaxSpeed)
 *  -> start()함수 만들어서 함수호출하면 최대속도 올라가도록
 *
 * ArrayList - Int형, Double형, String형 하나씩 만들어서
 * Button누르면 ArrayList에다가 값이 추가되고 다른버튼누르면 arrayList마지막 값이 사라지도록
 *
 * Toast는 버튼누르면 경고 텍스트가 적힌 알림창 표시
 *
 * Log도 버튼누르면 Logcat에 문자적히도록 만들기
 *
 * LinearLayout, RelativeLayout, ConstraintLayout
 */


class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aactivity)
        var textView : TextView? = findViewById(R.id.first)
        textView?.text = "second"
var textform : EditText = findViewById(R.id.textform)
        var textview1: TextView = findViewById(R.id.textview1)
        var button : Button? = findViewById(R.id.button)


        var button01 : Button? = findViewById(R.id.button01)
    var linear00 = findViewById<TextView>(R.id.linear00)
        var linear01 = findViewById<TextView>(R.id.linear01)
        var linear02 = findViewById<TextView>(R.id.linear02)
        var linear03 = findViewById<TextView>(R.id.linear03)
        var linear04 = findViewById<TextView>(R.id.linear04)
        var linear05 = findViewById<TextView>(R.id.linear05)

        val arrayList = arrayListOf(linear00, linear01, linear02, linear03, linear04, linear05)
        var count = 0
        button01?.setOnClickListener {
            for (textvalue in arrayList) {
                count = count + 1
                textvalue.text = count.toString()
            }
            Log.i("tftf","jji")
        }
        button?.setOnClickListener {


            textview1.setText(textform.text.toString() +"&"+ linear00.text.toString())
        }

        var car01 = Car()
        var car02 = Car()
        car01.name = "현대차"
        car02.name = "기아차"

        var button_a1 : Button = findViewById(R.id.button_a1)
        var button_a2 : Button = findViewById(R.id.button_a2)
        button_a1.setOnClickListener {
            car01.start(this)
        }

        button_a2.setOnClickListener {
            car02.start(this)
        }

var button04 : Button = findViewById(R.id.button04)
        button04.setOnClickListener {
            startActivity(Intent(this, RandomActivity::class.java))

        }
    }


}