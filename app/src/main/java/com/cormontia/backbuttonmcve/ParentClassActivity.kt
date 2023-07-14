package com.cormontia.backbuttonmcve

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback

open class ParentClassActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parent_class)

        onBackPressedDispatcher.addCallback(
            this,
            object: OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    doMyStuff()
                }
            }
        )
    }


    private fun doMyStuff() {
        //Log.i("ParentClassActivity.kt", "My class is $this")
        Toast.makeText(this, "Parent class back button pressed", Toast.LENGTH_SHORT).show()
        //super.onBackPressed()
    }

    /*
    override fun onBackPressed() {
        super.onBackPressed()
        doMyStuff()
    }
     */
}