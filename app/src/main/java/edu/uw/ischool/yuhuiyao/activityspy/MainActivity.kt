package edu.uw.ischool.yuhuiyao.activityspy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    private val TAG: String = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i(TAG, "onCreate event fired")

        setContentView(R.layout.activity_main)
    }
    override fun onStart() {
        super.onStart()
        // Log the event
        Log.i(TAG, "onStart event fired")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy event fired")
        Log.e(TAG, "We're going down, Captain!")
    }

    override fun onStop() {
        super.onStop()
        // Log the event
        Log.i(TAG, "onStop event fired")
    }

    override fun onPause() {
        super.onPause()
        // Log the event
        Log.i(TAG, "onPause event fired")
    }

    override fun onResume() {
        super.onResume()
        // Log the event
        Log.i(TAG, "onResume event fired")
    }
}