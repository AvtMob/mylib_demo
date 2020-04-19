package com.trip.jetpacktest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.trip.mylib.LatLonDistanceCalculator
import com.trip.mylib.Point


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buenosAiresObeliscoPoint = Point((-34.6037389).toFloat(), (-58.3815704).toFloat())

        val nycStatueOfLibertyPoint = Point(40.6892494.toFloat(), (-74.0445004).toFloat())

        val distanceBetweenPoints = LatLonDistanceCalculator.calculateDistance(
                buenosAiresObeliscoPoint,
                nycStatueOfLibertyPoint)
    }
}
