package com.example.fragmenttest

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPagerFragment = ViewPagerFragment()
        supportFragmentManager.beginTransaction().replace(R.id.container, viewPagerFragment).commit()
    }
}
