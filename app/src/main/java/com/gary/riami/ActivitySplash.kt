package com.gary.riami

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity

class ActivitySplash : AppCompatActivity(){
    val splash_tiempo = 2000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //indicar el xml se esta actividad
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            //despues de transcurrido el tiempo iniciar la actividad principal
            val principal = Intent(this, MainActivity::class.java)
            startActivity(principal)
            finish()
        }, splash_tiempo.toLong())
    }
}