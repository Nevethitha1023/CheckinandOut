package com.example.checkinandout

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.checkinandout.ui.theme.CheckinandoutTheme

class MainActivity : ComponentActivity() {
    private lateinit var numberTextView:TextView
    private var number=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTextView = findViewById(R.id.numberTextView)
        val incrementButton:Button = findViewById(R.id.button)
        val decrementButton:Button=findViewById(R.id.button2)
        numberTextView.text = number.toString()
        incrementButton.setOnClickListener()
        {
            number++
            numberTextView.text = number.toString()
        }
        decrementButton.setOnClickListener()
        {
            number--
            numberTextView.text=number.toString()
        }

    }
    }