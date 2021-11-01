package com.example.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {

    var player = 1
    var pl1score = 0
    var pl2score = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val buttons = listOf<Button>(b1, b2, b3, b4, b5, b6, b7, b8, b9)


        player1score.text = pl1score.toString()
        player2score.text = pl2score.toString()


        b1.setOnClickListener {
            btnClick(b1)
        }
        b2.setOnClickListener {
            btnClick(b2)
        }
        b3.setOnClickListener {
            btnClick(b3)
        }
        b4.setOnClickListener {
            btnClick(b4)
        }
        b5.setOnClickListener {
            btnClick(b5)
        }
        b6.setOnClickListener {
            btnClick(b6)
        }
        b7.setOnClickListener {
            btnClick(b7)
        }
        b8.setOnClickListener {
            btnClick(b8)
        }
        b9.setOnClickListener {
            btnClick(b9)
        }

        reset.setOnClickListener {
            resetBoard()
        }
    }


    val selectedBtns = mutableListOf<Button>()

    private fun btnClick(button: Button) {
        if (button.text == "") {
            if (player == 1) {
                player = 2
                button.text = "X"
            } else {
                player = 1
                button.text = "O"
            }
        }
        selectedBtns.add(button)
        checkForX()
        checkForO()
        checkForDraw(selectedBtns)
    }

    fun checkForDraw(list : MutableList<Button>) {
        if (selectedBtns.size == 9) {
            Toast.makeText(this , "DRAW" , Toast.LENGTH_LONG).show()
            resetBoard()
        }
    }

        fun checkForX() {
            if (b1.text == "X" && b2.text == "X" && b3.text == "X" ) {
                Toast.makeText(this , "X won" , Toast.LENGTH_LONG).show()
                pl1score++
                player1score.text = pl1score.toString()
                resetBoard()

            }
            if (b1.text == "X" && b4.text == "X" && b7.text == "X" ) {
                Toast.makeText(this , "X won" , Toast.LENGTH_LONG).show()
                pl1score++
                player1score.text = pl1score.toString()
                resetBoard()
            }
            if (b1.text == "X" && b5.text == "X" && b9.text == "X" ) {
                Toast.makeText(this , "X won" , Toast.LENGTH_LONG).show()
                pl1score++
                player1score.text = pl1score.toString()
                resetBoard()
            }
            if (b4.text == "X" && b5.text == "X" && b6.text == "X" ) {
                Toast.makeText(this , "X won" , Toast.LENGTH_LONG).show()
                pl1score++
                player1score.text = pl1score.toString()
                resetBoard()
            }
            if (b2.text == "X" && b5.text == "X" && b8.text == "X" ) {
                Toast.makeText(this , "X won" , Toast.LENGTH_LONG).show()
                pl1score++
                player1score.text = pl1score.toString()
                resetBoard()
            }
            if (b3.text == "X" && b5.text == "X" && b7.text == "X" ) {
                Toast.makeText(this , "X won" , Toast.LENGTH_LONG).show()
                pl1score++
                player1score.text = pl1score.toString()
                resetBoard()
            }
            if (b3.text == "X" && b6.text == "X" && b9.text == "X" ) {
                Toast.makeText(this , "X won" , Toast.LENGTH_LONG).show()
                pl1score++
                player1score.text = pl1score.toString()
                resetBoard()
            }
            if (b7.text == "X" && b8.text == "X" && b9.text == "X" ) {
                Toast.makeText(this , "X won" , Toast.LENGTH_LONG).show()
                pl1score++
                player1score.text = pl1score.toString()
                resetBoard()

            }

        }


        fun checkForO() {
            if (b1.text == "O" && b2.text == "O" && b3.text == "O" ) {
                Toast.makeText(this , "0 won" , Toast.LENGTH_LONG).show()
                pl2score++
                player2score.text = pl2score.toString()
                resetBoard()
            }
            if (b1.text == "O" && b4.text == "O" && b7.text == "O" ) {
                Toast.makeText(this , "0 won" , Toast.LENGTH_LONG).show()
                pl2score++
                player2score.text = pl2score.toString()
                resetBoard()
            }
            if (b1.text == "O" && b5.text == "O" && b9.text == "O" ) {
                Toast.makeText(this , "0 won" , Toast.LENGTH_LONG).show()
                pl2score++
                player2score.text = pl2score.toString()
                resetBoard()
            }
            if (b4.text == "O" && b5.text == "O" && b6.text == "O" ) {
                Toast.makeText(this , "0 won" , Toast.LENGTH_LONG).show()
                pl2score++
                player2score.text = pl2score.toString()
                resetBoard()
            }
            if (b2.text == "O" && b5.text == "O" && b8.text == "O" ) {
                Toast.makeText(this , "0 won" , Toast.LENGTH_LONG).show()
                pl2score++
                player2score.text = pl2score.toString()
                resetBoard()
            }
            if (b3.text == "O" && b5.text == "O" && b7.text == "O" ) {
                Toast.makeText(this , "0 won" , Toast.LENGTH_LONG).show()
                pl2score++
                player2score.text = pl2score.toString()
                resetBoard()
            }
            if (b3.text == "O" && b6.text == "O" && b9.text == "O" ) {
                Toast.makeText(this , "0 won" , Toast.LENGTH_LONG).show()
                pl2score++
                player2score.text = pl2score.toString()
                resetBoard()
            }
            if (b7.text == "O" && b8.text == "O" && b9.text == "O" ) {
                Toast.makeText(this , "0 won" , Toast.LENGTH_LONG).show()
                pl2score++
                player2score.text = pl2score.toString()
                resetBoard()
            }

        }

    fun resetBoard() {
        player = 1
        val list = listOf<Button>(b1 , b2 , b3 ,b4 , b5,b6,b7,b8,b9)
        for (i in list) {
            i.text = ""
        }
    }


}