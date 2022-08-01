package com.example.bible_readandlearn
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.carti.*

class cartiActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.carti)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        geneza.setOnClickListener {
            startActivity(Intent(this, genezaActivity::class.java))
        }
      }}