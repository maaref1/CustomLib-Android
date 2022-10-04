package com.mma.android.customutilexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mma.android.customlib.CustomBaseUtils

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CustomBaseUtils().sayHello("Hallo")
    }
}