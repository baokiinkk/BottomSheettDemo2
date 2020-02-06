package com.example.bottomsheett

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ModalBottomSheet : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_modal_bottom_sheet)
    }

    fun hienSheet(v: View) {
        BottomFrag().show(supportFragmentManager,"bottomsheet")

    }
}
