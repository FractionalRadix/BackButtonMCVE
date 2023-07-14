package com.cormontia.backbuttonmcve

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.OnBackPressedCallback

class ChildClassActivity : ParentClassActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_child_class)

        onBackPressedDispatcher.addCallback(
            this,
            object: OnBackPressedCallback(true) {
                override fun handleOnBackPressed() {
                    //this.isEnabled = false
                    doMyStuff()
                    //this.isEnabled = true
                    //this@ChildClassActivity.onBackPressedDispatcher.onBackPressed()
                    //superclassOnBackPressedDispatcher.onBackPressed()
                    //this@ChildClassActivity.finish()
                    finish()
                }
            }


            //MyOnBackPressedCallback(this, true)
        )


    }

    /*
    override fun onBackPressed() {
        super.onBackPressed()
        doMyStuff()
    }
     */

    private fun doMyStuff() {
        //Log.i("ChildClassActivity.kt", "Logging from child class.")
        //Log.i("ChildClassActivity.kt", "My class is $this")
        Toast.makeText(this, "Child class back button pressed", Toast.LENGTH_SHORT).show()
        //super.onBackPressed()
    }
}

