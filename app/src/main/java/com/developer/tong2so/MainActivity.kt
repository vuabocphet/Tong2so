package com.developer.tong2so

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tinhtong.setOnClickListener(View.OnClickListener {

            if (edt_1.text.toString().isNullOrEmpty() ||edt_2.text.toString().isNullOrEmpty()){
                Toast.makeText(this,"Vui lòng điền",Toast.LENGTH_SHORT).show()
                return@OnClickListener
            }

            val ketqua=(edt_1.text.toString().toInt()+edt_2.text.toString().toInt()).toString()
            val intent=Intent(this,Main2Activity::class.java)
            intent.putExtra("KETQUA",ketqua)
            startActivity(intent)

            //ketqua.text="Tổng 2 số là :"+(edt_1.text.toString().toInt()+edt_2.text.toString().toInt()).toString()

        })



    }
}


