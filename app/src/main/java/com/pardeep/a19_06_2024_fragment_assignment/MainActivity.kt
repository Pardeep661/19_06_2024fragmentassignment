package com.pardeep.a19_06_2024_fragment_assignment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.pardeep.a19_06_2024_fragment_assignment.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var binding : ActivityMainBinding?= null
    var activityInterface : changeButtonText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        binding?.redButton?.setOnClickListener {
            activityInterface?.fragmentButtonText()
        }

        binding?.blueButton?.setOnClickListener {
            activityInterface?.fragmentButtonText()
        }

        binding?.greenButton?.setOnClickListener {
            activityInterface?.fragmentButtonText()
        }
        binding?.ActivityPassBtn?.setOnClickListener {
            activityInterface?.fragmentButtonText()
        }
        binding?.actCounter?.setOnClickListener {

            activityInterface?.fragmentButtonText()
        }




        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun changeButtonText(text:String) {
        binding?.actUsername?.setText(text)
    }

    fun changeCounterData() {
        var counter_data = binding?.actCounter?.text?.trim().toString()
        var int_data = counter_data.toInt()
        var inc_data = int_data +1
        binding?.actCounter?.setText(inc_data)
    }


}