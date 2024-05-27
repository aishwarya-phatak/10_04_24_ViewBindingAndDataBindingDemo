package com.bitcode.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bitcode.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

//    private lateinit var txtAndroidBatch : TextView
//    private lateinit var image1 : ImageView
//    private lateinit var txtInfo : TextView
//    private lateinit var edtInfo : EditText
//    private lateinit var btnSetInfo : Button
//    private lateinit var chkEnableSettings : CheckBox
//    private lateinit var btnShowStudentDetails : Button

    private lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)
        activityMainBinding.btnSetInfo.setOnClickListener {
            activityMainBinding.txtInfo.text = activityMainBinding.edtInfo.text.toString()
        }
//        initViews()
    }

//    private fun initViews(){
//       txtAndroidBatch = findViewById(R.id.txtAndroidBatch)
//        image1 = findViewById(R.id.image1)
//        txtInfo = findViewById(R.id.txtInfo)
//        edtInfo = findViewById(R.id.edtInfo)
//        btnSetInfo = findViewById(R.id.btnSetInfo)
//        chkEnableSettings = findViewById(R.id.chkEnableSettings)
//        btnShowStudentDetails = findViewById(R.id.btnShowStudentDetails)
//    }
}