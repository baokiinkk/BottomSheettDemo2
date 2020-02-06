package com.example.bottomsheett

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetBehavior
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var behavior: BottomSheetBehavior<View>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


         behavior = BottomSheetBehavior.from(bottomSheet)

    }

    fun moRong(v: View) {
        behavior.state = BottomSheetBehavior.STATE_EXPANDED
    }
    fun dong(v: View) {
        behavior.state = BottomSheetBehavior.STATE_COLLAPSED
    }

    fun toast(v: View) {
        Toast.makeText(applicationContext,"hien toast",Toast.LENGTH_SHORT).show()

    }

    fun chuyenAc(v: View) {
        startActivity(Intent(this,ModalBottomSheet::class.java))
    }
}
