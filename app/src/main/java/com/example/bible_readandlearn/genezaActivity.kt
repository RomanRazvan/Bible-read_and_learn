package com.example.bible_readandlearn
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.geneza.*

class genezaActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.geneza)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        geneza_1.setOnClickListener {
            startActivity(Intent(this, geneza_1Activity::class.java))
        }

        intrebari_geneza.setOnClickListener {
            startActivity(Intent(this, QuizQuestionActivity::class.java))
        }
    }}