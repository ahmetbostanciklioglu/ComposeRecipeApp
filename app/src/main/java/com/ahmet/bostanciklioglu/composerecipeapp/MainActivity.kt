package com.ahmet.bostanciklioglu.composerecipeapp

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val TAG: String = "AppDebug"

    @Inject
    lateinit var app: BaseApplication
    @Inject
    lateinit var  someRandomString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: ${someRandomString}")
        Log.d(TAG, "onCreate: ${app}")
    }
}

