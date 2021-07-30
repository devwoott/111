package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {


//    Kotlin edittext , Kotlin log
//    EditText 사용해보기
//    -> 문자열을 입력받아서 다른 TextView에 그대로 들어가도록
//    Log사용해보기
//    TextView 글자색변경, 주변 백그라운드색 변경
//


    //숫자를 나타내는애
    var a = 0

    var textview: TextView? = null
    var button: Button? = null
    var button1: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textview = findViewById(R.id.center_text)
        button = findViewById(R.id.click_btn)
        textview?.text = "efef"
        button?.setOnClickListener {
            Toast.makeText(this,"Button이 클릭됨",Toast.LENGTH_SHORT).show()
        }
        a = 1
        button1 = findViewById(R.id.click_btnA)
        button1?.setOnClickListener {
            startActivity(Intent(this, AActivity::class.java))
            finish()
        }


    }


}