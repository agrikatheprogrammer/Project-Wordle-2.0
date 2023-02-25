package com.example.lab1android

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.content.ContextCompat
import nl.dionsegijn.konfetti.core.Party
import nl.dionsegijn.konfetti.core.Position
import nl.dionsegijn.konfetti.core.emitter.Emitter
import nl.dionsegijn.konfetti.xml.KonfettiView
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {
    var counter=0
    var truth=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val submit=findViewById<ImageView>(R.id.submit1)
        var konfetti = findViewById<KonfettiView>(R.id.konfettiView)
        val theList=FourLetterWordList.FourLetterWordList
        var wordToGuess=theList.getRandomFourLetterWord()
        var ch1= wordToGuess[0]
        var ch2=wordToGuess[1]
        var ch3=wordToGuess[2]
        var ch4=wordToGuess[3]
        val Reset=findViewById<ImageView>(R.id.reset1)
        val corr=findViewById<TextView>(R.id.jojo)

        submit.setOnClickListener {
            var correctOrNah=false
            var text1id1 = findViewById<EditText>(R.id.text1id1).text.toString().uppercase()
            var text1id2=  findViewById<EditText>(R.id.text1id2).text.toString().uppercase()
            var text1id3=  findViewById<EditText>(R.id.text1id3).text.toString().uppercase()
            var text1id4=  findViewById<EditText>(R.id.text1id4).text.toString().uppercase()

            var text2id1 = findViewById<EditText>(R.id.text2id1).text.toString().uppercase()
            var text2id2=  findViewById<EditText>(R.id.text2id2).text.toString().uppercase()
            var text2id3=  findViewById<EditText>(R.id.text2id3).text.toString().uppercase()
            var text2id4=  findViewById<EditText>(R.id.text2id4).text.toString().uppercase()

            var text3id1 = findViewById<EditText>(R.id.text3id1).text.toString().uppercase()
            var text3id2=  findViewById<EditText>(R.id.text3id2).text.toString().uppercase()
            var text3id3=  findViewById<EditText>(R.id.text3id3).text.toString().uppercase()
            var text3id4=  findViewById<EditText>(R.id.text3id4).text.toString().uppercase()

            if (text1id1!=""&&text1id2!=""&&text1id3!=""&&text1id4!=""&&counter==0) {
                    if (ch1==text1id1[0]) {
                        findViewById<EditText>(R.id.text1id1).setBackgroundColor(Color.parseColor("#00FF00"))
                        truth += 1
                    } else if (text1id1 in wordToGuess) {
                        findViewById<EditText>(R.id.text1id1).setBackgroundColor(Color.parseColor("#FFFF00"))
                    } else {
                        findViewById<EditText>(R.id.text1id1).setBackgroundColor(Color.parseColor("#808080")) }
                    if (ch2==text1id2[0]) {
                        findViewById<EditText>(R.id.text1id2).setBackgroundColor(Color.parseColor("#00FF00"))
                        truth += 1
                    } else if (text1id2 in wordToGuess) {
                        findViewById<EditText>(R.id.text1id2).setBackgroundColor(Color.parseColor("#FFFF00"))
                    } else {
                        findViewById<EditText>(R.id.text1id2).setBackgroundColor(Color.parseColor("#808080"))
                    }
                    if (ch3==text1id3[0]) {
                        findViewById<EditText>(R.id.text1id3).setBackgroundColor(Color.parseColor("#00FF00"))
                        truth += 1
                    } else if (text1id3 in wordToGuess) {
                        findViewById<EditText>(R.id.text1id3).setBackgroundColor(Color.parseColor("#FFFF00"))
                    } else {
                        findViewById<EditText>(R.id.text1id3).setBackgroundColor(
                            Color.parseColor("#808080"))
                    }
                    if (ch4==text1id4[0]) {
                        findViewById<EditText>(R.id.text1id4).setBackgroundColor(Color.parseColor("#00FF00"))
                        truth += 1
                    } else if (text1id4 in wordToGuess) {
                        findViewById<EditText>(R.id.text1id4).setBackgroundColor(Color.parseColor("#FFFF00"))
                    } else {
                        findViewById<EditText>(R.id.text1id4).setBackgroundColor(Color.parseColor("#808080")) }
                    if (truth == 4) {
                        correctOrNah = true
                         }
                    counter+=1
                if (!correctOrNah) {
                        findViewById<EditText>(R.id.text2id1).visibility= View.VISIBLE
                        findViewById<EditText>(R.id.text2id2).visibility=View.VISIBLE
                        findViewById<EditText>(R.id.text2id3).visibility=View.VISIBLE
                    findViewById<EditText>(R.id.text2id4).visibility=View.VISIBLE
                    findViewById<TextView>(R.id.textView2).visibility=View.VISIBLE
                    } else {
                    konfetti.start(
                        Party(speed = 0f, maxSpeed = 30f, damping = 0.9f, spread = 360, colors = listOf(0xfce18a, 0xff726d, 0xf4306d, 0xb48def), emitter = Emitter(duration = 100, TimeUnit.MILLISECONDS).max(100), position = Position.Relative(0.5, 0.3)))
                    Toast.makeText(applicationContext, "You won! Congratulations!", Toast.LENGTH_SHORT).show()
                    counter=0
                    Reset.visibility=View.VISIBLE
                    submit.visibility=View.INVISIBLE
                    corr.text=wordToGuess
                    corr.visibility=View.VISIBLE
                    }}

                else if (text2id1!=""&&text2id2!=""&&text2id3!=""&&text2id4!=""&&counter==1) {
                if (ch1==text2id1[0]) {
                    findViewById<EditText>(R.id.text2id1).setBackgroundColor(Color.parseColor("#00FF00"))
                    truth += 1
                } else if (text2id1 in wordToGuess) {
                    findViewById<EditText>(R.id.text2id1).setBackgroundColor(Color.parseColor("#FFFF00"))
                } else {
                    findViewById<EditText>(R.id.text2id1).setBackgroundColor(Color.parseColor("#808080")) }
                if (ch2==text2id2[0]) {
                    findViewById<EditText>(R.id.text2id2).setBackgroundColor(
                        Color.parseColor("#00FF00")
                    )
                    truth += 1
                } else if (text2id2 in wordToGuess) {
                    findViewById<EditText>(R.id.text2id2).setBackgroundColor(Color.parseColor("#FFFF00"))
                } else {
                    findViewById<EditText>(R.id.text2id2).setBackgroundColor(
                        Color.parseColor("#808080")
                    )
                }
                if (ch3==text2id3[0]) {
                    findViewById<EditText>(R.id.text2id3).setBackgroundColor(
                        Color.parseColor("#00FF00")
                    )
                    truth += 1
                } else if (text2id3 in wordToGuess) {
                    findViewById<EditText>(R.id.text2id3).setBackgroundColor(Color.parseColor("#FFFF00"))
                } else {
                    findViewById<EditText>(R.id.text2id3).setBackgroundColor(
                        Color.parseColor("#808080")
                    )
                }
                if (ch4==text2id4[0]) {
                    findViewById<EditText>(R.id.text2id4).setBackgroundColor(
                        Color.parseColor("#00FF00")
                    )
                    truth += 1
                } else if (text2id4 in wordToGuess) {
                    findViewById<EditText>(R.id.text2id4).setBackgroundColor(Color.parseColor("#FFFF00"))
                } else {
                    findViewById<EditText>(R.id.text2id4).setBackgroundColor(Color.parseColor("#808080")) }
                if (truth == 4) {
                    correctOrNah = true
                     }
                counter++
                if (!correctOrNah) {
                    findViewById<EditText>(R.id.text3id1).visibility = View.VISIBLE
                    findViewById<EditText>(R.id.text3id2).visibility = View.VISIBLE
                    findViewById<EditText>(R.id.text3id3).visibility = View.VISIBLE
                    findViewById<EditText>(R.id.text3id4).visibility = View.VISIBLE
                    findViewById<TextView>(R.id.textView3).visibility = View.VISIBLE } else {
                        counter=0
                    konfetti.start(Party(speed = 0f, maxSpeed = 30f, damping = 0.9f, spread = 360, colors = listOf(0xfce18a, 0xff726d, 0xf4306d, 0xb48def), emitter = Emitter(duration = 100, TimeUnit.MILLISECONDS).max(100), position = Position.Relative(0.5, 0.3)))
                    Toast.makeText(applicationContext, "You won! Congratulations!", Toast.LENGTH_SHORT).show()
                    Reset.visibility=View.VISIBLE
                    submit.visibility=View.INVISIBLE
                    corr.text=wordToGuess
                    corr.visibility=View.VISIBLE
                    }

                } else if (text3id1!=""&&text3id2!=""&&text3id3!=""&&text3id4!=""&&counter==2) {
                    if (ch1==text3id1[0]) {
                        findViewById<EditText>(R.id.text3id1).setBackgroundColor(
                            Color.parseColor("#00FF00")
                        )
                        truth += 1
                    } else if (text3id1 in wordToGuess) {
                        findViewById<EditText>(R.id.text3id1).setBackgroundColor(
                            Color.parseColor("#FFFF00")
                        )
                    } else {
                        findViewById<EditText>(R.id.text3id1).setBackgroundColor(
                            Color.parseColor("#808080")
                        )
                    }
                    if (ch2==text3id2[0]) {
                        findViewById<EditText>(R.id.text3id2).setBackgroundColor(
                            Color.parseColor("#00FF00")
                        )
                        truth += 1
                    } else if (text3id2 in wordToGuess) {
                        findViewById<EditText>(R.id.text3id2).setBackgroundColor(Color.parseColor("#FFFF00"))
                    } else {
                        findViewById<EditText>(R.id.text3id2).setBackgroundColor(
                            Color.parseColor("#808080")
                        )
                    }
                    if (ch3==text3id3[0]) {
                        findViewById<EditText>(R.id.text3id3).setBackgroundColor(
                            Color.parseColor("#00FF00")
                        )
                        truth += 1
                    } else if (text3id3 in wordToGuess) {
                        findViewById<EditText>(R.id.text3id3).setBackgroundColor(Color.parseColor("#FFFF00"))
                    } else {
                        findViewById<EditText>(R.id.text3id3).setBackgroundColor(
                            Color.parseColor("#808080")
                        )
                    }
                    if (ch4==text3id4[0]) {
                        findViewById<EditText>(R.id.text3id4).setBackgroundColor(
                            Color.parseColor("#00FF00")
                        )
                        truth += 1
                    } else if (text3id4 in wordToGuess) {
                        findViewById<EditText>(R.id.text3id4).setBackgroundColor(Color.parseColor("#FFFF00"))
                    } else {
                        findViewById<EditText>(R.id.text3id4).setBackgroundColor(
                            Color.parseColor("#808080")
                        )
                    }
                    counter=0
                    if (truth < 4) {
                        Toast.makeText(applicationContext, "You lost! The word was "+wordToGuess, Toast.LENGTH_SHORT)
                            .show()
                        Reset.visibility=View.VISIBLE
                        submit.visibility=View.INVISIBLE
                        corr.text=wordToGuess
                        corr.visibility=View.VISIBLE
                    } else {
                        konfetti.start(Party(speed = 0f, maxSpeed = 30f, damping = 0.9f, spread = 360, colors = listOf(0xfce18a, 0xff726d, 0xf4306d, 0xb48def), emitter = Emitter(duration = 100, TimeUnit.MILLISECONDS).max(100), position = Position.Relative(0.5, 0.3)))
                        Toast.makeText(applicationContext, "You won! Congratulations!", Toast.LENGTH_SHORT).show()
                        Reset.visibility=View.VISIBLE
                        submit.visibility=View.INVISIBLE
                        corr.text=wordToGuess
                        corr.visibility=View.VISIBLE }

                } else {
                    Toast.makeText(applicationContext, "Input is not valid!", Toast.LENGTH_SHORT).show() }

            truth=0 }

            Reset.setOnClickListener {
                truth=0
                counter=0
                wordToGuess=theList.getRandomFourLetterWord()
                ch1=wordToGuess[0]
                ch2=wordToGuess[1]
                ch3=wordToGuess[2]
                ch4=wordToGuess[3]
                corr.visibility=View.INVISIBLE
                corr.text=wordToGuess
                findViewById<EditText>(R.id.text1id1).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text1id1).setText("")
                findViewById<EditText>(R.id.text1id2).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text1id2).setText("")
                findViewById<EditText>(R.id.text1id3).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text1id3).setText("")
                findViewById<EditText>(R.id.text1id4).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text1id4).setText("")
                findViewById<EditText>(R.id.text2id1).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text2id1).setText("")
                findViewById<EditText>(R.id.text2id2).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text2id2).setText("")
                findViewById<EditText>(R.id.text2id3).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text2id3).setText("")
                findViewById<EditText>(R.id.text2id4).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text2id4).setText("")
                findViewById<EditText>(R.id.text3id1).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text3id1).setText("")
                findViewById<EditText>(R.id.text3id2).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text3id2).setText("")
                findViewById<EditText>(R.id.text3id3).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text3id3).setText("")
                findViewById<EditText>(R.id.text3id4).setBackgroundColor(Color.parseColor("#FFBB86FC"))
                findViewById<EditText>(R.id.text3id4).setText("")
                findViewById<EditText>(R.id.text2id1).visibility=View.INVISIBLE
                findViewById<EditText>(R.id.text2id2).visibility=View.INVISIBLE
                findViewById<EditText>(R.id.text2id3).visibility=View.INVISIBLE
                findViewById<EditText>(R.id.text2id4).visibility=View.INVISIBLE
                findViewById<EditText>(R.id.text3id1).visibility=View.INVISIBLE
                findViewById<EditText>(R.id.text3id2).visibility=View.INVISIBLE
                findViewById<EditText>(R.id.text3id3).visibility=View.INVISIBLE
                findViewById<EditText>(R.id.text3id4).visibility=View.INVISIBLE
                findViewById<TextView>(R.id.textView2).visibility=View.INVISIBLE
                findViewById<TextView>(R.id.textView3).visibility=View.INVISIBLE
                findViewById<ImageView>(R.id.submit1).visibility=View.VISIBLE
                findViewById<ImageView>(R.id.reset1).visibility=View.INVISIBLE }
            }
}
