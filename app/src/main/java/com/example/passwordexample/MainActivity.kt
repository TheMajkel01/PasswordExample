package com.example.passwordexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckedTextView
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        findViewById<Button>(R.id.checkButton).setOnClickListener {
            var password1 = findViewById<TextView>(R.id.password).text.toString()
            var password2 = findViewById<TextView>(R.id.confirmPassword).text.toString()

            if (password1==password2){
                findViewById<CheckedTextView>(R.id.matching).isChecked = true
            }
            else{
                findViewById<CheckedTextView>(R.id.matching).isChecked = false
            }

            if(password1.any { it.isUpperCase() }){
                findViewById<CheckedTextView>(R.id.uprCLetter).isChecked = true
            }
            else{
                findViewById<CheckedTextView>(R.id.uprCLetter).isChecked = false
            }

            if(password1.any { it.isLowerCase() }){
                findViewById<CheckedTextView>(R.id.lwrCLetter).isChecked = true
            }
            else{
                findViewById<CheckedTextView>(R.id.lwrCLetter).isChecked = false
            }

            if(password1.any{ it.isDigit() }){
                findViewById<CheckedTextView>(R.id.digit).isChecked = true
            }
            else{
                findViewById<CheckedTextView>(R.id.digit).isChecked = false
            }

            if(password1.any{ !it.isLetterOrDigit() }){
                findViewById<CheckedTextView>(R.id.special).isChecked = true
            }
            else{
                findViewById<CheckedTextView>(R.id.special).isChecked = false
            }
        }
    }
}