package com.example.bible_readandlearn

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.rezultat.*

class RezultatActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rezultat)

        val totalQuestions = intent.getIntExtra(Întrebări_geneza.TOTAL_ÎNTREBĂRI, 0)
        val correctAnswers = intent.getIntExtra(Întrebări_geneza.SCOR, 0)

        tv_scor.text = "Scorul tău este: $correctAnswers din $totalQuestions"

        btn_rezultat.setOnClickListener{
            startActivity(Intent(this, genezaActivity::class.java))
        }
    }
}