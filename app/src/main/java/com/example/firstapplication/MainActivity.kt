package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seasons: List<String> = listOf("春", "夏", "秋", "冬")
        var count = 0
        val maxIndex = seasons.size

        nextButton.setOnClickListener {
            count++
          mainText.text = seasons[count % maxIndex]
        }
        previousButton.setOnClickListener {
            count--
          if (count < 0) {
              count = maxIndex - 1
          }
          mainText.text = seasons[count % maxIndex]
        }
    }
}
