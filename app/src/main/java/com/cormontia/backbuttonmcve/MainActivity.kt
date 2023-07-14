package com.cormontia.backbuttonmcve

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val childClassActivityIntent = Intent(this, ChildClassActivity::class.java)
        startActivity(childClassActivityIntent)

        //val parentClassActivityIntent = Intent(this, ParentClassActivity::class.java)
        //startActivity(parentClassActivityIntent)
    }
}