package com.example.say_young

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var doubleClickFlag = 0;
    var CLICK_DELAY : Long = 250
    var flag = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setDoubleClick()
    }

    private fun setDoubleClick() {
        button_double_click.setOnClickListener {
            doubleClickFlag++
            val handler = Handler()
            val clickRunnable = Runnable {
                doubleClickFlag = 0
                //todo 클릭 이벤트
            }
            if (doubleClickFlag == 1) {
                handler.postDelayed(clickRunnable, CLICK_DELAY)
            }
            else if (doubleClickFlag == 2) {
                doubleClickFlag = 0
                //todo 더블클릭 이벤트
                if (flag == 0) {
                    button_1.isPressed = true
                    flag = 1
                }
                else if (flag == 1) {
                    button_1.isPressed = false
                    flag = 0
                }
                Log.d("doubleclicktest", "test")
            }
        }
    }
}