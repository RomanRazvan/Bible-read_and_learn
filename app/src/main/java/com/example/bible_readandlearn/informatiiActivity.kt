package com.example.bible_readandlearn
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.informatii.*

class informatiiActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.informatii)

        val actionBar = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)

        PP.setOnClickListener{
            startActivity(Intent(this, profetisiregicap2Activity::class.java))
        }
        VI.setOnClickListener{
            startActivity(Intent(this, viataluiisusnastereActivity::class.java))
        }

    }}